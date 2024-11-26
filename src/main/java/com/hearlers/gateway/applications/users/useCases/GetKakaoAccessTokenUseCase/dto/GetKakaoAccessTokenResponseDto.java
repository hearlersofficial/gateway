package com.hearlers.gateway.applications.users.useCases.GetKakaoAccessTokenUseCase.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetKakaoAccessTokenResponseDto {
    private String token_type;
    private String access_token;
    private int expires_in;
    private String refresh_token;
    private int refresh_token_expires_in;
    private String scope;
}
