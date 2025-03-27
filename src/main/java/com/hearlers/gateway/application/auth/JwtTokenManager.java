package com.hearlers.gateway.application.auth;


import io.jsonwebtoken.Claims;


public interface JwtTokenManager {
    AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean rememberMe);
    Claims parseClaims(String token);
    int getUserId(String token);
    boolean isTokenExpired(String token);
    boolean validateToken(String token);
}
