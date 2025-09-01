package com.hearlers.gateway.port;


import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.command.AuthCommand;


public interface TokenManagerPort {
    AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, Authority authority);
    Authority getAuthorityFromToken(String token);
    boolean validateToken(String token);
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request);
}
