package com.hearlers.gateway.applications.users.useCases.GetKakaoAccessTokenUseCase.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetKakaoAccessTokenRequestDto {
    private String code;
}
