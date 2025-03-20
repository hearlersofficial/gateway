package com.hearlers.gateway.application.auth.dto;

import lombok.Getter;

@Getter
public class GetOAuthUserInfoRequest {
    String accessToken;

    public GetOAuthUserInfoRequest(String accessToken) {
        this.accessToken = accessToken;
    }
}

