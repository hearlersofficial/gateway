package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.AuthCachePort
import com.hearlers.gateway.auth.exception.AuthUserNotFoundException
import com.hearlers.gateway.auth.model.AuthInfo
import com.hearlers.gateway.factory.OAuthProviderFactory
import com.hearlers.gateway.port.AuthUserPort
import com.hearlers.gateway.port.OAuthProviderPort
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class AuthUserService(
    private val oAuthProviderFactory: OAuthProviderFactory,
    private val authUserPort: AuthUserPort,
    private val authCachePort: AuthCachePort
) : AuthUserUseCase {


    override fun initializeUser(request: InitializeUserRequest): InitializeUserResponse {
        return authUserPort.initializeUser(request)
    }

    override fun generateOAuthLoginUrl(authChannel: AuthChannel, state: String): String {
        val providerPort: OAuthProviderPort = oAuthProviderFactory.getOAuthProviderPort(authChannel)
        return providerPort.generateAuthorizationUrl(state)
    }

    override fun oauthLogin(authChannel: AuthChannel, code: String, state: String, userId: String?): AuthUser {
        // NOTE: 뒤로가기 등으로 중복 요청이 들어온 경우 중복 요청을 방지하기 위해 5초간만 멱등 응답을 줌
        val existingValue = authCachePort.get(code, state)
        if (existingValue != null) return existingValue

        val providerPort: OAuthProviderPort = oAuthProviderFactory.getOAuthProviderPort(authChannel)
        
        val oAuthUserInfo: AuthInfo.OAuthUserInfo = providerPort.getUserInfo(code, state)
        val uniqueId: String = oAuthUserInfo.id

        return try {
            // 기존 사용자 조회
            logger.info { "oauthLogin - userId: $userId, uniqueId: $uniqueId, authChannel: $authChannel" }
            val authUser: AuthUser = authUserPort.getAuthUser(uniqueId, authChannel)

            // 권한 평가 및 필요시 업데이트
            evaluateAndUpdateAuthority(authUser, uniqueId, providerPort)
        } catch (e: AuthUserNotFoundException) {
            // 신규 로그인의 경우
            if (userId == null || userId.isEmpty()) {
                val newAuthUser: AuthUser = handleNewOAuthLogin(uniqueId, authChannel)
                evaluateAndUpdateAuthority(newAuthUser, uniqueId, providerPort)
            } else {
                val connectedAuthUser: AuthUser = handleTempUserOAuthLogin(userId, uniqueId, authChannel)
                evaluateAndUpdateAuthority(connectedAuthUser, uniqueId, providerPort)
            }
        }
    }
    
    /**
     * 사용자 권한을 평가하고 필요한 경우 업데이트합니다.
     */
    private fun evaluateAndUpdateAuthority(authUser: AuthUser, uniqueId: String, providerPort: OAuthProviderPort): AuthUser {
        // OAuth 제공자로부터 권한 평가 받기
        val expectedAuthority: Authority = providerPort.evaluateAuthority(authUser, uniqueId)
        val currentAuthority: Authority = authUser.authority
        
        // 현재 권한과 기대 권한이 다르면 업데이트
        if (currentAuthority != expectedAuthority) {
            logger.info { "Updating authority for user: ${authUser.userId} from $currentAuthority to $expectedAuthority" }
            val response: UpdateAuthorityResponse = authUserPort.updateAuthority(
                UpdateAuthorityRequest.newBuilder()
                    .setAuthUserId(authUser.id)
                    .setAuthority(expectedAuthority)
                    .build()
            )
            return response.authUser
        }
        
        return authUser
    }
    
    /**
     * 새로운 OAuth 로그인 처리
     */
    private fun handleNewOAuthLogin(uniqueId: String, authChannel: AuthChannel): AuthUser {
        // 새 사용자 생성
        val user: User = authUserPort.initializeUser(InitializeUserRequest.newBuilder().build()).user
        
        // OAuth 채널 연결
        val request: ConnectAuthChannelRequest = createConnectAuthChannelRequest(user.id, uniqueId, authChannel)
        val response: ConnectAuthChannelResponse = authUserPort.connectAuthChannel(request)
        
        return response.authUser
    }
    
    /**
     * 임시 유저를 OAuth 계정과 연결
     */
    private fun handleTempUserOAuthLogin(userId: String, oAuthUniqueId: String, authChannel: AuthChannel): AuthUser {
        val request: ConnectAuthChannelRequest = createConnectAuthChannelRequest(userId, oAuthUniqueId, authChannel)
        val response: ConnectAuthChannelResponse = authUserPort.connectAuthChannel(request)
        return response.authUser
    }

    /**
     * OAuth 채널 연결 요청 생성
     */
    private fun createConnectAuthChannelRequest(userId: String, uniqueId: String, authChannel: AuthChannel): ConnectAuthChannelRequest {
        return ConnectAuthChannelRequest.newBuilder()
                .setUserId(userId)
                .setAuthChannel(authChannel)
                .setUniqueId(uniqueId)
                .build()
    }
}
