package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.com.hearlers.gateway.port.AuthTokenProviderPort
import io.github.oshai.kotlinlogging.KotlinLogging
import io.jsonwebtoken.*
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

private val logger = KotlinLogging.logger {}

@ConfigurationProperties(prefix = "token")
data class JwtProperties(
    val jwt: JwtConfig,
    val accessExpirationTime: Long,
    val refreshExpirationTime: Long,
)

data class JwtConfig(
    val secret: String,
)

@Component
class JwtAuthTokenProviderAdapter(
    jwtProperties: JwtProperties,
) : AuthTokenProviderPort {

    private val key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtProperties.jwt.secret))
    override val accessTokenExpirationTime: Long = jwtProperties.accessExpirationTime
    override val refreshTokenExpirationTime: Long = jwtProperties.refreshExpirationTime

    /**
     * JWT 토큰의 Claims를 파싱합니다. ExpiredJwtException 발생 시에도 Claims를 반환합니다.
     */
    private fun parseClaims(token: String): Claims {
        return try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).body
        } catch (e: ExpiredJwtException) {
            e.claims
        }
    }

    /**
     * JWT 토큰을 검증합니다.
     */
    override fun validateToken(token: String): Boolean {
        return try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token)
            true
        } catch (e: Exception) {
            when (e) {
                is SecurityException, is MalformedJwtException -> logger.debug(e) { "Invalid JWT Token" }
                is ExpiredJwtException -> logger.debug(e) {"Expired JWT Token" }
                is UnsupportedJwtException -> logger.debug(e) { "Unsupported JWT Token" }
                is IllegalArgumentException -> logger.debug(e) { "JWT claims string is empty." }
                else -> {
                    logger.error(e) { "An unexpected error occurred during token validation" }
                }
            }
            false
        }
    }

    /**
     * JWT 토큰이 만료되었는지 확인합니다.
     */
    override fun isTokenExpired(token: String): Boolean {
        return try {
            val claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).body
            claims.expiration.before(Date())
        } catch (e: Exception) {
            when (e) {
                is ExpiredJwtException -> logger.debug(e) { "Token has already expired." }
                is SecurityException, is MalformedJwtException, is UnsupportedJwtException, is IllegalArgumentException ->
                    logger.debug(e) {"Token validation failed, considering as expired." }
                else -> logger.error(e) { "An unexpected error occurred during token expiration check" }
            }
            // 예외 발생 시 만료된 것으로 간주
            true
        }
    }

    /**
     * JWT 토큰에서 사용자 ID를 추출합니다.
     */
    override fun getUserId(token: String): String {
        return parseClaims(token).get("id", String::class.java)
    }

    /**
     * JWT 토큰에서 인증 채널을 추출합니다.
     */
    override fun getAuthChannel(token: String): AuthChannel {
        val authChannelString = parseClaims(token).get("auth_channel", String::class.java)
        return AuthChannel.valueOf(authChannelString)
    }

    /**
     * JWT 토큰에서 권한 정보를 추출합니다.
     */
    override fun getAuthority(token: String): Authority {
        val authorityString = parseClaims(token).get("authority", String::class.java)
        return Authority.valueOf(authorityString)
    }

    /**
     * JWT 토큰을 생성합니다.
     */
    override fun createToken(userId: String, authChannel: AuthChannel, authority: Authority, validity: LocalDateTime): String {
        val now = LocalDateTime.now()
        val claims = Jwts.claims().apply {
            this["id"] = userId
            this["auth_channel"] = authChannel.name
            this["authority"] = authority.name
        }

        return Jwts.builder()
            .setClaims(claims)
            .setIssuedAt(Date.from(now.toInstant(ZoneOffset.UTC)))
            .setExpiration(Date.from(validity.toInstant(ZoneOffset.UTC)))
            .signWith(key, SignatureAlgorithm.HS256)
            .compact()
    }
}
