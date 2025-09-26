package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.gateway.auth.model.AuthInfo.TokenInfo

interface AuthTokenManagingUseCase {
    fun generateToken(
        userId: String,
        authChannel: AuthChannel,
        withRefreshToken: Boolean,
        authority: Authority
    ): TokenInfo

    fun getUserIdFromToken(token: String): String
    fun getAuthChannelFromToken(token: String): AuthChannel
    fun getAuthorityFromToken(token: String): Authority
    fun validateToken(token: String): Boolean
    fun refreshToken(userId: String, authChannel: AuthChannel, refreshToken: String): TokenInfo
}
