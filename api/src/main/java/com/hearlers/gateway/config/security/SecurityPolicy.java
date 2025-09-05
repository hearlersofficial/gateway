package com.hearlers.gateway.config.security;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.util.AntPathMatcher;

import com.hearlers.api.proto.v1.model.Authority;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecurityPolicy {
    private static final AntPathMatcher pathMatcher = new AntPathMatcher();

  

    public static final String[] CONTEXT_PATHS = {
        "/swagger-ui/**",
        "/v3/api-docs/**",
        "/swagger-resources/**",
        "/webjars/**",
        "/favicon.ico",
        "/sitemap.xml",
        "/robots.txt",
    };

    public static final String[] LOGIN_PATHS = {
            "/v1/auth/initiate",
            "/v1/auth/login/kakao",
            "/v1/auth/callback/kakao",
    };

    public static final String[] REFRESH_PATHS = {
            "/v1/auth/refresh",
    };

    public static final String ADMIN_PATH = "/v1/admin/**";

    public static final String[] PERMIT_ALL_PATHS = Stream.concat(
        Arrays.stream(LOGIN_PATHS),
        Arrays.stream(CONTEXT_PATHS)
    ).toArray(String[]::new);

    public static final String CATCH_ALL = "/**";

    public static void configure(AuthorizeHttpRequestsConfigurer<?>.AuthorizationManagerRequestMatcherRegistry requests) {
        requests
            .requestMatchers(ADMIN_PATH).hasAuthority(Authority.AUTHORITY_ADMIN.name())
            .requestMatchers(HttpMethod.POST, PERMIT_ALL_PATHS).permitAll()
            .requestMatchers(HttpMethod.GET, PERMIT_ALL_PATHS).permitAll()
            .requestMatchers(CATCH_ALL).hasAnyAuthority(Authority.AUTHORITY_USER.name(), Authority.AUTHORITY_ADMIN.name())
            .anyRequest().authenticated();
    }


    public static boolean isPermitAllPath(String path) {
        return Arrays.stream(PERMIT_ALL_PATHS)
                .anyMatch(pattern -> pathMatcher.match(pattern, path));
    }

    /**
     * Refresh 토큰 경로인지 확인합니다.
     */
    public static boolean isRefreshPath(String path) {
        return Arrays.stream(REFRESH_PATHS)
                .anyMatch(pattern -> pathMatcher.match(pattern, path));
    }
}
