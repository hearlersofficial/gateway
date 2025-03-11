package com.hearlers.gateway.application.auth.useCases.CreateUserUseCase;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import com.hearlers.gateway.shared.application.UseCase;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CreateUserUseCase implements UseCase<InitializeUserRequest, InitializeUserResponse> {
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public InitializeUserResponse execute(InitializeUserRequest initializeUserRequest) {
        InitializeUserRequest request = InitializeUserRequest.newBuilder().build();
        return userServiceBlockingStub.initializeUser(request);
    }
}
