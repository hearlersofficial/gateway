package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.gateway.config.KakaoProperties;

import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class AuthFacade {
    private final KakaoProperties kakaoProperties;
    private final AuthService authService;
    private final JwtTokenManager jwtTokenManager;

    /**
     * 비로그인 유저 생성 및 토큰 발급
     */
    public AuthInfo.TokenInfo createUser() {
        var initializeUserResponse = authService.initializeUser(
                InitializeUserRequest.newBuilder().build());
        var userId = initializeUserResponse.getUser().getId();
        var authChannel = initializeUserResponse.getAuthUser().getAuthChannel();
        
        AuthCommand.GenerateTokenCommand command = new AuthCommand.GenerateTokenCommand(userId, authChannel);
        return jwtTokenManager.generateToken(command, false, false);
    }

    /**
     * 카카오 로그인 URL 생성
     */
    public String generateKakaoLoginUrl(String userId) {
        StringBuilder url = new StringBuilder();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=").append(kakaoProperties.getClientId());
        url.append("&redirect_uri=").append(kakaoProperties.getRedirectUri());
        url.append("&response_type=code");
        url.append("&state=").append(userId);
        return url.toString();
    }

    /**
     * 카카오 로그인 콜백 처리
     */
    public AuthInfo.TokenInfo handleKakaoCallback(String code, String state) {
        var authUser = authService.kakaoLogin(code, state);
        var authChannel = authUser.getAuthChannel();
        var userId = authUser.getUserId();
        
        AuthCommand.GenerateTokenCommand command = new AuthCommand.GenerateTokenCommand(userId, authChannel);
        var token = authService.generateToken(command, true, true);
        
        // RefreshToken 저장
        String refreshToken = token.getRefreshToken();
        LocalDateTime refreshTokenExpiresAt = token.getRefreshTokenExpiresAt();
        
        SaveRefreshTokenResponse response = saveRefreshToken(authUser.getUserId(), refreshToken, refreshTokenExpiresAt);
        
        if (!response.getSuccess()) {
            throw new RuntimeException("RefreshToken 저장 실패");
        }
        
        return token;
    }
    
    /**
     * RefreshToken 저장
     */
    private SaveRefreshTokenResponse saveRefreshToken(String userId, String token, LocalDateTime expiresAt) {
        return authService.saveRefreshToken(
                com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest.newBuilder()
                        .setUserId(userId)
                        .setToken(token)
                        .setExpiresAt(expiresAt.toString())
                        .build());
    }
    
    /**
     * 액세스 토큰 재발급 및 리프레시 토큰 교체
     * @param userId 사용자 ID
     * @param authChannel 인증 채널
     * @param refreshToken 리프레시 토큰
     * @return 새로운 액세스 토큰과 교체된 리프레시 토큰 정보
     */
    public AuthInfo.TokenInfo refreshToken(String userId, AuthChannel authChannel, String refreshToken) {
        // 리프레시 토큰 검증 및 교체
        return authService.rotateRefreshToken(userId, authChannel, refreshToken);
    }

}
