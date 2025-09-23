package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest
import com.hearlers.com.hearlers.gateway.port.AuthTokenProviderPort
import com.hearlers.gateway.auth.exception.TokenInvalidException
import com.hearlers.gateway.auth.model.AuthInfo
import com.hearlers.gateway.port.AuthTokenStoragePort
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Component
import java.time.LocalDateTime


private val logger = KotlinLogging.logger {}

@Component
class AuthTokenManagingService(
    private val authTokenStoragePort: AuthTokenStoragePort,
    private val tokenProviderPort: AuthTokenProviderPort
) : AuthTokenManagingUseCase {

    override suspend fun generateToken(userId: String, authChannel: AuthChannel, withRefreshToken: Boolean, authority: Authority): AuthInfo.TokenInfo {
        val tokenInfo = createToken(userId, authChannel, withRefreshToken, authority)
        if (withRefreshToken) {
            authTokenStoragePort.saveRefreshToken(
                SaveRefreshTokenRequest.newBuilder()
                    .setUserId(userId)
                    .setToken(tokenInfo.refreshToken!!) // `withRefreshToken`이 true일 때 non-null이 보장됨
                    .setExpiresAt(tokenInfo.refreshTokenExpiresAt!!.toString()) // `withRefreshToken`이 true일 때 non-null이 보장됨
                    .build()
            )
        }
        return tokenInfo
    }

    override fun getUserIdFromToken(token: String): String =
        tokenProviderPort.getUserId(token)

    override fun getAuthChannelFromToken(token: String): AuthChannel =
        tokenProviderPort.getAuthChannel(token)

    override fun getAuthorityFromToken(token: String): Authority =
        tokenProviderPort.getAuthority(token)

    override fun validateToken(token: String): Boolean =
        tokenProviderPort.validateToken(token)

    override suspend fun refreshToken(userId: String, authChannel: AuthChannel, refreshToken: String): AuthInfo.TokenInfo {
        // 리프레시 토큰 존재 여부 확인
        val isTokenExist = authTokenStoragePort.verifyRefreshToken(
            VerifyRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(refreshToken)
                .build()
        ).success

        if (!isTokenExist) {
            throw TokenInvalidException("refresh token not found")
        }

        // 토큰 유효성 검증
        val isValidationSuccessed = authTokenStoragePort.verifyRefreshToken(
            VerifyRefreshTokenRequest.newBuilder()
                .setToken(refreshToken)
                .setUserId(userId)
                .build()
        ).success

        if (!isValidationSuccessed) {
            throw TokenInvalidException("Refresh token is invalid")
        }

        val authority = tokenProviderPort.getAuthority(refreshToken)

        val tokenInfo = createToken(userId, authChannel, true, authority)

        // Refresh 토큰 저장
        authTokenStoragePort.saveRefreshToken(
            SaveRefreshTokenRequest.newBuilder()
                .setUserId(userId)
                .setToken(tokenInfo.refreshToken!!) // `createToken`에서 true 플래그로 생성 시 non-null이 보장됨
                .setExpiresAt(tokenInfo.refreshTokenExpiresAt!!.toString()) // `createToken`에서 true 플래그로 생성 시 non-null이 보장됨
                .build()
        )

        return tokenInfo
    }

    private fun createToken(userId: String, authChannel: AuthChannel, withRefreshToken: Boolean, authority: Authority): AuthInfo.TokenInfo {
        val now = LocalDateTime.now()
        val accessTokenValidity = now.plusSeconds(tokenProviderPort.accessTokenExpirationTime)


        val accessToken = tokenProviderPort.createToken(
            userId,
            authChannel,
            authority,
            accessTokenValidity
        )

        if (!withRefreshToken) {
            return AuthInfo.TokenInfo(
                accessToken,
                null,
                accessTokenValidity,
                null
            )
        }

        val refreshTokenValidity = now.plusSeconds(tokenProviderPort.refreshTokenExpirationTime)
        val refreshToken = tokenProviderPort.createToken(
            userId,
            authChannel,
            authority,
            refreshTokenValidity
        )

        return AuthInfo.TokenInfo(
            accessToken,
            refreshToken,
            accessTokenValidity,
            refreshTokenValidity
        )
    }
}
