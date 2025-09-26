package com.hearlers.gateway

import com.hearlers.gateway.auth.model.AuthInfo.OAuthUserInfo
import com.hearlers.gateway.auth.model.AuthInfo.TokenInfo

interface OAuthProviderClient {
    fun getToken(code: String, state: String, clientId: String): TokenInfo
    fun getOAuthUser(accessToken: String): OAuthUserInfo
}