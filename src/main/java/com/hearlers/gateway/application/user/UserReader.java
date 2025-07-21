package com.hearlers.gateway.application.user;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;

public interface UserReader {
    User findUserByUserId(FindUserByUserIdRequest request);
}
