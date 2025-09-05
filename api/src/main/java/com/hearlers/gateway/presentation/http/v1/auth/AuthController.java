package com.hearlers.gateway.presentation.http.v1.auth;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.Cookie;
import lombok.*;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.gateway.application.auth.AuthFacade;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.shared.exception.HttpException;
import com.hearlers.gateway.shared.exception.HttpResultCode;
import com.hearlers.gateway.shared.response.ResponseDto;
import com.hearlers.gateway.shared.response.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequiredArgsConstructor
@Tag(name = "인증", description = "로그인, 회원가입, 토큰 발급 등 인증 관련 API")
public class AuthController {
    private static final Logger log = LoggerFactory.getLogger(AuthController.class);
    private final AuthFacade authFacade;
    private final ObjectMapper objectMapper;
    private static final int ACCESS_TOKEN_MAX_AGE = 60 * 60; // 1시간
    private static final int REFRESH_TOKEN_MAX_AGE = 60 * 60 * 24 * 7; // 7일
    private static final String REFRESH_TOKEN_COOKIE = "refreshToken";
    private static final String ACCESS_TOKEN_COOKIE = "accessToken";
    private static final String ACCESS_TOKEN_EXPIRES_AT_COOKIE = "accessTokenExpiresAt";
    private static final String REFRESH_TOKEN_EXPIRES_AT_COOKIE = "refreshTokenExpiresAt";

    @SecurityRequirements
    @Operation(summary = "비로그인 유저 생성", description = "비로그인 유저를 생성하고, accessToken 발급")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "비로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "비로그인 유저 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/auth/initiate")
    public ResponseEntity<ResponseDto.Success<AuthDto.TokenResponseDto>> createUser(HttpServletRequest request, HttpServletResponse response) {
        // 퍼사드를 통해 유저 생성 및 토큰 발급
        AuthInfo.TokenInfo tokenInfo = authFacade.createUser();
        String domain = extractDomainFromOrigin(request.getHeader("Origin"));
        
        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, tokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, tokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE, domain);
        clearCookie(response, REFRESH_TOKEN_COOKIE, domain); // 비로그인 유저는 리프레시 토큰이 없음
        clearCookie(response, REFRESH_TOKEN_EXPIRES_AT_COOKIE, domain); // 비로그인 유저는 리프레시 토큰이 없음
        
        // 응답 매핑
        AuthDto.TokenResponseDto tokenResponseDto = AuthDto.TokenResponseDto.builder()
                .accessToken(tokenInfo.getAccessToken())
                .accessTokenExpiresAt(tokenInfo.getAccessTokenExpiresAt())
                .refreshToken(tokenInfo.getRefreshToken())
                .refreshTokenExpiresAt(tokenInfo.getRefreshTokenExpiresAt())
                .build();
                
