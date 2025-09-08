package com.hearlers.gateway.auth;

import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;
import com.hearlers.gateway.port.TokenStoragePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GrpcTokenStorageAdapter implements TokenStoragePort {
    private final UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request) {
        return userServiceBlockingStub.saveRefreshToken(request);

    }

    @Override
    public VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request) {
        return userServiceBlockingStub.verifyRefreshToken(request);
    }
}
