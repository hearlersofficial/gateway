package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.gateway.application.auth.JwtTokenManager;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    private final JwtTokenManager jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // 비인증 경로는 토큰 검사하지 않음
        if (shouldNotFilter(request)) {
            filterChain.doFilter(request, response);
            return;
        }

        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            log.debug("쿠키가 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.COOKIE_NOT_FOUND);
        }

        String token = Arrays.stream(cookies)
                .filter(cookie -> "accessToken".equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
                .orElse(null);

        if (token == null) {
            log.debug("액세스 토큰 쿠키가 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.ACCESS_TOKEN_EXPIRED);
        }

        try {
            // 토큰 유효성 및 만료 검사는 jwtUtil 내부에서 처리
            if (!jwtUtil.validateToken(token)) {
                throw new HttpException(HttpResultCode.ACCESS_TOKEN_INVALID);
            }

            Claims claims = jwtUtil.parseClaims(token);
            String userId = claims.get("id", String.class);
            String authChannel = claims.get("auth_channel", String.class);
            
            // Spring Security 인증 객체 생성
            List<GrantedAuthority> authorities = new ArrayList<>();
            // 기본적으로 USER 권한 부여
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            
            // 어드민 사용자라면 ADMIN 권한도 부여
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
            
            // 인증이 완료되었으므로, 필터 체인의 다음 필터로 요청을 전달
            filterChain.doFilter(request, response);
        } catch (ExpiredJwtException e) {
            log.debug("토큰이 만료되었습니다: {}", e.getMessage());
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED);
        } catch (MalformedJwtException | UnsupportedJwtException | SignatureException e) {
            log.debug("잘못된 형식의 토큰입니다: {}", e.getMessage());
            throw new HttpException(HttpResultCode.INVALID_TOKEN);
        } catch (Exception e) {
            log.error("예외 발생: {}", e.getMessage());
            log.error("예외 타입: {}", e.getClass().getName());
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR);
        }
    }

    // 필터 적용 X 경로 설정
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String[] excludePaths = {"/auth/v1/initiate", "/auth/login/kakao", "/auth/callback/kakao",
                "/swagger-ui", "/v3/api-docs"};

        String path = request.getRequestURI();

        return Arrays.stream(excludePaths).anyMatch(path::startsWith);
    }
}
