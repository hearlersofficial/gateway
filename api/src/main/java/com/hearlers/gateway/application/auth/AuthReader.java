package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;


public interface AuthReader {
    public AuthUser getAuthUser(String uniqueId, AuthChannel authChannel);
}
