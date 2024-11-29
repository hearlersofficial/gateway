package com.hearlers.gateway.applications.auth.service;

import com.hearlers.gateway.applications.auth.useCases.GetKakaoAccessTokenUseCase.GetKakaoAccessTokenUseCase;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenResponseDto;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.GetKakaoUserInfoUseCase;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoRequestDto;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final GetKakaoAccessTokenUseCase getKakaoAccessTokenUseCase;
    private final GetKakaoUserInfoUseCase getKakaoUserInfoUseCase;

    public void kakaoLogin(String code) {
        GetKakaoAccessTokenRequestDto tokenRequest = new GetKakaoAccessTokenRequestDto();
        tokenRequest.setCode(code);
        GetKakaoAccessTokenResponseDto tokenResponse = getKakaoAccessTokenUseCase.execute(tokenRequest);

        // 유저 정보 받아오기
        GetKakaoUserInfoRequestDto userInfoRequest = new GetKakaoUserInfoRequestDto();
        userInfoRequest.setAccessToken(tokenResponse.getAccessToken());
        GetKakaoUserInfoResponseDto result = getKakaoUserInfoUseCase.execute(userInfoRequest);

        /*
        TODO 1. 유저의 AuthChannel Kakao로 설정 후 UserService에 kakaoID와 AuthChannel 넘기기
        * */

        System.out.println(result);
    }
}
