package com.hearlers.gateway.infrastructure.auth;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.FindAuthUserByChannelInfoRequest;
import com.hearlers.api.proto.v1.service.FindAuthUserByChannelInfoResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;
import com.hearlers.gateway.application.auth.AuthReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthReaderImpl implements AuthReader {
    private final UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public AuthUser getAuthUser(String uniqueId, AuthChannel authChannel) {
        FindAuthUserByChannelInfoRequest findAuthUserByChannelInfoRequest = FindAuthUserByChannelInfoRequest.newBuilder()
                .setUniqueId(uniqueId)
                .setAuthChannel(authChannel)
                .build();
        FindAuthUserByChannelInfoResponse findAuthUserByChannelInfoResponse = userServiceBlockingStub.findAuthUserByChannelInfo(findAuthUserByChannelInfoRequest);
        return findAuthUserByChannelInfoResponse.getAuthUser();
    }
    
}
