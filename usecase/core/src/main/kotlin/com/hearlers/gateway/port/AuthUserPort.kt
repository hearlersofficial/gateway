package com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.service.*

interface AuthUserPort {
    suspend fun getAuthUser(uniqueId: String, authChannel: AuthChannel): AuthUser
    suspend fun initializeUser(request: InitializeUserRequest): InitializeUserResponse
    suspend fun connectAuthChannel(request: ConnectAuthChannelRequest): ConnectAuthChannelResponse
    suspend fun updateAuthority(request: UpdateAuthorityRequest): UpdateAuthorityResponse
}
