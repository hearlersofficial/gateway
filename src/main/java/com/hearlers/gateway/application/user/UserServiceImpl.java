package com.hearlers.gateway.application.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;
import com.hearlers.api.proto.v1.service.UpdateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserStore userStore;
    private final UserReader userReader;

    @Override
    public User updateUser(UpdateUserRequest request) {
        return this.userStore.updateUser(request);
    }

    @Override
    public User findUserByUserId(FindUserByUserIdRequest request) {
        return this.userReader.findUserByUserId(request);
    }
}
