package com.hearlers.gateway.application.auth.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetOAuthAccessTokenRequest {
    private String code;
    private String state;
    private String redirectUri;
}
