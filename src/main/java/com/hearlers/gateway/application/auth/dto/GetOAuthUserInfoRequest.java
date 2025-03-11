package com.hearlers.gateway.application.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetOAuthUserInfoRequest {
    String accessToken;
}

