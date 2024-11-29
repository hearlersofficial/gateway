package com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetKakaoUserInfoRequestDto {
    String accessToken;
}
