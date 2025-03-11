package com.hearlers.gateway.application.auth.useCases.GetKakaoUserInfoUseCase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetKakaoUserInfoRequestDto {
    String accessToken;
}
