package com.hearlers.gateway.applications.auth.useCases.GetKakaoAccessTokenUseCase.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GetKakaoAccessTokenResponseDto {
    private String tokenType;
    private String accessToken;
    private int expiresIn;
    private String refreshToken;
    private int refreshTokenExpiresIn;
    private String scope;
}
