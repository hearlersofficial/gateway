package com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.service.*

interface AuthUserPort {
    fun getAuthUser(uniqueId: String, authChannel: AuthChannel): AuthUser
    fun initializeUser(request: InitializeUserRequest): InitializeUserResponse
    fun connectAuthChannel(request: ConnectAuthChannelRequest): ConnectAuthChannelResponse
    fun updateAuthority(request: UpdateAuthorityRequest): UpdateAuthorityResponse
}
