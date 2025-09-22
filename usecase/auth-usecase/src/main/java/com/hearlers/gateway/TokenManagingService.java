package com.hearlers.gateway;


import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.com.hearlers.gateway.port.TokenProviderPort;
import com.hearlers.gateway.auth.exception.TokenInvalidException;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.port.TokenStoragePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
@Slf4j
public class TokenManagingService implements TokenManagingUseCase {
    private final TokenStoragePort tokenStoragePort;
    private final TokenProviderPort tokenProviderPort;

    @Override
    public AuthInfo.TokenInfo generateToken(String userId, AuthChannel authChannel, boolean withRefreshToken, Authority authority) {
        var tokenInfo = createToken(userId, authChannel, withRefreshToken, authority);
        if(withRefreshToken) {
            tokenStoragePort.saveRefreshToken(
                    SaveRefreshTokenRequest.newBuilder()
                            .setUserId(userId)
                            .setToken(tokenInfo.getRefreshToken())
                            .setExpiresAt(tokenInfo.getRefreshTokenExpiresAt().toString())
                            .build()
            );
        }
        return tokenInfo;
    }

    @Override
    public String getUserIdFromToken(String token) {
        return tokenProviderPort.getUserId(token);
    }

    @Override
    public AuthChannel getAuthChannelFromToken(String token) {
        return tokenProviderPort.getAuthChannel(token);
    }

    @Override
    public Authority getAuthorityFromToken(String token) {
        return tokenProviderPort.getAuthority(token);
    }

    @Override
    public boolean validateToken(String token) {
        return tokenProviderPort.validateToken(token);
    }

    @Override
    public AuthInfo.TokenInfo refreshToken(String userId, AuthChannel authChannel, String refreshToken) {
        // 리프레시 토큰 존재 여부 확인
        boolean isTokenExist = tokenStoragePort.verifyRefreshToken(
                VerifyRefreshTokenRequest.newBuilder()
                        .setUserId(userId)
                        .setToken(refreshToken)
                        .build()
        ).getSuccess();

        if (!isTokenExist) {
            throw new TokenInvalidException("refresh token not found");
        }

        // 토큰 유효성 검증
        boolean isValidationSuccessed = tokenStoragePort.verifyRefreshToken(
                VerifyRefreshTokenRequest.newBuilder()
                        .setToken(refreshToken)
                        .setUserId(userId)
                        .build()
        ).getSuccess();
        if (!isValidationSuccessed) {
            throw new TokenInvalidException("Refresh token is invalid");
        }

        Authority authority = tokenProviderPort.getAuthority(refreshToken);

        AuthInfo.TokenInfo tokenInfo = createToken(userId, authChannel, true, authority);

        // Refresh 토큰 저장
        tokenStoragePort.saveRefreshToken(
                SaveRefreshTokenRequest.newBuilder()
                        .setUserId(userId)
                        .setToken(tokenInfo.getRefreshToken())
                        .setExpiresAt(tokenInfo.getRefreshTokenExpiresAt().toString())
                        .build()
        );



        return tokenInfo;
    }



    private AuthInfo.TokenInfo createToken(String userId, AuthChannel authChannel, boolean withRefreshToken, Authority authority) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime accessTokenValidity = now.plusSeconds(tokenProviderPort.getAccessTokenExpirationTime());
        LocalDateTime refreshTokenValidity = now.plusSeconds(tokenProviderPort.getRefreshTokenExpirationTime());

        String accessToken = tokenProviderPort.createToken(
                userId,
                authChannel,
                authority,
                accessTokenValidity
        );

        if (!withRefreshToken) {
            return new AuthInfo.TokenInfo(
                    accessToken,
                    null,
                    accessTokenValidity,
                    null
            );
        }

        String refreshToken = tokenProviderPort.createToken(
                userId,
                authChannel,
                authority,
                refreshTokenValidity
        );

        return new AuthInfo.TokenInfo(
                accessToken,
                refreshToken,
                accessTokenValidity,
                refreshTokenValidity
        );
    }
}
