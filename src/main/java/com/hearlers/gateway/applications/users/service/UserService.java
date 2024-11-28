package com.hearlers.gateway.applications.users.service;

import com.hearlers.gateway.applications.users.useCases.GetKakaoAccessTokenUseCase.GetKakaoAccessToken;
import com.hearlers.gateway.applications.users.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.applications.users.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenResponseDto;
import com.hearlers.gateway.applications.users.useCases.GetKakaoUserInfoUseCase.GetKakaoUserInfo;
import com.hearlers.gateway.applications.users.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoRequestDto;
import com.hearlers.gateway.applications.users.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final GetKakaoAccessToken getKakaoAccessToken;
    private final GetKakaoUserInfo getKakaoUserInfo;

    public void kakaoLogin(String code) {
        GetKakaoAccessTokenRequestDto tokenRequest = new GetKakaoAccessTokenRequestDto();
        tokenRequest.setCode(code);
        GetKakaoAccessTokenResponseDto tokenResponse = getKakaoAccessToken.execute(tokenRequest);

        // 유저 정보 받아오기
        GetKakaoUserInfoRequestDto userInfoRequest = new GetKakaoUserInfoRequestDto();
        userInfoRequest.setAccessToken(tokenResponse.getAccessToken());
        GetKakaoUserInfoResponseDto result = getKakaoUserInfo.execute(userInfoRequest);
        System.out.println(result);
    }
}
