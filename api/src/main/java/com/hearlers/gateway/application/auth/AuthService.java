package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;

public interface AuthService {
    /**
     * 사용자 초기화
     */
    InitializeUserResponse initializeUser(InitializeUserRequest request);

    /**
     * OAuth 로그인 URL 생성
     */
    String generateOAuthLoginUrl(AuthChannel authChannel, String state);

    /**
     * OAuth 로그인 처리
     */
    AuthUser oauthLogin(AuthChannel authChannel, String code, String state, String userId);
}
