package com.hearlers.gateway.auth.model;

import com.hearlers.api.proto.v1.model.Gender;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

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

    @Getter
    @Builder
    @ToString
    public static class OAuthUserInfo {
        private final String id;  
        private final String name;
        private final Gender gender;
        private final String birthyear;
        private final String phone_number;
    }
}
