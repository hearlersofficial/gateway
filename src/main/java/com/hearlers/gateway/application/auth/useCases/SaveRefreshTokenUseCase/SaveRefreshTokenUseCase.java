package com.hearlers.gateway.application.auth.useCases.SaveRefreshTokenUseCase;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import com.hearlers.gateway.shared.application.UseCase;
import com.hearlers.gateway.shared.guard.dto.TokenDto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SaveRefreshTokenUseCase implements UseCase<SaveRefreshTokenRequest, SaveRefreshTokenResponse> {
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    public SaveRefreshTokenRequest configureRequest(String userId, TokenDto token) {
        return SaveRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(token.getRefreshToken())
                .setExpiresAt(token.getRefreshTokenExpiresAt().toString())
                .build();
    }

    @Override
    public SaveRefreshTokenResponse execute(SaveRefreshTokenRequest saveRefreshTokenRequest) {
        return userServiceBlockingStub.saveRefreshToken(saveRefreshTokenRequest);
    }
}