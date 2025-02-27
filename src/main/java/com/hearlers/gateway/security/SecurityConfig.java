package com.hearlers.gateway.security;

import com.hearlers.gateway.config.VersionProperties;
import com.hearlers.gateway.shared.guard.security.JwtUtil;
import lombok.RequiredArgsConstructor;
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

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final VersionProperties versionProperties;
    private final JwtUtil jwtUtil;

    @Bean
    public HttpExceptionFilter httpExceptionFilter() {
        return new HttpExceptionFilter();
    }

    @Bean
    public JwtAuthFilter jwtAuthFilter() {
        return new JwtAuthFilter(jwtUtil);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, JwtUtil jwtUtil) throws Exception {
        httpSecurity
                .httpBasic(HttpBasicConfigurer::disable) // HTTP 기본 인증 비활성화
                .csrf(CsrfConfigurer::disable) // CSRF 보호 비활성화
                .formLogin(AbstractHttpConfigurer::disable); // 폼 로그인 비활성화

        // 경로별 권한 설정
        httpSecurity
                .authorizeHttpRequests((requests) -> (requests)
                        // 어드민
                        .requestMatchers(versionProperties.getVersion() + "/admin/**").hasRole("ADMIN")
                        // 비로그인 유저 생성
                        .requestMatchers(versionProperties.getVersion() + "/auth/initiate").permitAll()
                        // Swagger UI 관련 모든 리소스 허용
                        .requestMatchers("/swagger-ui/**").permitAll()
                        .requestMatchers("/v3/api-docs/**").permitAll()
                        // 그 외 모든 요청은 인증된 사용자만 접근 가능
                        .requestMatchers(versionProperties.getVersion() + "/**").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated());

        // 인증 인가 관련 예외 처리
        httpSecurity
                .exceptionHandling((exception) -> exception
                        .authenticationEntryPoint(customAuthenticationEntryPoint()) // 인증 실패 시
                        .accessDeniedHandler(customAccessDeniedHandler())); // 인가 실패 시

        httpSecurity.addFilterBefore(jwtAuthFilter(), UsernamePasswordAuthenticationFilter.class);
        httpSecurity.addFilterBefore(httpExceptionFilter(), JwtAuthFilter.class);

        httpSecurity.sessionManagement((session) -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return httpSecurity.build();
    }

    @Bean
    public CustomAuthenticationEntryPoint customAuthenticationEntryPoint() {
        return new CustomAuthenticationEntryPoint();
    }

    @Bean
    public CustomAccessDeniedHandler customAccessDeniedHandler() {
        return new CustomAccessDeniedHandler();
    }
}
