package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class AuthCommand {
    
    @Getter
    @Builder
    @ToString
    public static class GenerateTokenCommand {
        private final String id;
        private final AuthChannel authChannel;
    }
}
