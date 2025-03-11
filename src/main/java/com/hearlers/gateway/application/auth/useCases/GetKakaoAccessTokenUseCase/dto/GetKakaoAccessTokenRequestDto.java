package com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetKakaoAccessTokenRequestDto {
    private String code;
}
