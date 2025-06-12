package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.gateway.application.auth.TokenManager;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    private final TokenManager jwtUtil;
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            // 비인증 경로인지 확인
            boolean isPermitAllPath = SecurityPolicy.isPermitAllPath(request.getRequestURI());
            
            Cookie[] cookies = request.getCookies();
            String token = cookies == null ? null :
                    Arrays.stream(cookies)
                            .filter(c -> "accessToken".equals(c.getName()) || "refreshToken".equals(c.getName()))
                            .sorted(Comparator.comparingInt(c ->
                                    "accessToken".equals(c.getName()) ? 0 : 1
                            ))
                            .map(Cookie::getValue)
                            .findFirst()
                            .orElse(null);

            
            // 토큰이 없거나 유효하지 않은 경우
            if (token == null || !jwtUtil.validateToken(token)) {
                // 비인증 경로인 경우 에러 없이 통과
                if (isPermitAllPath) {
                    filterChain.doFilter(request, response);
                    return;
                }
                
                // 비인증 경로가 아닌 경우 예외 발생
                if (cookies == null) {
                    logger.debug("쿠키가 없습니다: {}", request.getRequestURI());
                    throw new HttpException(HttpResultCode.COOKIE_NOT_FOUND);
                }
                
                if (token == null) {
                    logger.debug("액세스 토큰 쿠키가 없습니다: {}", request.getRequestURI());
                    throw new HttpException(HttpResultCode.COOKIE_NOT_FOUND);
                }
                
                throw new HttpException(HttpResultCode.ACCESS_TOKEN_INVALID);
            }
            
            // 토큰이 유효한 경우 - 인증 경로와 비인증 경로 모두 처리
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
            logger.debug("토큰이 만료되었습니다: {}", e.getMessage());
            HttpException httpEx = new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED);
            request.setAttribute("custom.exception", httpEx);
            throw new BadCredentialsException(httpEx.getMessage(), httpEx);
        } catch (MalformedJwtException | UnsupportedJwtException | SignatureException e) {
            logger.debug("잘못된 형식의 토큰입니다: {}", e.getMessage());
            HttpException httpEx = new HttpException(HttpResultCode.INVALID_TOKEN);
            request.setAttribute("custom.exception", httpEx);
            throw new BadCredentialsException(httpEx.getMessage(), httpEx);
        } catch (HttpException httpEx) {
            logger.error("HttpException 발생: {}", httpEx.getMessage());
            request.setAttribute("custom.exception", httpEx);
            throw new BadCredentialsException(httpEx.getMessage(), httpEx);
        } catch (Exception e) {
            logger.error("예외 발생: {}", e.getMessage());
            logger.error("예외 타입: {}", e.getClass().getName());
            HttpException httpEx = new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR);
            request.setAttribute("custom.exception", httpEx);
            throw new BadCredentialsException(httpEx.getMessage(), httpEx);
        }
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        // 오버라이드, 모든 경로를 필터링하도록 함 (shouldNotFilter 메서드 대신 내부 로직에서 처리)
        return false;
    }
}