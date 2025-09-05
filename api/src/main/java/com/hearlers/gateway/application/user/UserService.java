package com.hearlers.gateway.application.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;
import com.hearlers.api.proto.v1.service.UpdateUserRequest;

public interface UserService {
    User updateUser(UpdateUserRequest request);
    User findUserByUserId(FindUserByUserIdRequest request);
}