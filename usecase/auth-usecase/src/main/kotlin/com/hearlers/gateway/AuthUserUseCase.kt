package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.service.InitializeUserRequest
import com.hearlers.api.proto.v1.service.InitializeUserResponse

interface AuthUserUseCase {
    /**
     * 사용자 초기화
     */
    suspend fun initializeUser(request: InitializeUserRequest): InitializeUserResponse

    /**
     * OAuth 로그인 URL 생성
     */
    fun generateOAuthLoginUrl(authChannel: AuthChannel, state: String): String

    /**
     * OAuth 로그인 처리
     */
    suspend fun oauthLogin(authChannel: AuthChannel, code: String, state: String, userId: String?): AuthUser
}
