package com.hearlers.gateway.application.user.usecase.dto;

public class GetKakaoAccessTokenResponseDto {
    private String tokenType;
    private String accessToken;
    private String refreshToken;
    private String idToken;
    private String scope;
    private Integer expiresIn;
    private Integer refreshTokenExpiresIn;
}
