package com.hearlers.gateway.presentation.rest.v1.auth;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.gateway.application.auth.AuthFacade;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@Slf4j
@RequiredArgsConstructor
@Tag(name = "인증", description = "로그인, 회원가입, 토큰 발급 등 인증 관련 API")
public class AuthController {
    private final AuthFacade authFacade;
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
    public ResponseEntity<ResponseDto.Success<AuthDto.TokenResponseDto>> createUser(HttpServletResponse response) {
        // 퍼사드를 통해 유저 생성 및 토큰 발급
        AuthInfo.TokenInfo tokenInfo = authFacade.createUser();
        
        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, tokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE);
        addCookieToResponse(response, tokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE);
        
        // 응답 매핑
        AuthDto.TokenResponseDto tokenResponseDto = AuthDto.TokenResponseDto.builder()
                .accessToken(tokenInfo.getAccessToken())
                .accessTokenExpiresAt(tokenInfo.getAccessTokenExpiresAt())
                .refreshToken(tokenInfo.getRefreshToken())
                .refreshTokenExpiresAt(tokenInfo.getRefreshTokenExpiresAt())
                .build();
                
        return ResponseDtoUtil.okResponse(tokenResponseDto, "비로그인 유저 생성 성공");
    }

    @Operation(summary = "카카오 로그인 요청", description = "카카오 로그인을 위한 인증 코드 요청, 카카오로 리다이렉트")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오로 리다이렉트"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/auth/login/kakao")
    public void kakao(@RequestAttribute(value = "userId" , required = false) String userId, HttpServletResponse response) throws IOException {
        // 퍼사드를 통해 카카오 로그인 URL 생성
        String redirectUrl = authFacade.generateKakaoLoginUrl(userId);
        response.sendRedirect(redirectUrl);
    }

    @Operation(summary = "카카오 로그인 콜백", description = "카카오 로그인을 통해 받은 인증코드 바탕으로 액세스토큰과 리프레시토큰 발급 후 쿠키에 저장")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오 로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt, refreshToken과 refreshTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/auth/callback/kakao")
    public void kakaoCallback(@RequestParam(value = "code", required = false) String code, @RequestParam("state") String state,
                              HttpServletResponse response) throws IOException {
        // 퍼사드를 통해 카카오 로그인 콜백 처리

        AuthInfo.TokenInfo tokenInfo = authFacade.handleKakaoCallback(code, state);

        // 발급받은 토큰 쿠키에 저장
        addCookieToResponse(response, tokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE);
        addCookieToResponse(response, tokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE);
        addCookieToResponse(response, tokenInfo.getRefreshToken(), REFRESH_TOKEN_COOKIE, REFRESH_TOKEN_MAX_AGE);
        addCookieToResponse(response, tokenInfo.getRefreshTokenExpiresAt().toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, REFRESH_TOKEN_MAX_AGE);

        response.sendRedirect("/");
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

        addCookieToResponse(response, newTokenInfo.getAccessToken(), ACCESS_TOKEN_COOKIE, ACCESS_TOKEN_MAX_AGE);
        addCookieToResponse(response, newTokenInfo.getAccessTokenExpiresAt().toString(), ACCESS_TOKEN_EXPIRES_AT_COOKIE, ACCESS_TOKEN_MAX_AGE);
        addCookieToResponse(response, newTokenInfo.getRefreshToken(), REFRESH_TOKEN_COOKIE, REFRESH_TOKEN_MAX_AGE);
        addCookieToResponse(response, newTokenInfo.getRefreshTokenExpiresAt().toString(), REFRESH_TOKEN_EXPIRES_AT_COOKIE, REFRESH_TOKEN_MAX_AGE);

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
    private void addCookieToResponse(HttpServletResponse response, String value, String name, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(maxAge);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
    }
    
    /**
     * 쿠키에서 값 추출
     */
    private String extractCookieValue(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        throw new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED, "리프레시 토큰이 없습니다.");
    }
}
