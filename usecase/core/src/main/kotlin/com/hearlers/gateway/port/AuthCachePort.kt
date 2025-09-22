package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.AuthUser

interface AuthCachePort {
    fun set(code: String, state: String, authUser: AuthUser)
    fun get(code: String, state: String): AuthUser?
}