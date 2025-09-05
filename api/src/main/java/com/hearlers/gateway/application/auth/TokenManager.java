package com.hearlers.gateway.application.auth;


import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;
import io.jsonwebtoken.Claims;


public interface TokenManager {
    AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, Authority authority);
    Authority getAuthorityFromToken(String token);
    boolean validateToken(String token);
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request);
}
