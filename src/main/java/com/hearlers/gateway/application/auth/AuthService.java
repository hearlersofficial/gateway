package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;

public interface AuthService {
    InitializeUserResponse initializeUser(InitializeUserRequest request);
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    AuthUser kakaoLogin(String code, String userId);
    AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, boolean withAdminClaim);
}
