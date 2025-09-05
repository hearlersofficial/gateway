package com.hearlers.gateway.infrastructure.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import com.hearlers.gateway.application.user.UserReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GrpcUserReader implements UserReader {
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public User findUserByUserId(FindUserByUserIdRequest request) {
        return this.userServiceBlockingStub.findUserByUserId(request).getUser();
    }
}
