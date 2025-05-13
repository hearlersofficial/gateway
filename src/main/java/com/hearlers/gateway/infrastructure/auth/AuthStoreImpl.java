package com.hearlers.gateway.infrastructure.auth;

import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.gateway.application.auth.AuthStore;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthStoreImpl implements AuthStore {
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
    public UpdateAuthorityResponse updateAuthority(UpdateAuthorityRequest request) {
        return userServiceBlockingStub.updateAuthority(request);
    }


}   