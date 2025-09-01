package com.hearlers.gateway.port;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;

import java.time.LocalDateTime;

public interface TokenProviderPort {
    boolean validateToken(String token);
    boolean isTokenExpired(String token);
    String getUserId(String token);
    AuthChannel getAuthChannel(String token);
    Authority getAuthority(String token);
    String createToken(String userId, AuthChannel authChannel, Authority authority, LocalDateTime validity);
    long getAccessTokenExpirationTime();
    long getRefreshTokenExpirationTime();
}