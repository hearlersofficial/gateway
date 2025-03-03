package com.hearlers.gateway.security;

import com.hearlers.gateway.shared.guard.security.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return;
        }

        String token = Arrays.stream(cookies)
                .filter(cookie -> "accessToken".equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
                .orElse(null);

        if (token == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return;
        }

        // 토큰 만료 여부 검사
        if (jwtUtil.isTokenExpired(token)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return;
        }

        // 토큰 유효성 검사
        if (!jwtUtil.validateToken(token)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Invalid or Expired JWT");
            return;
        }

        try {
            Claims claims = jwtUtil.parseClaims(token);
            // 토큰에서 필요한 정보를 request에 저장
            request.setAttribute("userId", claims.get("id", String.class));
            request.setAttribute("authChannel", claims.get("auth_channel", String.class));
        } catch (Exception e) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Invalid or Expired JWT");
            return;
        }

        // 인증이 완료되었으므로, 필터 체인의 다음 필터로 요청을 전달
        filterChain.doFilter(request, response);
    }

    // 필터 적용 X 경로 설정
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String[] excludePaths = {"/auth/v1/initiate", "/auth/callback/kakao",
                "/swagger-ui", "/v3/api-docs"};

        String path = request.getRequestURI();

        return Arrays.stream(excludePaths).anyMatch(path::startsWith);
    }
}
