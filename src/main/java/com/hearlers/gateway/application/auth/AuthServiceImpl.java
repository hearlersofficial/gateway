package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;
import lombok.val;
import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final OAuthProviderFactory oAuthProviderFactory;
    private final AuthPersistor authPersistor;
    private final AuthReader authReader;
    private final JwtTokenManager jwtTokenManager;
    
    @Override
    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return authPersistor.initializeUser(request);
    }

    @Override
    public SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request) {
        return authPersistor.saveRefreshToken(request);
    }

    @Override
    public AuthInfo.TokenInfo rotateRefreshToken(String userId, AuthChannel authChannel, String refreshToken) {
        // 입력 로그
        log.info("rotateRefreshToken - userId: {}, authChannel: {}, refreshToken: {}", userId, authChannel, refreshToken);
        boolean isTokenExist = authPersistor.verifyRefreshToken(
                VerifyRefreshTokenRequest.newBuilder().setUserId(userId).setToken(refreshToken).build()
        ).getSuccess();
        if( !isTokenExist ) {
            throw new HttpException(HttpResultCode.INVALID_TOKEN, "Refresh token does not exist");
        }
        boolean validationResult = jwtTokenManager.validateToken(refreshToken);
        if( !validationResult ) {
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_EXPIRED, "Refresh token is expired");
        }
        // Refresh token 이 유효한 경우 새로운 Refresh token 발급
        val tokenInfo = jwtTokenManager.generateToken(
                AuthCommand.GenerateTokenCommand.builder()
                        .id(userId)
                        .authChannel(authChannel)
                        .build(),
                true,
                true
        );
        
        // Refresh token 저장
        saveUserRefreshToken(userId, tokenInfo.getRefreshToken(), tokenInfo.getRefreshTokenExpiresAt().toString());
        return tokenInfo;
    }

    @Override
    public AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, boolean withAdminClaim) {
        return jwtTokenManager.generateToken(command, withRefreshToken, withAdminClaim);
    }

    /**
     * 카카오 로그인
     * @param code 카카오 로그인 인증 코드
     * @param userId 사용자 ID (비로그인 유저 없이 실행 시 null)
     * @return 카카오 로그인 인증 코드
     */
    @Override
    public AuthUser kakaoLogin(String code, String userId) {
        // OAuth 토큰 획득 및 사용자 정보 조회
        var oAuthUserInfo = getOauthUserInfo(code, userId, AuthChannel.AUTH_CHANNEL_KAKAO);
        
        try {
            // gRPC 호출: 사용자 조회
            log.info("kakaoLogin - userId: {}", userId);
            // 기존 카카오 로그인 유저의 경우 해당 정보로 덮어씀
            return authReader.getAuthUser(oAuthUserInfo.getId(), AuthChannel.AUTH_CHANNEL_KAKAO);
        } catch (StatusRuntimeException e) {
            // 신규 로그인인 경우 (userId가 null)
            if (userId == null) {
                return handleNewKakaoLogin(oAuthUserInfo);
            }
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                return handleTempUserKakaoLogin(userId, oAuthUserInfo.getId());
            } else {
                throw e;
            }
        }
    }
    
    /**
     * 리프레시 토큰 저장
     */
    private SaveRefreshTokenResponse saveUserRefreshToken(String userId, String token, String expiresAt) {
        SaveRefreshTokenRequest request = SaveRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(token)
                .setExpiresAt(expiresAt)
                .build();
        
        SaveRefreshTokenResponse response = authPersistor.saveRefreshToken(request);
        if (!response.getSuccess()) {
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "Failed to save refresh token");
        }
        return response;
    }
    
    private AuthCommand.GetOAuthUserInfoResponse getOauthUserInfo(String code, String state, AuthChannel authChannel) {
        val tokenRequest = AuthCommand.GetOAuthAccessTokenRequest.from(code, state, null);
        val oAuthProviderClient = oAuthProviderFactory.getOAuthProviderClient(authChannel);
        val tokenResponse = oAuthProviderClient.getToken(tokenRequest);
        val oAuthUserInfo = oAuthProviderClient.getOAuthUser(AuthCommand.GetOAuthUserInfoRequest.from(tokenResponse.getAccessToken()));
        return AuthCommand.GetOAuthUserInfoResponse.builder().id(oAuthUserInfo.getId()).nickname(oAuthUserInfo.getName()).profileImageUrl(null).build();
    }
    
    /**
     * 새로운 카카오 로그인 처리
     */
    private AuthUser handleNewKakaoLogin(AuthCommand.GetOAuthUserInfoResponse oAuthUserInfo) {
        AuthUser authUser = authPersistor.initializeUser(InitializeUserRequest.newBuilder().build()).getAuthUser();
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(authUser.getUserId(), oAuthUserInfo.getId());
        ConnectAuthChannelResponse response = authPersistor.connectAuthChannel(request);
        return response.getAuthUser();
    }
    


    /**
     * 임시 유저 -> 새 유저
     */
    private AuthUser handleTempUserKakaoLogin(String userId, String oAuthUniqueId) {
        ConnectAuthChannelRequest request = createConnectAuthChannelRequest(userId, oAuthUniqueId);
        ConnectAuthChannelResponse response = authPersistor.connectAuthChannel(request);
        return response.getAuthUser();
    }
    
    /**
     * ConnectAuthChannelRequest 생성
     */
    private ConnectAuthChannelRequest createConnectAuthChannelRequest(String userId, String uniqueId) {
        return ConnectAuthChannelRequest.newBuilder()
                .setUserId(userId)
                .setAuthChannel(AuthChannel.AUTH_CHANNEL_KAKAO)
                .setUniqueId(uniqueId)
                .build();
    }
}
