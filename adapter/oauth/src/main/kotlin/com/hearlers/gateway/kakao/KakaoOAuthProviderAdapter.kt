package com.hearlers.gateway.kakao

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.gateway.auth.model.AuthInfo
import com.hearlers.gateway.port.OAuthProviderPort
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@ConfigurationProperties(prefix = "kakao")
data class KakaoProperties(
    val clientId: String,
    val redirectUri: String,
    val adminUniqueIds: List<String> = emptyList(),
)

@Service
class KakaoOAuthProviderAdapter(
    private val kakaoProperties: KakaoProperties,
    private val kakaoOAuthProviderClient: KakaoOAuthProviderClient
) : OAuthProviderPort {

    override var supportedChannel: AuthChannel = AuthChannel.AUTH_CHANNEL_KAKAO

    override fun generateAuthorizationUrl(state: String): String {
        return "https://kauth.kakao.com/oauth/authorize?" +
                "client_id=${kakaoProperties.clientId}" +
                "&redirect_uri=${kakaoProperties.redirectUri}" +
                "&response_type=code" +
                "&state=$state"
    }

    override fun getUserInfo(code: String, state: String): AuthInfo.OAuthUserInfo {
        val tokenInfo = kakaoOAuthProviderClient.getToken(code, state, kakaoProperties.clientId)
        // accessToken이 nullable일 수 있으므로 non-null 단언 또는 안전 호출 필요
        return kakaoOAuthProviderClient.getOAuthUser(tokenInfo.accessToken!!)
    }

    override fun evaluateAuthority(authUser: AuthUser, uniqueId: String): Authority {
        // 카카오에서는 관리자 고유 ID 목록에 포함되어 있으면 관리자 권한 부여
        if (uniqueId in kakaoProperties.adminUniqueIds) {
            logger.info { "Admin user detected. uniqueId: $uniqueId" }
            return Authority.AUTHORITY_ADMIN
        }

        // 기본적으로 일반 사용자 권한 부여
        return Authority.AUTHORITY_USER
    }
}