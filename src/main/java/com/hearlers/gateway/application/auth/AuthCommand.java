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

    @Getter
    @Builder
    @ToString
    public static class GetOAuthAccessTokenRequest {
        private final String code;
        private final String state;
        private final String redirectUri;

        public static GetOAuthAccessTokenRequest from(String code, String state, String redirectUri) {
            return GetOAuthAccessTokenRequest.builder()
                    .code(code)
                    .state(state)
                    .redirectUri(redirectUri)
                    .build();
        }
    }


    @Getter
    @Builder
    @ToString
    public static class GetOAuthUserInfoRequest {
        private final String accessToken;

        public static GetOAuthUserInfoRequest from(String accessToken) {
            return GetOAuthUserInfoRequest.builder()
                    .accessToken(accessToken)
                    .build();
        }
    }
    
    @Getter
    @Builder
    @ToString
    public static class GetOAuthUserInfoResponse {
        private final String id;
        private final String nickname;
        private final String profileImageUrl;
    }
}
