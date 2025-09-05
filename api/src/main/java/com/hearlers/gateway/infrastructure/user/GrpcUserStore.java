package com.hearlers.gateway.infrastructure.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.UpdateUserRequest;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import com.hearlers.gateway.application.user.UserStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GrpcUserStore implements UserStore {
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public User updateUser(UpdateUserRequest request) {
        return this.userServiceBlockingStub.updateUser(request).getUser();
    }
}
