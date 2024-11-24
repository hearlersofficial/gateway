package com.hearlers.gateway.application.user.usecase;

import com.hearlers.gateway.application.user.usecase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.application.user.usecase.dto.GetKakaoAccessTokenResponseDto;
import com.hearlers.gateway.shared.application.UseCase;
import org.springframework.stereotype.Component;

@Component
public class GetKakaoAccessToken implements
        UseCase<GetKakaoAccessTokenRequestDto, GetKakaoAccessTokenResponseDto> {

    @Override
    public GetKakaoAccessTokenResponseDto execute(
            GetKakaoAccessTokenRequestDto request) {
        return null;
    }
}


