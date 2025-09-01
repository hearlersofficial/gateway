package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AuthCommand {
    
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GenerateTokenCommand {
        private String id;
        private AuthChannel authChannel;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetOAuthAccessTokenRequest {
        private String code;
        private String state;
        private String redirectUri;
        
        public static GetOAuthAccessTokenRequest from(String code, String state, String redirectUri) {
            GetOAuthAccessTokenRequest request = new GetOAuthAccessTokenRequest();
            request.code = code;
            request.state = state;
            request.redirectUri = redirectUri;
            return request;
        }
    }


    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetOAuthUserInfoRequest {
        private String accessToken;
        
        public static GetOAuthUserInfoRequest from(String accessToken) {
            GetOAuthUserInfoRequest request = new GetOAuthUserInfoRequest();
            request.accessToken = accessToken;
            return request;
        }
    }
    
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetOAuthUserInfoResponse {
        private String id;
        private String nickname;
        private String profileImageUrl;
        
        public static Builder builder() {
            return new Builder();
        }
        
        public static class Builder {
            private final GetOAuthUserInfoResponse instance = new GetOAuthUserInfoResponse();
            
            public Builder id(String id) {
                instance.id = id;
                return this;
            }
            
            public Builder nickname(String nickname) {
                instance.nickname = nickname;
                return this;
            }
            
            public Builder profileImageUrl(String profileImageUrl) {
                instance.profileImageUrl = profileImageUrl;
                return this;
            }
            
            public GetOAuthUserInfoResponse build() {
                return instance;
            }
        }
    }
}
