package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.*;

import java.time.LocalDateTime;

public interface AuthService {
    InitializeUserResponse initializeUser(InitializeUserRequest request);
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    AuthInfo.TokenInfo rotateRefreshToken(String userId, AuthChannel authChannel, String refreshToken);
    AuthUser kakaoLogin(String code, String state);
    AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, boolean withAdminClaim);
}
