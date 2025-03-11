package com.hearlers.gateway.infrastructure.auth;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;
import com.hearlers.gateway.application.auth.AuthPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthPersistorImpl implements AuthPersistor {
    private final UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return userServiceBlockingStub.initializeUser(request);
    }

    @Override
    public ConnectAuthChannelResponse connectAuthChannel(ConnectAuthChannelRequest request) {
        return userServiceBlockingStub.connectAuthChannel(request);
    }

    @Override
    public SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request) {
        return userServiceBlockingStub.saveRefreshToken(request);
    }

    @Override
    public VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request) {
        return userServiceBlockingStub.verifyRefreshToken(request);
    }
}   