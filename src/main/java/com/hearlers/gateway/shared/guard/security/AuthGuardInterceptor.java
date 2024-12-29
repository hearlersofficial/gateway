package com.hearlers.gateway.shared.guard.security;

import io.jsonwebtoken.Claims;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequiredArgsConstructor
public class AuthGuardInterceptor implements HandlerInterceptor {

    private final JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 핸들러가 HandlerMethod인지 확인
        if (!(handler instanceof HandlerMethod)) {
            // HandlerMethod가 아닌 경우, 정적 리소스 등의 요청이므로 그대로 통과
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;

        // 메서드에 @AuthGuard가 붙어 있는지 확인
        if (handlerMethod.getMethodAnnotation(AuthGuard.class) == null) {
            return true; // @AuthGuard가 없으면 인증 없이 통과
        }

        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return false;
        }

        String token = Arrays.stream(cookies)
                .filter(cookie -> "accessToken".equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
                .orElse(null);

        if (token == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return false;
        }

        // token이 만료되었는지 검증
        if (jwtUtil.isTokenExpired(token)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized access");
            return false;
        }

        // token이 유효한지 검증
        if (!jwtUtil.validateToken(token)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Invalid or Expired JWT");
            return false;
        }

        try {
            Claims claims = jwtUtil.parseClaims(token);
            request.setAttribute("userId", claims.get("id", Integer.class)); // userId를 request에 저장
            request.setAttribute("authChannel", claims.get("auth_channel", String.class)); // authChannel을 request에 저장
            return true;
        } catch (Exception e) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Invalid or Expired JWT");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // Post handle logic if needed
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // After completion logic if needed
    }

}