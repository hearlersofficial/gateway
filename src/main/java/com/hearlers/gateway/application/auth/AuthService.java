package com.hearlers.gateway.application.auth;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse;
import com.hearlers.api.proto.v1.service.FindOneAuthUserRequest;
import com.hearlers.api.proto.v1.service.FindOneAuthUserResponse;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.gateway.application.auth.useCases.CreateUserUseCase.CreateUserUseCase;
import com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.GetKakaoAccessTokenUseCase;
import com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenResponseDto;
import com.hearlers.gateway.application.auth.useCases.GetKakaoUserInfoUseCase.GetKakaoUserInfoUseCase;
import com.hearlers.gateway.application.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoRequestDto;
import com.hearlers.gateway.application.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoResponseDto;
import com.hearlers.gateway.application.auth.useCases.SaveRefreshTokenUseCase.SaveRefreshTokenUseCase;
import com.hearlers.gateway.shared.guard.dto.TokenDto;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final GetKakaoAccessTokenUseCase getKakaoAccessTokenUseCase;
    private final GetKakaoUserInfoUseCase getKakaoUserInfoUseCase;
    private final UserServiceBlockingStub userServiceBlockingStub;
    private final CreateUserUseCase createUserUseCase;
    private final SaveRefreshTokenUseCase saveRefreshTokenUseCase;

    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return createUserUseCase.execute(request);
    }

    public SaveRefreshTokenResponse saveRefreshToken(String userId, TokenDto token) {
        return saveRefreshTokenUseCase.execute(saveRefreshTokenUseCase.configureRequest(userId, token));
    }

    public AuthUser kakaoLogin(String code, String userId) {
        GetKakaoAccessTokenRequestDto tokenRequest = new GetKakaoAccessTokenRequestDto();
        tokenRequest.setCode(code);
        GetKakaoAccessTokenResponseDto tokenResponse = getKakaoAccessTokenUseCase.execute(tokenRequest);

        // 유저 정보 받아오기
        GetKakaoUserInfoRequestDto userInfoRequest = new GetKakaoUserInfoRequestDto();
        userInfoRequest.setAccessToken(tokenResponse.getAccessToken());
        GetKakaoUserInfoResponseDto result = getKakaoUserInfoUseCase.execute(userInfoRequest);

        FindOneAuthUserRequest findOneAuthUserRequest = FindOneAuthUserRequest.newBuilder()
                .setUniqueId(result.getId().toString())
                .setAuthChannel(AuthChannel.AUTH_CHANNEL_KAKAO)
                .build();

        try {
            // gRPC 호출: 사용자 조회
            FindOneAuthUserResponse findOneAuthUserResponse = userServiceBlockingStub.findOneAuthUser(
                    findOneAuthUserRequest);

            // 사용자가 이미 존재하면 authUser 반환
            return findOneAuthUserResponse.getAuthUser();

        } catch (StatusRuntimeException e) {
            // NOT_FOUND 상태일 경우 connectAuthChannel 로직 수행
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                // ConnectAuthChannelRequest 빌드
                ConnectAuthChannelRequest connectAuthChannelRequest = ConnectAuthChannelRequest.newBuilder()
                        .setUserId(userId)
                        .setAuthChannel(AuthChannel.AUTH_CHANNEL_KAKAO)
                        .setUniqueId(result.getId().toString())
                        .build();

                // gRPC 호출: 사용자 연결
                ConnectAuthChannelResponse connectAuthChannelResponse = userServiceBlockingStub.connectAuthChannel(
                        connectAuthChannelRequest);

                // 새로 생성된 사용자 반환
                return connectAuthChannelResponse.getAuthUser();
            } else {
                // 다른 에러는 그대로 던짐
                throw e;
            }
        }

    }
}
