package com.hearlers.gateway

import com.hearlers.gateway.auth.model.AuthInfo.OAuthUserInfo
import com.hearlers.gateway.auth.model.AuthInfo.TokenInfo

interface OAuthProviderClient {
    suspend fun getToken(code: String, state: String, clientId: String): TokenInfo
    suspend fun getOAuthUser(accessToken: String): OAuthUserInfo
}