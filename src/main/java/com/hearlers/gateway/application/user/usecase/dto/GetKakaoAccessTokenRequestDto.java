package com.hearlers.gateway.application.user.usecase.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetKakaoAccessTokenRequestDto {
    private String code;
}
