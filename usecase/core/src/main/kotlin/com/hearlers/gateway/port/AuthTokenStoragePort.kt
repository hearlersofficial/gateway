package com.hearlers.gateway.port

import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse

interface AuthTokenStoragePort {
    suspend fun saveRefreshToken(request: SaveRefreshTokenRequest): SaveRefreshTokenResponse
    suspend fun verifyRefreshToken(request: VerifyRefreshTokenRequest): VerifyRefreshTokenResponse
}
