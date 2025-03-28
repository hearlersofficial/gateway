package com.hearlers.gateway.config.security;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.util.AntPathMatcher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecurityPolicy {
    private static final AntPathMatcher pathMatcher = new AntPathMatcher();
    public static final String ROLE_USER = "USER";
    public static final String ROLE_ADMIN = "ADMIN";

  

    public static final String[] CONTEXT_PATHS = {
        "/swagger-ui/**",
        "/v3/api-docs/**",
        "/swagger-resources/**",
        "/webjars/**",
        "/favicon.ico",
        "/robots.txt",
        "/sitemap.xml",
        "/robots.txt",
        "/sitemap.xml",
        "/robots.txt",
    };

    public static final String[] LOGIN_PATHS = {
        "/v1/auth/initiate",
        "/v1/auth/callback/kakao"
    };

    public static final String ADMIN_PATH = "/v1/admin/**";

    public static final String[] PERMIT_ALL_PATHS = Stream.concat(
        Arrays.stream(LOGIN_PATHS),
        Arrays.stream(CONTEXT_PATHS)
    ).toArray(String[]::new);

    public static final String CATCH_ALL = "/**";

    public static void configure(AuthorizeHttpRequestsConfigurer<?>.AuthorizationManagerRequestMatcherRegistry requests) {
        requests
            .requestMatchers(ADMIN_PATH).hasRole(ROLE_ADMIN)
            .requestMatchers(HttpMethod.POST, PERMIT_ALL_PATHS).permitAll()
            .requestMatchers(HttpMethod.GET, PERMIT_ALL_PATHS).permitAll()
            .requestMatchers(CATCH_ALL).hasAnyRole(ROLE_USER, ROLE_ADMIN)
            .anyRequest().authenticated();
    }


    public static boolean isPermitAllPath(String path) {
        return Arrays.stream(PERMIT_ALL_PATHS)
                .anyMatch(pattern -> pathMatcher.match(pattern, path));
    }

}