        return ResponseDtoUtil.okResponse(tokenResponseDto, "비로그인 유저 생성 성공");
    }

    @Operation(summary = "카카오 로그인 요청", description = "카카오 로그인을 위한 인증 코드 요청, 카카오로 리다이렉트. swagger에서는 사용 불가. a 태그로 접근")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오로 리다이렉트"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/auth/login/kakao")
    public void kakao(
            @RequestAttribute(value = "userId", required = false) String userId,
            @RequestParam(value = "redirect-url", required = true)
            @Parameter(description = "로그인 후 리다이렉트할 클라이언트 URL", required = true) 
            String redirectUrl,
            HttpServletResponse response) throws IOException {

        // state 정보 구성 (userId와 redirectUrl)
        StateInfo stateInfo = new StateInfo(userId, redirectUrl);
        String encodedState = encodeState(stateInfo);
        
        // 퍼사드를 통해 카카오 로그인 URL 생성
        String kakaoAuthUrl = authFacade.generateOAuthLoginUrl(AuthChannel.AUTH_CHANNEL_KAKAO ,encodedState);
        response.sendRedirect(kakaoAuthUrl);
    }

    @SecurityRequirements
    @Operation(summary = "카카오 로그인 콜백", description = "카카오 로그인을 통해 받은 인증코드 바탕으로 액세스토큰과 리프레시토큰 발급 후 쿠키에 저장")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오 로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt, refreshToken과 refreshTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/auth/callback/kakao")
    public void kakaoCallback(
            @RequestParam(value = "code", required = false) String code, 
            @RequestParam("state") String encodedState,
            HttpServletResponse response) throws IOException {
        
        // state 디코딩
        StateInfo stateInfo = decodeState(encodedState);
        String userId = stateInfo.getUserId();
        String clientRedirectUrl = stateInfo.getRedirectUrl();

        // 퍼사드를 통해 카카오 로그인 콜백 처리
        AuthInfo.TokenInfo tokenInfo = authFacade.handleOAuthCallback(AuthChannel.AUTH_CHANNEL_KAKAO ,code, encodedState, userId);

        String domain = extractDomainFromOrigin(clientRedirectUrl);
        // 발급받은 토큰 쿠키에 저장
        addCookieToResponse(response, tokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, tokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE, domain); ;
        addCookieToResponse(response, tokenInfo.getRefreshToken(), REFRESH_TOKEN_COOKIE, REFRESH_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, tokenInfo.getRefreshTokenExpiresAt().toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, REFRESH_TOKEN_MAX_AGE, domain);

        // 클라이언트로 리다이렉트
        response.sendRedirect(clientRedirectUrl);
    }

    @Operation(summary = "액세스 토큰 재발급", description = "리프레시 토큰으로 액세스 토큰 재발급")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "액세스 토큰 재발급 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "401", description = "리프레시 토큰 만료 또는 유효하지 않음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "500", description = "서버 오류", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/auth/refresh")
    public ResponseEntity<ResponseDto.Success<AuthDto.TokenResponseDto>> refreshToken(@RequestAttribute(value = "userId" , required = true) String userId, @RequestAttribute(value = "authChannel" , required = true) AuthChannel authChannel, HttpServletRequest request, HttpServletResponse response) {
        String refreshToken = extractCookieValue(request, REFRESH_TOKEN_COOKIE);
        AuthInfo.TokenInfo newTokenInfo = authFacade.refreshToken(userId, authChannel, refreshToken);

        String domain = extractDomainFromOrigin(request.getHeader("Origin"));

        addCookieToResponse(response, newTokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, newTokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, newTokenInfo.getRefreshToken(), REFRESH_TOKEN_COOKIE, REFRESH_TOKEN_MAX_AGE, domain);
        addCookieToResponse(response, newTokenInfo.getRefreshTokenExpiresAt().toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, REFRESH_TOKEN_MAX_AGE, domain);

        AuthDto.TokenResponseDto tokenResponseDto = AuthDto.TokenResponseDto.builder()
                .accessToken(newTokenInfo.getAccessToken())
                .accessTokenExpiresAt(newTokenInfo.getAccessTokenExpiresAt())
                .refreshToken(newTokenInfo.getRefreshToken())
                .refreshTokenExpiresAt(newTokenInfo.getRefreshTokenExpiresAt())
                .build();

        return ResponseDtoUtil.okResponse(tokenResponseDto, "토큰 갱신 성공");
    }

    /**
     * 쿠키를 응답에 추가
     */
    private void addCookieToResponse(HttpServletResponse response, String value, String name, int maxAge, String domain) {
        boolean isLocalhost = domain != null && domain.contains("localhost");

        ResponseCookie.ResponseCookieBuilder builder = ResponseCookie.from(name, value)
                .maxAge(maxAge)
                .secure(!isLocalhost)
                .httpOnly(true)
                .path("/")
                .sameSite("None");

        if (isLocalhost) {
            builder.sameSite("Lax");  // None 대신 Lax 또는 생략
            builder.secure(false);    // Secure 사용하지 않음
        } else {
            builder.sameSite("None"); // 크로스사이트 허용
            builder.secure(true);     // 반드시 Secure 포함
        }

        if (domain != null && !domain.isBlank()) {
            builder.domain(domain);
        }

        ResponseCookie cookie = builder.build();

        response.addHeader("Set-Cookie", cookie.toString());
    }

    private void clearCookie(HttpServletResponse response, String cookieName, String domain) {
        Cookie cookie = new Cookie(cookieName, null);
        cookie.setMaxAge(0); // 삭제
        cookie.setPath("/"); // 경로 일치 필요
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        if (domain != null) cookie.setDomain(domain);
        response.addCookie(cookie);
    }


    private String extractCookieValue(HttpServletRequest request, String cookieName) {
        if (request.getCookies() == null) {
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED, "리프레시 토큰이 없습니다.");
        }

        return Arrays.stream(request.getCookies())
                .filter(cookie -> cookieName.equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
                .orElseThrow(() -> new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED, "리프레시 토큰이 없습니다."));
    }



    private String extractDomainFromOrigin(String origin) {
        if (origin == null || origin.isBlank()) {
            return null;
        }

        try {
            URI uri = URI.create(origin);
            String host = uri.getHost();

            if (host == null || host.isBlank()) {
                return null;
            }

            if (host.equals("localhost")) {
                return "localhost";
            }
            String[] parts = host.split("\\.");
            // 3개 이상이어야 와일드카드 처리 가능
            if (parts.length >= 3) {
                // 예: admin.dev.hearlers.com → parts = [admin, dev, hearlers, com]
                // .dev.hearlers.com → parts[parts.length-3] ~ 끝까지
                return String.join(".", java.util.Arrays.copyOfRange(parts, parts.length - 3, parts.length));
            }
            // 2개 이하면 그냥 원본 도메인 앞에 dot
            return "." + host;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * state 정보를 Base64로 인코딩
     */
    private String encodeState(StateInfo stateInfo) {
        try {
            String stateJson = objectMapper.writeValueAsString(stateInfo);
            return Base64.getUrlEncoder().encodeToString(stateJson.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            log.error("state 인코딩 실패", e);
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "state 인코딩 실패");
        }
    }

    /**
     * Base64로 인코딩된 state 정보를 디코딩
     */
    private StateInfo decodeState(String encodedState) {
        try {
            byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedState);
            String stateJson = new String(decodedBytes, StandardCharsets.UTF_8);
            return objectMapper.readValue(stateJson, StateInfo.class);
        } catch (Exception e) {
            log.error("state 디코딩 실패", e);
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR, "state 디코딩 실패");
        }
    }

    /**
     * state 정보를 담는 내부 클래스
     */
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class StateInfo {
        private String userId;
        private String redirectUrl;
    }
}
