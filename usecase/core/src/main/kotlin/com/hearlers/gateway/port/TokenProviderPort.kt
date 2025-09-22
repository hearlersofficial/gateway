package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Authority
import java.time.LocalDateTime

interface TokenProviderPort {
    fun validateToken(token: String): Boolean
    fun isTokenExpired(token: String): Boolean
    fun getUserId(token: String): String
    fun getAuthChannel(token: String): AuthChannel
    fun getAuthority(token: String): Authority
    fun createToken(
        userId: String,
        authChannel: AuthChannel,
        authority: Authority,
        validity: LocalDateTime
    ): String
    val accessTokenExpirationTime: Long
    val refreshTokenExpirationTime: Long
}