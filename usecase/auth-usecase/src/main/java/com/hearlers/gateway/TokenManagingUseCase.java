package com.hearlers.gateway;


import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.command.AuthCommand;


public interface TokenManagingUseCase {
    AuthInfo.TokenInfo generateToken(String userId, AuthChannel authChannel, boolean withRefreshToken, Authority authority);
    String getUserIdFromToken(String token);
    AuthChannel getAuthChannelFromToken(String token);
    Authority getAuthorityFromToken(String token);
    boolean validateToken(String token);
    AuthInfo.TokenInfo refreshToken(String userId, AuthChannel authChannel, String refreshToken);
}
