package com.hearlers.gateway.infrastructure.auth;

import java.security.Key;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.hearlers.gateway.application.auth.AuthCommand;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.application.auth.JwtTokenManager;
import com.hearlers.gateway.config.JwtProperties;

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
public class JwtTokenManagerImpl implements JwtTokenManager {
    private final Key key;
    private final long accessTokenExpTime;
    private final long refreshTokenExpTime;

    public JwtTokenManagerImpl(
            JwtProperties jwtProperties
    ) {
        byte[] keyBytes = Decoders.BASE64.decode(jwtProperties.getSecret());
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.accessTokenExpTime = jwtProperties.getAccessExpirationTime();
        this.refreshTokenExpTime = jwtProperties.getRefreshExpirationTime();
    }

    // accessToken 생성 및 반환
    @Override
    public AuthInfo.TokenInfo generateToken(AuthCommand.GenerateTokenCommand command, boolean rememberMe) {
        return createToken(command, accessTokenExpTime, refreshTokenExpTime, rememberMe);
    }


    // JWT claim 추출
    @Override
    public Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }


    // token에서 user_id 추출
    @Override
    public int getUserId(String token) {
        return parseClaims(token).get("id", Integer.class);
    }

    // JWT가 만료되었는지 확인하는 메서드
    @Override
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
    @Override
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

    // accessToken 생성
    private AuthInfo.TokenInfo createToken(AuthCommand.GenerateTokenCommand command, long accessTokenExpTime, long refreshTokenExpTime,
                                 boolean rememberMe) {
        Claims claims = Jwts.claims();
        claims.put("id", command.getId());
        claims.put("auth_channel", command.getAuthChannel());

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
            return AuthInfo.TokenInfo.builder()
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

            return AuthInfo.TokenInfo.builder()
                    .accessToken(accessToken)
                    .accessTokenExpiresAt(accessTokenValidity.toLocalDateTime())
                    .refreshToken(refreshToken)
                    .refreshTokenExpiresAt(refreshTokenValidity.toLocalDateTime())
                    .build();
        }
    }
}
