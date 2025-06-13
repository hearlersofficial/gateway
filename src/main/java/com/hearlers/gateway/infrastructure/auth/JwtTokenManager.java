package com.hearlers.gateway.infrastructure.auth;

import java.time.ZonedDateTime;

import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.gateway.application.auth.AuthCommand;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.application.auth.TokenManager;
import com.hearlers.gateway.config.JwtProvider;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;

@Component
@RequiredArgsConstructor
@Slf4j
public class JwtTokenManager implements TokenManager {
    private final JwtProvider jwtProvider;
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, Authority authority) {
        return createToken(command, withRefreshToken, authority);
    }

    @Override
    public Authority getAuthorityFromToken(String token) {
        return jwtProvider.getAuthority(token);
    }

    @Override
    public boolean validateToken(String token) {
        return jwtProvider.validateToken(token);
    }

    @Override
    public SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request) {
        return userServiceBlockingStub.saveRefreshToken(request);
    }

    @Override
    public VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request) {
        return userServiceBlockingStub.verifyRefreshToken(request);
    }

    private AuthInfo.TokenInfo createToken(AuthCommand.GenerateTokenCommand command, boolean withRefreshToken, Authority authority) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime accessTokenValidity = now.plusSeconds(jwtProvider.getAccessTokenExpTime());
        ZonedDateTime refreshTokenValidity = now.plusSeconds(jwtProvider.getRefreshTokenExpTime());

        String accessToken = jwtProvider.createJwtToken(
                command.getId(),
                command.getAuthChannel(),
                authority,
                now,
                accessTokenValidity
        );
        
        if (!withRefreshToken) {
            return AuthInfo.TokenInfo.builder()
                    .accessToken(accessToken)
                    .accessTokenExpiresAt(accessTokenValidity.toLocalDateTime())
                    .build();
        }

        String refreshToken = jwtProvider.createJwtToken(
                command.getId(),
                command.getAuthChannel(),
                authority,
                now,
                refreshTokenValidity
        );
        
        return AuthInfo.TokenInfo.builder()
                .accessToken(accessToken)
                .accessTokenExpiresAt(accessTokenValidity.toLocalDateTime())
                .refreshToken(refreshToken)
                .refreshTokenExpiresAt(refreshTokenValidity.toLocalDateTime())
                .build();
    }
}
