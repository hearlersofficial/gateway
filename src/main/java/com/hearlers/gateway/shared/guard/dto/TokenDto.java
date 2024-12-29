package com.hearlers.gateway.shared.guard.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Builder
@Schema(name = "TokenDto", description = "액세스 토큰과 리프레시 토큰을 담은 DTO")
public class TokenDto {
    @Schema(description = "액세스 토큰")
    private String accessToken;

    @Schema(description = "액세스 토큰 만료 시간")
    private LocalDateTime accessTokenExpiresAt;

    @Schema(description = "리프레시 토큰")
    private String refreshToken;

    @Schema(description = "리프레시 토큰 만료 시간")
    private LocalDateTime refreshTokenExpiresAt;
}
