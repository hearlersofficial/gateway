package com.hearlers.gateway.presentation.rest.v1.auth;

import java.time.Instant;
import java.time.LocalDateTime;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.Gender;
import com.hearlers.api.proto.v1.model.Mbti;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

public class AuthDto {
    @Getter
    @Builder
    @Schema(description = "사용자")
    public static class UserResponseDto {
        @Schema(description = "사용자 ID")
        private final String id;

        @Schema(description = "닉네임")
        private final String nickname;

        @Schema(description = "사용자 프로필")
        private final UserProfileResponseDto userProfile;

        @Schema(description = "생성 시간")
        private final Instant createdAt;

        @Schema(description = "수정 시간")
        private final Instant updatedAt;

        @Schema(description = "삭제 시간 null 가능", nullable = true)
        private final Instant deletedAt;
    }
    
    @Getter
    @Builder
    @Schema(description = "사용자 프로필")
    public static class UserProfileResponseDto {
        @Schema(description = "프로필 이미지")
        private final String profileImage;

        @Schema(description = "전화번호")
        private final String phoneNumber;

        @Schema(description = "성별")
        private final Gender gender;

        @Schema(description = "생년월일")
        private final Instant birthday;

        @Schema(description = "소개")
        private final String introduction;

        @Schema(description = "MBTI")
        private final Mbti mbti;

        @Schema(description = "생성 시간")
        private final Instant createdAt;

        @Schema(description = "수정 시간")
        private final Instant updatedAt;

        @Schema(description = "삭제 시간 null 가능", nullable = true)
        private final Instant deletedAt;
    }   

    @Getter
    @Builder
    @Schema(description = "토큰 생성 응답")
    public static class TokenResponseDto {
        @Schema(description = "액세스 토큰")
        private final String accessToken;

        @Schema(description = "리프레시 토큰")
        private final String refreshToken;

        @Schema(description = "액세스 토큰 만료 시간")
        private final LocalDateTime accessTokenExpiresAt;

        @Schema(description = "리프레시 토큰 만료 시간")
        private final LocalDateTime refreshTokenExpiresAt;
    }

              
    @Getter
    @Builder
    @Schema(description = "토큰 생성 요청")
    public static class CreateTokenRequestDto {
        @Schema(description = "사용자 ID")
        private final String id;

        @Schema(description = "인증 채널")
        private final AuthChannel authChannel;
    }

    @Getter
    @Builder
    @Schema(description = "사용자 생성 응답")
    public static class CreateUserResponseDto {
        @Schema(description = "사용자")
        private final UserResponseDto user;
    }
}
