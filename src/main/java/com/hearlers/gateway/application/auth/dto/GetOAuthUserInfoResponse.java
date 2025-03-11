package com.hearlers.gateway.application.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetOAuthUserInfoResponse {
    private String id;
    private String nickname;
    private String profileImageUrl;
}

