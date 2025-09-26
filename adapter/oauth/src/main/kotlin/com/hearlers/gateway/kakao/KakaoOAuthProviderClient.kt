package com.hearlers.gateway.kakao

import com.hearlers.gateway.OAuthProviderClient
import com.hearlers.gateway.auth.exception.OauthProcessingErrorException
import com.hearlers.gateway.auth.model.AuthInfo
import com.hearlers.gateway.kakao.dto.KakaoDto
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

@Component
class KakaoOAuthProviderClient : OAuthProviderClient {

    private val kakaoAuthClient = WebClient.create("https://kauth.kakao.com")
    private val kakaoApiClient = WebClient.create("https://kapi.kakao.com")

    override fun getToken(code: String, state: String, clientId: String): AuthInfo.TokenInfo {
        logger.debug { "Requesting Kakao token with code: $code" }

        val response = kakaoAuthClient.post()
            .uri { uriBuilder ->
                uriBuilder
                    .path("/oauth/token")
                    .queryParam("grant_type", "authorization_code")
                    .queryParam("client_id", clientId)
                    .queryParam("code", code)
                    .build()
            }
            .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
            .retrieve()
            .bodyToMono<KakaoDto.KakaoTokenResponse>() // 1. Mono<T> 타입으로 변환
            .block() // 2. 결과가 올 때까지 현재 스레드를 블로킹
            ?: throw OauthProcessingErrorException("Failed to get Kakao user info or response was empty.") // 3. null일 경우 예외 처리


        logger.info { "Received Kakao token response." }
        return response.toTokenInfo()
    }

    override fun getOAuthUser(accessToken: String): AuthInfo.OAuthUserInfo {
        logger.debug { "Requesting Kakao user info." }

        val response = kakaoApiClient.get()
            .uri("/v2/user/me")
            .header(HttpHeaders.AUTHORIZATION, "Bearer $accessToken")
            .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
            .retrieve()
            .bodyToMono<KakaoDto.KakaoAccountInformation>() // 1. Mono<T> 타입으로 변환
            .block() // 2. 결과가 올 때까지 현재 스레드를 블로킹
            ?: throw OauthProcessingErrorException("Failed to get Kakao user info or response was empty.") // 3. null일 경우 예외 처리


        logger.info { "Received Kakao user info for user ID: ${response.id}" }
        return response.toOAuthUserInfo()
    }
}