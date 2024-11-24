package com.hearlers.gateway.application.user.service;

import com.hearlers.gateway.application.user.usecase.GetKakaoAccessToken;
import com.hearlers.gateway.application.user.usecase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.application.user.usecase.dto.GetKakaoAccessTokenResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final GetKakaoAccessToken getKakaoAccessToken;

    public void kakaoLogin(String code) {
        GetKakaoAccessTokenRequestDto request = new GetKakaoAccessTokenRequestDto();
        request.setCode(code);
        GetKakaoAccessTokenResponseDto response = getKakaoAccessToken.execute(request);

    }
}
