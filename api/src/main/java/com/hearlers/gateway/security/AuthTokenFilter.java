package com.hearlers.gateway.security;

import java.io.IOException;
import java.security.SignatureException;
import java.util.*;
import java.util.stream.Collectors;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.gateway.TokenManagingUseCase;
import com.hearlers.gateway.auth.model.AuthInfo;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.shared.exception.HttpException;
import com.hearlers.gateway.shared.exception.HttpResultCode;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
public class AuthTokenFilter extends OncePerRequestFilter {
    private final TokenManagingUseCase tokenManagingUseCase;
    private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        String requestPath = request.getRequestURI();
        
        try {
            AuthInfo.TokenInfo tokenInfo = extractTokens(request);

            handleToken(requestPath, request, tokenInfo);

            filterChain.doFilter(request, response);

        } catch (HttpException e) {
            logger.error("HttpException: {}", e.getMessage());
            throw wrap(request, e, e);
        } catch (Exception e) {
            logger.error("알 수 없는 예외: {}", e.getMessage(), e);
            throw wrap(request, new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR), e);
        }
    }

    private void handleToken(String requestPath, HttpServletRequest request, AuthInfo.TokenInfo tokenInfo){
        if (SecurityPolicy.isRefreshPath(requestPath)) {
            handleRefreshPath(request, tokenInfo);
        } else if (SecurityPolicy.isPermitAllPath(requestPath)) {
            handlePermitAllPath(request, tokenInfo);
        } else {
            handleAuthenticatedPath(request, tokenInfo);
        }
    }

    /**
     * 쿠키에서 토큰들을 추출합니다.
     */
    private AuthInfo.TokenInfo extractTokens(HttpServletRequest request) {
        Map<String, String> tokenMap = Optional.ofNullable(request.getCookies())
                .map(cookies -> Arrays.stream(cookies)
                        .filter(c -> "accessToken".equals(c.getName()) || "refreshToken".equals(c.getName()))
                        .collect(Collectors.toMap(Cookie::getName, Cookie::getValue, (a, b) -> a)))
                .orElse(Collections.emptyMap());

        return new AuthInfo.TokenInfo(tokenMap.get("accessToken"), tokenMap.get("refreshToken"), null, null);
    }

    /**
     * Refresh 경로 처리: refresh token만으로 검증
     */
    private void handleRefreshPath(HttpServletRequest request, AuthInfo.TokenInfo tokenInfo) {
        if (tokenInfo.getRefreshToken() == null) {
            logger.debug("Refresh 경로에 refreshToken이 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.REFRESH_TOKEN_REQUIRED);
        }

        if (!tokenManagingUseCase.validateToken(tokenInfo.getRefreshToken())) {
            logger.debug("유효하지 않은 refreshToken: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.INVALID_TOKEN);
        }

        String userId = tokenManagingUseCase.getUserIdFromToken(tokenInfo.getRefreshToken());
        AuthChannel authChannel = tokenManagingUseCase.getAuthChannelFromToken(tokenInfo.getRefreshToken());
        Authority authority = tokenManagingUseCase.getAuthorityFromToken(tokenInfo.getRefreshToken());
        setClaimsToRequest(request, userId, authChannel);
        setAuthenticationContext(request, userId, authority);
    }

    /**
     * 비인증 경로 처리: 토큰이 있으면 검증하고 claim 설정, 없어도 통과
     */
    private void handlePermitAllPath(HttpServletRequest request, AuthInfo.TokenInfo tokenInfo) {
        String token = tokenInfo.getAccessToken() != null ? tokenInfo.getAccessToken() : tokenInfo.getRefreshToken();
        
        if (token == null) {
            // 토큰이 없어도 비인증 경로는 통과
            return;
        }

        if (tokenManagingUseCase.validateToken(token)) {
            String userId = tokenManagingUseCase.getUserIdFromToken(token);
            AuthChannel authChannel = tokenManagingUseCase.getAuthChannelFromToken(token);
            Authority authority = tokenManagingUseCase.getAuthorityFromToken(token);
            setClaimsToRequest(request, userId, authChannel);
            setAuthenticationContext(request, userId, authority);
        }
        // 토큰이 유효하지 않아도 비인증 경로는 통과
    }

    /**
     * 인증 경로 처리: access token 필수
     */
    private void handleAuthenticatedPath(HttpServletRequest request, AuthInfo.TokenInfo tokenInfo) {
        if (tokenInfo.getAccessToken() == null) {
            if (tokenInfo.getRefreshToken() == null) {
                logger.debug("쿠키가 없습니다: {}", request.getRequestURI());
                throw new HttpException(HttpResultCode.COOKIE_NOT_FOUND);
            }
            logger.debug("인증 경로에 accessToken이 없습니다: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.ACCESS_TOKEN_REQUIRED);
        }

        if (!tokenManagingUseCase.validateToken(tokenInfo.getAccessToken())) {
            logger.debug("유효하지 않은 accessToken: {}", request.getRequestURI());
            throw new HttpException(HttpResultCode.ACCESS_TOKEN_INVALID);
        }

        String userId = tokenManagingUseCase.getUserIdFromToken(tokenInfo.getAccessToken());
        AuthChannel authChannel = tokenManagingUseCase.getAuthChannelFromToken(tokenInfo.getAccessToken());
        Authority authority = tokenManagingUseCase.getAuthorityFromToken(tokenInfo.getAccessToken());
        setClaimsToRequest(request, userId, authChannel);
        setAuthenticationContext(request, userId, authority);
    }

    /**
     * Request에 claim 정보를 설정합니다.
     */
    private void setClaimsToRequest(HttpServletRequest request, String userId, AuthChannel authChannel) {

        request.setAttribute("userId", userId);
        request.setAttribute("authChannel", authChannel);
    }

    /**
     * Spring Security 인증 컨텍스트를 설정합니다.
     */
    private void setAuthenticationContext(HttpServletRequest request, String userId, Authority authority) {
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
}