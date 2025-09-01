package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.config.JwtProvider;
import com.hearlers.gateway.shared.exception.HttpException;
import com.hearlers.gateway.shared.exception.HttpResultCode;

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
    private final JwtProvider jwtProvider;
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        String requestPath = request.getRequestURI();
        
        try {
            TokenInfo tokenInfo = extractTokens(request);
            
            if (SecurityPolicy.isRefreshPath(requestPath)) {
                handleRefreshPath(request, tokenInfo);
            } else if (SecurityPolicy.isPermitAllPath(requestPath)) {
                handlePermitAllPath(request, tokenInfo);
            } else {
                handleAuthenticatedPath(request, tokenInfo);
            }
            
            filterChain.doFilter(request, response);
            
        } catch (ExpiredJwtException e) {
            logger.debug("토큰 만료: {}", e.getMessage());
            throw wrap(request, new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED), e);
        } catch (MalformedJwtException | UnsupportedJwtException | SignatureException e) {
            logger.error("JWT 파싱 오류: {}", e.getMessage());
            throw wrap(request, new HttpException(HttpResultCode.INVALID_TOKEN), e);
        } catch (HttpException e) {
            logger.error("HttpException: {}", e.getMessage());
            throw wrap(request, e, e);
        } catch (Exception e) {
            logger.error("알 수 없는 예외: {}", e.getMessage(), e);
            throw wrap(request, new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR), e);
        }
    }

    /**
     * 쿠키에서 토큰들을 추출합니다.
     */
    private TokenInfo extractTokens(HttpServletRequest request) {
        Map<String, String> tokenMap = Optional.ofNullable(request.getCookies())
                .map(cookies -> Arrays.stream(cookies)
                        .filter(c -> "accessToken".equals(c.getName()) || "refreshToken".equals(c.getName()))
                        .collect(Collectors.toMap(Cookie::getName, Cookie::getValue, (a, b) -> a)))
                .orElse(Collections.emptyMap());

        return new TokenInfo(tokenMap.get("accessToken"), tokenMap.get("refreshToken"));
    }

    /**
     * Refresh 경로 처리: refresh token만으로 검증
     */
    private void handleRefreshPath(HttpServletRequest request, TokenInfo tokenInfo) {
        if (tokenInfo.refreshToken == null) {
            logger.debug("Refresh 경로에 refreshToken이 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED);
        }

        if (!jwtProvider.validateToken(tokenInfo.refreshToken)) {
            logger.debug("유효하지 않은 refreshToken: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.INVALID_TOKEN);
        }

        Claims claims = jwtProvider.parseClaims(tokenInfo.refreshToken);
        setClaimsToRequest(request, claims);
        setAuthenticationContext(request, claims);
    }

    /**
     * 비인증 경로 처리: 토큰이 있으면 검증하고 claim 설정, 없어도 통과
     */
    private void handlePermitAllPath(HttpServletRequest request, TokenInfo tokenInfo) {
        String token = tokenInfo.accessToken != null ? tokenInfo.accessToken : tokenInfo.refreshToken;
        
        if (token == null) {
            // 토큰이 없어도 비인증 경로는 통과
            return;
        }

        if (jwtProvider.validateToken(token)) {
            Claims claims = jwtProvider.parseClaims(token);
            setClaimsToRequest(request, claims);
            setAuthenticationContext(request, claims);
        }
        // 토큰이 유효하지 않아도 비인증 경로는 통과
    }

    /**
     * 인증 경로 처리: access token 필수
     */
    private void handleAuthenticatedPath(HttpServletRequest request, TokenInfo tokenInfo) {
        if (tokenInfo.accessToken == null) {
            if (tokenInfo.refreshToken == null) {
                logger.debug("쿠키가 없습니다: {}", request.getRequestURI());
                throw new HttpException(HttpResultCode.COOKIE_NOT_FOUND);
            }
            logger.debug("인증 경로에 accessToken이 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.ACCESS_TOKEN_REQUIRED);
        }

        if (!jwtProvider.validateToken(tokenInfo.accessToken)) {
            logger.debug("유효하지 않은 accessToken: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.ACCESS_TOKEN_INVALID);
        }

        Claims claims = jwtProvider.parseClaims(tokenInfo.accessToken);
        setClaimsToRequest(request, claims);
        setAuthenticationContext(request, claims);
    }

    /**
     * Request에 claim 정보를 설정합니다.
     */
    private void setClaimsToRequest(HttpServletRequest request, Claims claims) {
        String userId = claims.get("id", String.class);
        String authChannel = claims.get("auth_channel", String.class);
        
        request.setAttribute("userId", userId);
        request.setAttribute("authChannel", authChannel);
    }

    /**
     * Spring Security 인증 컨텍스트를 설정합니다.
     */
    private void setAuthenticationContext(HttpServletRequest request, Claims claims) {
        String userId = claims.get("id", String.class);
        Authority authority = Authority.valueOf(claims.get("authority", String.class));
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(authority.name()));

        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(userId, null, authorities);
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    private BadCredentialsException wrap(HttpServletRequest request, HttpException httpEx, Exception cause) {
        request.setAttribute("custom.exception", httpEx);
        return new BadCredentialsException(httpEx.getMessage(), cause);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return false;
    }

    /**
     * 토큰 정보를 담는 내부 클래스
     */
    private static class TokenInfo {
        final String accessToken;
        final String refreshToken;

        TokenInfo(String accessToken, String refreshToken) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        }
    }
}