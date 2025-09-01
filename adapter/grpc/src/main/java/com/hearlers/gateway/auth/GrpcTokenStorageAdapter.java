package com.hearlers.gateway.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.gateway.auth.exception.AuthUserNotFoundException;
import com.hearlers.gateway.port.AuthUserPort;
import com.hearlers.gateway.port.TokenStoragePort;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
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
