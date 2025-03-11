package com.hearlers.gateway.infrastructure.auth;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.FindOneAuthUserRequest;
import com.hearlers.api.proto.v1.service.FindOneAuthUserResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.gateway.application.auth.AuthReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthReaderImpl implements AuthReader {
    private final UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public AuthUser getAuthUser(String uniqueId, AuthChannel authChannel) {
        FindOneAuthUserRequest findOneAuthUserRequest = FindOneAuthUserRequest.newBuilder()
                .setUniqueId(uniqueId)
                .setAuthChannel(authChannel)
                .build();
        FindOneAuthUserResponse findOneAuthUserResponse = userServiceBlockingStub.findOneAuthUser(findOneAuthUserRequest);
        return findOneAuthUserResponse.getAuthUser();
    }
    
}
