package com.hearlers.gateway.presentations.rest.auth;

import static com.hearlers.gateway.presentations.rest.auth.enums.AuthChannel.AUTH_CHANNEL_KAKAO;
import static com.hearlers.gateway.presentations.rest.auth.enums.AuthChannel.AUTH_CHANNEL_NONE;

import com.hearlers.gateway.applications.auth.service.AuthService;
import com.hearlers.gateway.applications.utils.service.UtilService;
import com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto.CreateCookieRequestDto;
import com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto.CreateCookieResponseDto;
import com.hearlers.gateway.presentations.rest.auth.dto.CreateTokenRequestDto;
import com.hearlers.gateway.presentations.rest.auth.dto.CreateUserRequestDto;
import com.hearlers.gateway.shared.guard.dto.TokenDto;
import com.hearlers.gateway.shared.guard.security.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final JwtUtil jwtUtil;
    private final UtilService utilService;

    @Value("${kakao.client_id}")
    String clientId;
    @Value("${kakao.redirect_uri}")
    String redirectUri;

    private static final int ACCESS_TOKEN_MAX_AGE = 60 * 60; // 1시간
    private static final int REFRESH_TOKEN_MAX_AGE = 60 * 60 * 24 * 7; // 7일

    // 비로그인 시 유저 생성
    @PostMapping("/create-user")
    public void createUser(@RequestBody CreateUserRequestDto request, HttpServletResponse response) throws IOException {
        // TODO : request를 바탕으로 내부 서버와 통신하여 CreateUserResponseDto를 받아오기 (return 타입도 변경)

        // 이후 CreateUserResponseDto를 바탕으로 JWT 토큰 발급
        // id 1로 임의로 설정
        CreateTokenRequestDto dto = new CreateTokenRequestDto(1, AUTH_CHANNEL_NONE);
        TokenDto token = jwtUtil.returnToken(dto, false);

        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, token.getAccessToken(), "accessToken", ACCESS_TOKEN_MAX_AGE);
        response.sendRedirect("/");
    }

    @GetMapping("/login/kakao")
    public void kakao(HttpServletResponse response) throws IOException {
        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=").append(clientId);
        url.append("&redirect_uri=").append(redirectUri);
        url.append("&response_type=code");
        response.sendRedirect(url.toString());
    }

    @GetMapping("/callback/kakao")
    public void kakaoCallback(@RequestParam("code") String code, HttpServletResponse response) throws IOException {
        authService.kakaoLogin(code);

        /*
        TODO : 유저 refreshToken 저장해야하니 UserService에 요청 날리기
        * */

        // userId 임의로 1로 설정 (accessToken과 refreshToken 발급)
        TokenDto token = jwtUtil.returnToken(new CreateTokenRequestDto(1, AUTH_CHANNEL_KAKAO), true);

        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, token.getAccessToken(), "accessToken", ACCESS_TOKEN_MAX_AGE);

        // 발급받은 refreshToken 쿠키에 저장
        addCookieToResponse(response, token.getRefreshToken(), "refreshToken", REFRESH_TOKEN_MAX_AGE);

        response.sendRedirect("/");
    }

    private void addCookieToResponse(HttpServletResponse response, String token, String name, int maxAge) {
        CreateCookieRequestDto createCookieRequestDto = CreateCookieRequestDto.builder()
                .token(token)
                .name(name)
                .maxAge(maxAge)
                .httpOnly(true)
                .path("/")
                .build();

        CreateCookieResponseDto createCookieResponseDto = utilService.createCookie(createCookieRequestDto);
        response.addCookie(createCookieResponseDto.getCookie());
    }

}
