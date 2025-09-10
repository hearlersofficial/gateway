package com.hearlers.gateway;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.auth.exception.AuthUserNotFoundException;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.factory.OAuthProviderFactory;
import com.hearlers.gateway.port.AuthUserPort;
import com.hearlers.gateway.port.OAuthProviderPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthUserService implements AuthUserUseCase {
    private final OAuthProviderFactory oAuthProviderFactory;
    private final AuthUserPort authUserPort;

    @Override
    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return authUserPort.initializeUser(request);
    }


    @Override
    public String generateOAuthLoginUrl(AuthChannel authChannel, String state) {
        OAuthProviderPort providerPort = oAuthProviderFactory.getOAuthProviderPort(authChannel);
        return providerPort.generateAuthorizationUrl(state);
    }

    @Override
    public AuthUser oauthLogin(AuthChannel authChannel, String code, String state, String userId) {
        // OAuth Provider 서비스 가져오기
        OAuthProviderPort providerPort = oAuthProviderFactory.getOAuthProviderPort(authChannel);
        
        // OAuth 사용자 정보 조회
        AuthInfo.OAuthUserInfo oAuthUserInfo = providerPort.getUserInfo(code, state);
        String uniqueId = oAuthUserInfo.getId();
        

        try {
            // 기존 사용자 조회
            log.info("oauthLogin - userId: {}, uniqueId: {}, authChannel: {}", userId, uniqueId, authChannel);
            AuthUser authUser = authUserPort.getAuthUser(uniqueId, authChannel);

            // 권한 평가 및 필요시 업데이트
            return evaluateAndUpdateAuthority(authUser, uniqueId, providerPort);
        } catch (AuthUserNotFoundException e) {
            // 신규 로그인의 경우
            if (userId == null || userId == "") {
                AuthUser newAuthUser = handleNewOAuthLogin(uniqueId, authChannel);
                return evaluateAndUpdateAuthority(newAuthUser, uniqueId, providerPort);
            }

            AuthUser connectedAuthUser = handleTempUserOAuthLogin(userId, uniqueId, authChannel);
            return evaluateAndUpdateAuthority(connectedAuthUser, uniqueId, providerPort);
        }
    }
    
    /**
     * 사용자 권한을 평가하고 필요한 경우 업데이트합니다.
     */
    private AuthUser evaluateAndUpdateAuthority(AuthUser authUser, String uniqueId, OAuthProviderPort providerPort) {
        // OAuth 제공자로부터 권한 평가 받기
        Authority expectedAuthority = providerPort.evaluateAuthority(authUser, uniqueId);
        Authority currentAuthority = authUser.getAuthority();
        
        // 현재 권한과 기대 권한이 다르면 업데이트
        if (currentAuthority != expectedAuthority) {
            log.info("Updating authority for user: {} from {} to {}", authUser.getUserId(), currentAuthority, expectedAuthority);
            UpdateAuthorityResponse response = authUserPort.updateAuthority(
                UpdateAuthorityRequest.newBuilder()
                    .setAuthUserId(authUser.getId())
                    .setAuthority(expectedAuthority)
                    .build()
            );
            return response.getAuthUser();
        }
        
        return authUser;
    }
    
    /**
     * 새로운 OAuth 로그인 처리
     */
    private AuthUser handleNewOAuthLogin(String uniqueId, AuthChannel authChannel) {
        // 새 사용자 생성
        User user = authUserPort.initializeUser(InitializeUserRequest.newBuilder().build()).getUser();
        
        // OAuth 채널 연결
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(user.getId(), uniqueId, authChannel);
        ConnectAuthChannelResponse response = authUserPort.connectAuthChannel(request);
        
        return response.getAuthUser();
    }
    
    /**
     * 임시 유저를 OAuth 계정과 연결
     */
    private AuthUser handleTempUserOAuthLogin(String userId, String oAuthUniqueId, AuthChannel authChannel) {
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(userId, oAuthUniqueId, authChannel);
        ConnectAuthChannelResponse response = authUserPort.connectAuthChannel(request);
        return response.getAuthUser();
    }


    /**
     * OAuth 채널 연결 요청 생성
     */
    private ConnectAuthChannelRequest createConnectAuthChannelRequest(String userId, String uniqueId, AuthChannel authChannel) {
        return ConnectAuthChannelRequest.newBuilder()
                .setUserId(userId)
                .setAuthChannel(authChannel)
                .setUniqueId(uniqueId)
                .build();
    }
}
