package com.hearlers.gateway.application.auth;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;

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
    public AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, boolean withAdminClaim) {
        return jwtTokenManager.generateToken(command, withRefreshToken, withAdminClaim);
    }

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
