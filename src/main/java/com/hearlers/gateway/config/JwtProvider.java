package com.hearlers.gateway.config;

import java.security.Key;
import java.time.ZonedDateTime;
import java.util.Date;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SecurityException;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class JwtProvider {
    
    private final JwtProperties jwtProperties;
    private Key key;

    @PostConstruct
    public void init() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtProperties.getSecret());
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }

    /**
     * JWT 토큰의 Claims를 파싱합니다.
     */
    public Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }

    /**
     * JWT 토큰을 검증합니다.
     */
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (SecurityException | MalformedJwtException e) {
            log.debug("Invalid JWT Token", e);
        } catch (ExpiredJwtException e) {
            log.debug("Expired JWT Token", e);
        } catch (UnsupportedJwtException e) {
            log.debug("Unsupported JWT Token", e);
        } catch (IllegalArgumentException e) {
            log.debug("JWT claims string is empty.", e);
        }
        return false;
    }

    /**
     * JWT 토큰이 만료되었는지 확인합니다.
     */
    public boolean isTokenExpired(String token) {
        try {
            Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
            Date expiration = claims.getExpiration();
            return expiration.before(new Date());
        } catch (SecurityException | MalformedJwtException e) {
            log.debug("Invalid JWT Token", e);
        } catch (ExpiredJwtException e) {
            log.debug("Expired JWT Token", e);
        } catch (UnsupportedJwtException e) {
            log.debug("Unsupported JWT Token", e);
        } catch (IllegalArgumentException e) {
            log.debug("JWT claims string is empty.", e);
        }
        return true;
    }

    /**
     * JWT 토큰에서 사용자 ID를 추출합니다.
     */
    public String getUserId(String token) {
        return parseClaims(token).get("id", String.class);
    }

    /**
     * JWT 토큰에서 인증 채널을 추출합니다.
     */
    public AuthChannel getAuthChannel(String token) {
        return AuthChannel.valueOf(parseClaims(token).get("auth_channel", String.class));
    }


    /**
     * JWT 토큰에서 권한 정보를 추출합니다.
     */
    public Authority getAuthority(String token) {
        return Authority.valueOf(parseClaims(token).get("authority", String.class));
    }

    /**
     * JWT 토큰을 생성합니다.
     */
    public String createJwtToken(String userId, AuthChannel authChannel, Authority authority, ZonedDateTime now, ZonedDateTime validity) {
        Claims claims = Jwts.claims();
        claims.put("id", userId);
        claims.put("auth_channel", authChannel);
        claims.put("authority", authority);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(validity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     * Access Token 만료 시간을 가져옵니다.
     */
    public long getAccessTokenExpTime() {
        return jwtProperties.getAccessExpirationTime();
    }

    /**
     * Refresh Token 만료 시간을 가져옵니다.
     */
    public long getRefreshTokenExpTime() {
        return jwtProperties.getRefreshExpirationTime();
    }
} 