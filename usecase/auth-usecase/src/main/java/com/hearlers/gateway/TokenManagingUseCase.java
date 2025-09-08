package com.hearlers.gateway;


import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.auth.model.AuthInfo;


public interface TokenManagingUseCase {
    AuthInfo.TokenInfo generateToken(String userId, AuthChannel authChannel, boolean withRefreshToken, Authority authority);
    String getUserIdFromToken(String token);
    AuthChannel getAuthChannelFromToken(String token);
    Authority getAuthorityFromToken(String token);
    boolean validateToken(String token);
    AuthInfo.TokenInfo refreshToken(String userId, AuthChannel authChannel, String refreshToken);
}
