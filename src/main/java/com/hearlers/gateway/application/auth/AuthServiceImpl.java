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
        SaveRefreshTokenRequest saveRefreshTokenRequest = SaveRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(tokenInfo.getRefreshToken())
                .setExpiresAt(tokenInfo.getRefreshTokenExpiresAt().toString())
                .build();
        SaveRefreshTokenResponse saveRefreshTokenResponse = authPersistor.saveRefreshToken(saveRefreshTokenRequest);
        if( !saveRefreshTokenResponse.getSuccess() ) {
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "Failed to save refresh token");
        }
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
        
        var tokenRequest = AuthCommand.GetOAuthAccessTokenRequest.from(code, userId, null);
        var oAuthProviderClient = oAuthProviderFactory.getOAuthProviderClient(
                AuthChannel.AUTH_CHANNEL_KAKAO);
        var tokenResponse = oAuthProviderClient.getToken(tokenRequest);
        var result = oAuthProviderClient.getOAuthUser(AuthCommand.GetOAuthUserInfoRequest.from(tokenResponse.getAccessToken()));

        try {
            // gRPC 호출: 사용자 조회
            AuthUser authUser = authReader.getAuthUser(result.getId(), AuthChannel.AUTH_CHANNEL_KAKAO);
            // 사용자가 이미 존재하면 authUser 반환
            return authUser;

        } catch (StatusRuntimeException e) {
            // NOT_FOUND 상태일 경우 connectAuthChannel 로직 수행
            log.error("Kakao login failed", e);
            log.error(e.getStatus().getCode().toString());
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                // ConnectAuthChannelRequest 빌드
                log.info("ConnectAuthChannelRequest 빌드");
                ConnectAuthChannelRequest connectAuthChannelRequest = ConnectAuthChannelRequest.newBuilder()
                        .setUserId(userId)
                        .setAuthChannel(AuthChannel.AUTH_CHANNEL_KAKAO)
                        .setUniqueId(result.getId())
                        .build();

                // gRPC 호출: 사용자 연결
                ConnectAuthChannelResponse connectAuthChannelResponse = authPersistor.connectAuthChannel(
                        connectAuthChannelRequest);

                // 새로 생성된 사용자 반환
                log.info("새로 생성된 사용자 반환");
                return connectAuthChannelResponse.getAuthUser();
            } else {
                // 다른 에러는 그대로 던짐
                throw e;
            }
        }

    }
}
