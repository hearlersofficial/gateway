package com.hearlers.gateway;

import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.port.TokenProviderPort;
import org.springframework.beans.factory.annotation.Value;
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
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JwtTokenProviderAdapter implements TokenProviderPort {

    private final Key key;
    private final long accessExpirationTime;
    private final long refreshExpirationTime;

    public JwtTokenProviderAdapter(
            @Value("${token.jwt.secret}") String secretKey,
            @Value("${token.access_expiration_time}") long accessExpirationTime,
            @Value("${token.refresh_expiration_time}") long refreshExpirationTime) {

        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.accessExpirationTime = accessExpirationTime;
        this.refreshExpirationTime = refreshExpirationTime;
    }

    /**
     * JWT 토큰의 Claims를 파싱합니다.
     */
    private Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }

    /**
     * JWT 토큰을 검증합니다.
     */
    @Override
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
    @Override
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
    @Override
    public String getUserId(String token) {
        return parseClaims(token).get("id", String.class);
    }

    /**
     * JWT 토큰에서 인증 채널을 추출합니다.
     */
    @Override
    public AuthChannel getAuthChannel(String token) {
        return AuthChannel.valueOf(parseClaims(token).get("auth_channel", String.class));
    }


    /**
     * JWT 토큰에서 권한 정보를 추출합니다.
     */
    @Override
    public Authority getAuthority(String token) {
        return Authority.valueOf(parseClaims(token).get("authority", String.class));
    }

    /**
     * JWT 토큰을 생성합니다.
     */
    @Override
    public String createToken(String userId, AuthChannel authChannel, Authority authority, LocalDateTime validity) {
        LocalDateTime now = LocalDateTime.now();
        Claims claims = Jwts.claims();
        claims.put("id", userId);
        claims.put("auth_channel", authChannel);
        claims.put("authority", authority);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant(ZoneOffset.UTC)))
                .setExpiration(Date.from(validity.toInstant(ZoneOffset.UTC)))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    @Override
    public long getAccessTokenExpirationTime() {
        return this.accessExpirationTime;
    }

    @Override
    public long getRefreshTokenExpirationTime() {
        return this.refreshExpirationTime;
    }

}