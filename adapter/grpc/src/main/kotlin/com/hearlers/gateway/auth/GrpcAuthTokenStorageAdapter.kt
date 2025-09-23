package com.hearlers.gateway.auth

import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse
import com.hearlers.api.proto.v1.service.UserServiceGrpcKt
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse
import com.hearlers.gateway.port.AuthTokenStoragePort
import org.springframework.stereotype.Component

@Component
class GrpcAuthTokenStorageAdapter(
    private val userServiceCoroutineStub: UserServiceGrpcKt.UserServiceCoroutineStub
) : AuthTokenStoragePort {

    override suspend fun saveRefreshToken(request: SaveRefreshTokenRequest): SaveRefreshTokenResponse {
        return userServiceCoroutineStub.saveRefreshToken(request)
    }

    override suspend fun verifyRefreshToken(request: VerifyRefreshTokenRequest): VerifyRefreshTokenResponse {
        return userServiceCoroutineStub.verifyRefreshToken(request)
    }
}
