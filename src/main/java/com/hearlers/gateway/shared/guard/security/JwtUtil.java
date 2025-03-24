package com.hearlers.gateway.shared.guard.security;

import java.security.Key;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.hearlers.gateway.config.JwtProperties;
import com.hearlers.gateway.presentation.rest.v1.auth.dto.CreateTokenRequestDto;
import com.hearlers.gateway.shared.guard.dto.TokenDto;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JwtUtil {
    private final Key key;
    private final long accessTokenExpTime;
    private final long refreshTokenExpTime;

    public JwtUtil(
            JwtProperties jwtProperties
    ) {
        byte[] keyBytes = Decoders.BASE64.decode(jwtProperties.getSecret());
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.accessTokenExpTime = jwtProperties.getAccessExpirationTime();
        this.refreshTokenExpTime = jwtProperties.getRefreshExpirationTime();
    }

    // accessToken 생성 및 반환
    public TokenDto returnToken(CreateTokenRequestDto dto, boolean rememberMe) {
        return createToken(dto, accessTokenExpTime, refreshTokenExpTime, rememberMe);
    }

    // accessToken 생성
    private TokenDto createToken(CreateTokenRequestDto dto, long accessTokenExpTime, long refreshTokenExpTime,
                                 boolean rememberMe) {
        Claims claims = Jwts.claims();
        claims.put("id", dto.getId());
        claims.put("auth_channel", dto.getAuthChannel());

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime accessTokenValidity = now.plusSeconds(accessTokenExpTime);
        ZonedDateTime refreshTokenValidity = now.plusSeconds(refreshTokenExpTime);

        // access token
        String accessToken = Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(accessTokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        if (!rememberMe) {
            return TokenDto.builder()
                    .accessToken(accessToken)
                    .accessTokenExpiresAt(accessTokenValidity.toLocalDateTime())
                    .build();
        } else {
            // refresh token
            String refreshToken = Jwts.builder()
                    .setClaims(claims)
                    .setIssuedAt(Date.from(now.toInstant()))
                    .setExpiration(Date.from(refreshTokenValidity.toInstant()))
                    .signWith(key, SignatureAlgorithm.HS256)
                    .compact();

            return TokenDto.builder()
                    .accessToken(accessToken)
                    .accessTokenExpiresAt(accessTokenValidity.toLocalDateTime())
                    .refreshToken(refreshToken)
                    .refreshTokenExpiresAt(refreshTokenValidity.toLocalDateTime())
                    .build();
        }
    }

    // JWT claim 추출
    public Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }


    // token에서 user_id 추출
    public int getUserId(String token) {
        return parseClaims(token).get("id", Integer.class);
    }

    // JWT가 만료되었는지 확인하는 메서드
    public boolean isTokenExpired(String token) {
        try {
            Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
            Date expiration = claims.getExpiration();
            return expiration.before(new Date());
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
            log.info("Invalid JWT Token", e);
        } catch (ExpiredJwtException e) {
            log.info("Expired JWT Token", e);
        } catch (UnsupportedJwtException e) {
            log.info("Unsupported JWT Token", e);
        } catch (IllegalArgumentException e) {
            log.info("JWT claims string is empty.", e);
        }
        return true;
    }

    // JWT 검증
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
            log.info("Invalid JWT Token", e);
        } catch (ExpiredJwtException e) {
            log.info("Expired JWT Token", e);
        } catch (UnsupportedJwtException e) {
            log.info("Unsupported JWT Token", e);
        } catch (IllegalArgumentException e) {
            log.info("JWT claims string is empty.", e);
        }

        return false;
    }
}
