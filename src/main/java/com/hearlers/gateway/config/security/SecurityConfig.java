package com.hearlers.gateway.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.hearlers.gateway.application.auth.TokenManager;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final TokenManager jwtUtil;
    private final ResponseFormatter responseFormatter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .httpBasic(HttpBasicConfigurer::disable) // HTTP 기본 인증 비활성화
                .csrf(CsrfConfigurer::disable) // CSRF 보호 비활성화
                .formLogin(AbstractHttpConfigurer::disable); // 폼 로그인 비활성화

        // 경로별 권한 설정
        httpSecurity.authorizeHttpRequests(requests -> {
            SecurityPolicy.configure(requests);
        });

        // 인증 인가 관련 예외 처리
        httpSecurity
                .exceptionHandling((exception) -> exception
                        .authenticationEntryPoint(customAuthenticationEntryPoint()) // 인증 실패 시
                        .accessDeniedHandler(customAccessDeniedHandler())); // 인가 실패 시

        // 1. 인증 필터 설정
        httpSecurity.addFilterBefore(jwtAuthFilter(), UsernamePasswordAuthenticationFilter.class);

        // 2. 예외 처리 필터 설정 (인증된 요청에 대한 예외 처리)
        httpSecurity.addFilterBefore(exceptionHandlerFilter(), JwtAuthFilter.class);

        // 세션 관리 설정 (JWT를 사용하므로 세션은 STATELESS로 설정)
        httpSecurity.sessionManagement((session) -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return httpSecurity.build();
    }

    @Bean
    public CustomAuthenticationEntryPoint customAuthenticationEntryPoint() {
        return new CustomAuthenticationEntryPoint(responseFormatter);
    }

    @Bean
    public CustomAccessDeniedHandler customAccessDeniedHandler() {
        return new CustomAccessDeniedHandler(responseFormatter);
    }

    @Bean
    public JwtAuthFilter jwtAuthFilter() {
        return new JwtAuthFilter(jwtUtil);
    }

    @Bean
    public ExceptionHandlerFilter exceptionHandlerFilter() {
        return new ExceptionHandlerFilter(responseFormatter);
    }
}
