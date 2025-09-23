package com.hearlers.gateway.presentation.http.v1.auth

import com.fasterxml.jackson.databind.ObjectMapper
import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Authority
import com.hearlers.api.proto.v1.service.InitializeUserRequest
import com.hearlers.gateway.AuthUserUseCase
import com.hearlers.gateway.JwtProperties
import com.hearlers.gateway.AuthTokenManagingUseCase
import com.hearlers.gateway.presentation.http.v1.auth.dto.AuthDto
import com.hearlers.gateway.presentation.http.v1.auth.mapper.AuthDtoMapper
import com.hearlers.gateway.shared.exception.HttpException
import com.hearlers.gateway.shared.exception.HttpResultCode
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.security.SecurityRequirements
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.Cookie
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.http.ResponseCookie
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.nio.charset.StandardCharsets
import java.util.*



@RestController
@Tag(name = "인증", description = "로그인, 회원가입, 토큰 발급 등 인증 관련 API")
class AuthController(
    private val authUserUseCase: AuthUserUseCase,
    private val tokenManagingUseCase: AuthTokenManagingUseCase,
    private val objectMapper: ObjectMapper,
    private val jwtProperties: JwtProperties,
    ) {
    private val log = LoggerFactory.getLogger(AuthController::class.java)
    
    companion object {
        private const val REFRESH_TOKEN_COOKIE = "refreshToken"
        private const val ACCESS_TOKEN_COOKIE = "accessToken"
        private const val ACCESS_TOKEN_EXPIRES_AT_COOKIE = "accessTokenExpiresAt"
        private const val REFRESH_TOKEN_EXPIRES_AT_COOKIE = "refreshTokenExpiresAt"
    }

    @SecurityRequirements
    @Operation(summary = "비로그인 유저 생성", description = "비로그인 유저를 생성하고, accessToken 발급")
    @ApiResponses(value = [
        ApiResponse(responseCode = "201", description = "비로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
        ApiResponse(responseCode = "400", description = "비로그인 유저 생성 실패", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
    ])
    @PostMapping("/v1/auth/initiate")
    fun createUser(request: HttpServletRequest, response: HttpServletResponse): ResponseEntity<ResponseDto.Success<AuthDto.TokenResponse>> {
        // 퍼사드를 통해 유저 생성 및 토큰 발급
        val initializeUserResponse = runBlocking {
            authUserUseCase.initializeUser(InitializeUserRequest.newBuilder().build())
        }
        val userId = initializeUserResponse.user.id
        val authChannel = initializeUserResponse.authUser.authChannel
        val tokenInfo = runBlocking {
            tokenManagingUseCase.generateToken(userId, authChannel, false, Authority.AUTHORITY_USER)
        }

        val domain = extractDomainFromOrigin(request.getHeader("Origin"))
        
        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, tokenInfo.accessToken, ACCESS_TOKEN_COOKIE, jwtProperties.accessExpirationTime, domain)
        addCookieToResponse(response, tokenInfo.accessTokenExpiresAt.toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, jwtProperties.accessExpirationTime, domain)
        clearCookie(response, REFRESH_TOKEN_COOKIE, domain) // 비로그인 유저는 리프레시 토큰이 없음
        clearCookie(response, REFRESH_TOKEN_EXPIRES_AT_COOKIE, domain) // 비로그인 유저는 리프레시 토큰이 없음
        
        // 응답 매핑
        val tokenResponseDto = AuthDtoMapper.of(tokenInfo)
        return ResponseDtoUtil.okResponse(tokenResponseDto, "비로그인 유저 생성 성공")
    }

    @Operation(summary = "카카오 로그인 요청", description = "카카오 로그인을 위한 인증 코드 요청, 카카오로 리다이렉트. swagger에서는 사용 불가. a 태그로 접근")
    @ApiResponses(value = [
        ApiResponse(responseCode = "302", description = "카카오로 리다이렉트"),
        ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
    ])
    @GetMapping("/v1/auth/login/kakao")
    fun kakao(
        @RequestAttribute(value = "userId", required = false) userId: String?,
        @RequestParam(value = "redirect-url", required = true)
        @Parameter(description = "로그인 후 리다이렉트할 클라이언트 URL", required = true) 
        redirectUrl: String,
        response: HttpServletResponse
    ) {
        // state 정보 구성 (userId와 redirectUrl)
        val stateInfo = StateInfo(userId, redirectUrl)
        val encodedState = encodeState(stateInfo)
        
        // 퍼사드를 통해 카카오 로그인 URL 생성
        val kakaoAuthUrl = authUserUseCase.generateOAuthLoginUrl(AuthChannel.AUTH_CHANNEL_KAKAO, encodedState)
        response.sendRedirect(kakaoAuthUrl)
    }

    @SecurityRequirements
    @Operation(summary = "카카오 로그인 콜백", description = "카카오 로그인을 통해 받은 인증코드 바탕으로 액세스토큰과 리프레시토큰 발급 후 쿠키에 저장")
    @ApiResponses(value = [
        ApiResponse(responseCode = "302", description = "카카오 로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt, refreshToken과 refreshTokenExpiresAt 저장"),
        ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
    ])
    @GetMapping("/v1/auth/callback/kakao")
    fun kakaoCallback(
        @RequestParam(value = "code", required = true) code: String,
        @RequestParam("state") encodedState: String,
        response: HttpServletResponse
    ) {
        // state 디코딩
        val stateInfo = decodeState(encodedState)
        val userId = stateInfo.userId
        val clientRedirectUrl = stateInfo.redirectUrl

        val authUser = runBlocking {
            authUserUseCase.oauthLogin(AuthChannel.AUTH_CHANNEL_KAKAO, code, encodedState, userId)
        }
        val tokenInfo = runBlocking {
            tokenManagingUseCase.generateToken(authUser.userId, authUser.authChannel, true, authUser.authority)
        }

        val domain = extractDomainFromOrigin(clientRedirectUrl)
        // 발급받은 토큰 쿠키에 저장
        addCookieToResponse(response, tokenInfo.accessToken, ACCESS_TOKEN_COOKIE, jwtProperties.accessExpirationTime, domain)
        addCookieToResponse(response, tokenInfo.accessTokenExpiresAt.toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, jwtProperties.accessExpirationTime, domain)
        addCookieToResponse(response, tokenInfo.refreshToken, REFRESH_TOKEN_COOKIE, jwtProperties.refreshExpirationTime, domain)
        addCookieToResponse(response, tokenInfo.refreshTokenExpiresAt.toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, jwtProperties.refreshExpirationTime, domain)

        // 클라이언트로 리다이렉트
        response.sendRedirect(clientRedirectUrl)
    }

    @Operation(summary = "액세스 토큰 재발급", description = "리프레시 토큰으로 액세스 토큰 재발급")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "액세스 토큰 재발급 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
        ApiResponse(responseCode = "401", description = "리프레시 토큰 만료 또는 유효하지 않음", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]),
        ApiResponse(responseCode = "500", description = "서버 오류", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
    ])
    @PostMapping("/v1/auth/refresh")
    fun refreshToken(
        @RequestAttribute(value = "userId", required = true) userId: String, 
        @RequestAttribute(value = "authChannel", required = true) authChannel: AuthChannel, 
        request: HttpServletRequest, 
        response: HttpServletResponse
    ): ResponseEntity<ResponseDto.Success<AuthDto.TokenResponse>> {
        val refreshToken = extractCookieValue(request, REFRESH_TOKEN_COOKIE)
        val newTokenInfo = runBlocking {
            tokenManagingUseCase.refreshToken(userId, authChannel, refreshToken)
        }

        val domain = extractDomainFromOrigin(request.getHeader("Origin"))

        addCookieToResponse(response, newTokenInfo.accessToken, ACCESS_TOKEN_COOKIE, jwtProperties.accessExpirationTime, domain)
        addCookieToResponse(response, newTokenInfo.accessTokenExpiresAt.toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, jwtProperties.accessExpirationTime, domain)
        addCookieToResponse(response, newTokenInfo.refreshToken, REFRESH_TOKEN_COOKIE, jwtProperties.refreshExpirationTime, domain)
        addCookieToResponse(response, newTokenInfo.refreshTokenExpiresAt.toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, jwtProperties.refreshExpirationTime, domain)

        val tokenResponseDto = AuthDtoMapper.of(newTokenInfo)
        return ResponseDtoUtil.okResponse(tokenResponseDto, "토큰 갱신 성공")
    }

    /**
     * 쿠키를 응답에 추가
     */
    private fun addCookieToResponse(response: HttpServletResponse, value: String, name: String, maxAge: Long, domain: String?) {
        val isLocalhost = domain != null && domain.contains("localhost")

        val builder = ResponseCookie.from(name, value)
            .maxAge(maxAge)
            .secure(!isLocalhost)
            .httpOnly(true)
            .path("/")
            .sameSite("None")

        if (isLocalhost) {
            builder.sameSite("Lax")  // None 대신 Lax 또는 생략
            builder.secure(false)    // Secure 사용하지 않음
        } else {
            builder.sameSite("None") // 크로스사이트 허용
            builder.secure(true)     // 반드시 Secure 포함
        }

        if (domain != null && domain.isNotBlank()) {
            builder.domain(domain)
        }

        val cookie = builder.build()
        response.addHeader("Set-Cookie", cookie.toString())
    }

    private fun clearCookie(response: HttpServletResponse, cookieName: String, domain: String?) {
        val cookie = Cookie(cookieName, null)
        cookie.maxAge = 0 // 삭제
        cookie.path = "/" // 경로 일치 필요
        cookie.isHttpOnly = true
        cookie.secure = true
        if (domain != null) cookie.domain = domain
        response.addCookie(cookie)
    }

    private fun extractCookieValue(request: HttpServletRequest, cookieName: String): String {
        val cookies = request.cookies ?: throw HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED, "리프레시 토큰이 없습니다.")

        return cookies
            .filter { cookie -> cookieName == cookie.name }
            .map { it.value }
            .firstOrNull()
            ?: throw HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED, "리프레시 토큰이 없습니다.")
    }

    private fun extractDomainFromOrigin(origin: String?): String? {
        if (origin.isNullOrBlank()) {
            return null
        }

        return try {
            val uri = URI.create(origin)
            val host = uri.host

            if (host.isNullOrBlank()) {
                return null
            }

            if (host == "localhost") {
                return "localhost"
            }
            
            val parts = host.split(".")
            // 3개 이상이어야 와일드카드 처리 가능
            if (parts.size >= 3) {
                // 예: admin.dev.hearlers.com → parts = [admin, dev, hearlers, com]
                // .dev.hearlers.com → parts[parts.length-3] ~ 끝까지
                return parts.slice(parts.size - 3 until parts.size).joinToString(".")
            }
            // 2개 이하면 그냥 원본 도메인 앞에 dot
            ".$host"
        } catch (e: Exception) {
            null
        }
    }

    /**
     * state 정보를 Base64로 인코딩
     */
    private fun encodeState(stateInfo: StateInfo): String {
        return try {
            val stateJson = objectMapper.writeValueAsString(stateInfo)
            Base64.getUrlEncoder().encodeToString(stateJson.toByteArray(StandardCharsets.UTF_8))
        } catch (e: Exception) {
            log.error("state 인코딩 실패", e)
            throw HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "state 인코딩 실패")
        }
    }

    /**
     * Base64로 인코딩된 state 정보를 디코딩
     */
    private fun decodeState(encodedState: String): StateInfo {
        return try {
            val decodedBytes = Base64.getUrlDecoder().decode(encodedState)
            val stateJson = String(decodedBytes, StandardCharsets.UTF_8)
            objectMapper.readValue(stateJson, StateInfo::class.java)
        } catch (e: Exception) {
            log.error("state 디코딩 실패", e)
            throw HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "state 디코딩 실패")
        }
    }

    /**
     * state 정보를 담는 데이터 클래스
     */
    data class StateInfo(
        val userId: String?,
        val redirectUrl: String
    )
}
