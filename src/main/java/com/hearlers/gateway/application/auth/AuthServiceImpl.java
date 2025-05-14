package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.*;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final OAuthProviderFactory oAuthProviderFactory;
    private final AuthStore authStore;
    private final AuthReader authReader;

    
    @Override
    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return authStore.initializeUser(request);
    }


    @Override
    public String generateOAuthLoginUrl(AuthChannel authChannel, String state) {
        OAuthProviderService providerService = oAuthProviderFactory.getOAuthProvider(authChannel);
        return providerService.generateAuthorizationUrl(state);
    }

    @Override
    public AuthUser oauthLogin(AuthChannel authChannel, String code, String state, String userId) {
        // OAuth Provider 서비스 가져오기
        OAuthProviderService providerService = oAuthProviderFactory.getOAuthProvider(authChannel);
        
        // OAuth 사용자 정보 조회
        AuthInfo.OAuthUserInfo oAuthUserInfo = providerService.getUserInfo(code, state);
        String uniqueId = oAuthUserInfo.getId();
        

        try {
            // 기존 사용자 조회
            log.info("oauthLogin - userId: {}, uniqueId: {}, authChannel: {}", userId, uniqueId, authChannel);
            AuthUser authUser = authReader.getAuthUser(uniqueId, authChannel);
            
            // 권한 평가 및 필요시 업데이트
            return evaluateAndUpdateAuthority(authUser, uniqueId, providerService);
        } catch (StatusRuntimeException e) {
            // 신규 로그인의 경우
            if (userId == null) {
                AuthUser newAuthUser = handleNewOAuthLogin(uniqueId, authChannel);
                return evaluateAndUpdateAuthority(newAuthUser, uniqueId, providerService);
            }
            // 임시 사용자 연결의 경우
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                AuthUser connectedAuthUser = handleTempUserOAuthLogin(userId, uniqueId, authChannel);
                return evaluateAndUpdateAuthority(connectedAuthUser, uniqueId, providerService);
            } else {
                throw e;
            }
        }
    }
    
    /**
     * 사용자 권한을 평가하고 필요한 경우 업데이트합니다.
     */
    private AuthUser evaluateAndUpdateAuthority(AuthUser authUser, String uniqueId, OAuthProviderService providerService) {
        // OAuth 제공자로부터 권한 평가 받기
        Authority expectedAuthority = providerService.evaluateAuthority(authUser, uniqueId);
        Authority currentAuthority = authUser.getAuthority();
        
        // 현재 권한과 기대 권한이 다르면 업데이트
        if (currentAuthority != expectedAuthority) {
            log.info("Updating authority for user: {} from {} to {}", authUser.getUserId(), currentAuthority, expectedAuthority);
            UpdateAuthorityResponse response = authStore.updateAuthority(
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
        AuthUser authUser = authStore.initializeUser(InitializeUserRequest.newBuilder().build()).getAuthUser();
        
        // OAuth 채널 연결
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(authUser.getUserId(), uniqueId, authChannel);
        ConnectAuthChannelResponse response = authStore.connectAuthChannel(request);
        
        return response.getAuthUser();
    }
    
    /**
     * 임시 유저를 OAuth 계정과 연결
     */
    private AuthUser handleTempUserOAuthLogin(String userId, String oAuthUniqueId, AuthChannel authChannel) {
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(userId, oAuthUniqueId, authChannel);
        ConnectAuthChannelResponse response = authStore.connectAuthChannel(request);
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
