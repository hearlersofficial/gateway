package com.hearlers.gateway.application.auth;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class AuthInfo {

    @Getter
    @Builder
    @ToString
    public static class TokenInfo {
        private final String accessToken;
        private final String refreshToken;
        private final LocalDateTime accessTokenExpiresAt;
        private final LocalDateTime refreshTokenExpiresAt;
    }
}
