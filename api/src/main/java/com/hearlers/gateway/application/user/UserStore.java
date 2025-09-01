package com.hearlers.gateway.application.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.UpdateUserRequest;

public interface UserStore {
    User updateUser(UpdateUserRequest request);
}
