package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Component
@Slf4j
@RequiredArgsConstructor
public class AuthFacade {
    private final AuthService authService;
    private final TokenManager tokenManager;

    /**
     * 비로그인 유저 생성 및 토큰 발급
     */
    public AuthInfo.TokenInfo createUser() {
        var initializeUserResponse = authService.initializeUser(
                InitializeUserRequest.newBuilder().build());
        var userId = initializeUserResponse.getUser().getId();
        var authChannel = initializeUserResponse.getAuthUser().getAuthChannel();
        
        AuthCommand.GenerateTokenCommand command = AuthCommand.GenerateTokenCommand.builder()
                .id(userId)
                .authChannel(authChannel)
                .build();
        return tokenManager.generateToken(command, false, Authority.AUTHORITY_USER);
    }

    /**
     * OAuth 로그인 URL 생성
     */
    public String generateOAuthLoginUrl(AuthChannel authChannel, String state) {
        return authService.generateOAuthLoginUrl(authChannel, state);
    }

    /**
     * OAuth 로그인 콜백 처리
     */
    public AuthInfo.TokenInfo handleOAuthCallback(AuthChannel authChannel, String code, String state, String userId) {
        var authUser = authService.oauthLogin(authChannel, code, state, userId);
        var authority = authUser.getAuthority();
        
        AuthCommand.GenerateTokenCommand command = AuthCommand.GenerateTokenCommand.builder()
                .id(authUser.getUserId())
                .authChannel(authChannel)
                .build();
        var token = tokenManager.generateToken(command, true, authority);
        
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
        SaveRefreshTokenRequest request = SaveRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(token)
                .setExpiresAt(expiresAt.toString())
                .build();
        
        return tokenManager.saveRefreshToken(request);
    }
    
    /**
     * 액세스 토큰 재발급 및 리프레시 토큰 교체
     */
    public AuthInfo.TokenInfo refreshToken(String userId, AuthChannel authChannel, String refreshToken) {
        log.info("refreshToken - userId: {}, authChannel: {}, refreshToken: {}", userId, authChannel, refreshToken);

        // 리프레시 토큰 존재 여부 확인
        boolean isTokenExist = tokenManager.verifyRefreshToken(
                VerifyRefreshTokenRequest.newBuilder()
                        .setUserId(userId)
                        .setToken(refreshToken)
                        .build()
        ).getSuccess();
        
        if (!isTokenExist) {
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_NOT_FOUND);
        }
        
        // 토큰 유효성 검증
        boolean validationResult = tokenManager.validateToken(refreshToken);
        if (!validationResult) {
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_INVALID, "Refresh token is invalid");
        }

        Authority authority = tokenManager.getAuthorityFromToken(refreshToken);
        log.info("refresh - authority: {}", authority);
        // Refresh token 이 유효한 경우 새로운 토큰 발급
        AuthCommand.GenerateTokenCommand command = AuthCommand.GenerateTokenCommand.builder()
                .id(userId)
                .authChannel(authChannel)
                .build();
        
        AuthInfo.TokenInfo tokenInfo = tokenManager.generateToken(command, true, authority);
        
        // Refresh 토큰 저장
        saveRefreshToken(userId, tokenInfo.getRefreshToken(), tokenInfo.getRefreshTokenExpiresAt());
        
        return tokenInfo;
    }
}
