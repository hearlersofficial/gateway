package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.gateway.shared.guard.security.JwtUtil;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

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
            String userId = claims.get("id", String.class);
            String authChannel = claims.get("auth_channel", String.class);
            
            // 여기서 Spring Security 인증 객체 생성 필요
            List<GrantedAuthority> authorities = new ArrayList<>();
            // 기본적으로 USER 권한 부여
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            
            // 어드민 사용자라면 ADMIN 권한도 부여 (실제 구현에 맞게 조정 필요)
            if (claims.get("is_admin", Boolean.class) != null && claims.get("is_admin", Boolean.class)) {
                authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            }
            
            // 인증 객체 생성 및 SecurityContext에 설정
            UsernamePasswordAuthenticationToken authentication = 
                    new UsernamePasswordAuthenticationToken(userId, null, authorities);
                    
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            
            // 토큰에서 필요한 정보를 request에 저장
            request.setAttribute("userId", userId);
            request.setAttribute("authChannel", authChannel);
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
