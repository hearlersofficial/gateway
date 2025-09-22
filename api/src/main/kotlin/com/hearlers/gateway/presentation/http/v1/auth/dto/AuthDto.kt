package com.hearlers.gateway.presentation.http.v1.auth.dto

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.Gender
import com.hearlers.api.proto.v1.model.Mbti
import io.swagger.v3.oas.annotations.media.Schema

object AuthDto {
    @Schema(description = "사용자")
    data class UserResponse(
        @field:Schema(description = "사용자 ID")
        val id: String,
        @field:Schema(description = "닉네임")
        val nickname: String,
        @field:Schema(description = "사용자 프로필")
        val userProfile: UserProfileResponse,
        @field:Schema(description = "생성 시간")
        val createdAt: String,
        @field:Schema(description = "수정 시간")
        val updatedAt: String,
        @field:Schema(description = "삭제 시간 null 가능", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "사용자 프로필")
    data class UserProfileResponse(
        @field:Schema(description = "프로필 이미지")
        val profileImage: String,
        @field:Schema(description = "전화번호")
        val phoneNumber: String,
        @field:Schema(description = "성별")
        val gender: Gender,
        @field:Schema(description = "생년월일")
        val birthday: String,
        @field:Schema(description = "소개")
        val introduction: String,
        @field:Schema(description = "MBTI")
        val mbti: Mbti,
        @field:Schema(description = "생성 시간")
        val createdAt: String,
        @field:Schema(description = "수정 시간")
        val updatedAt: String,
        @field:Schema(description = "삭제 시간 null 가능", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "토큰 생성 응답")
    data class TokenResponse(
        @field:Schema(description = "액세스 토큰")
        val accessToken: String,
        @field:Schema(description = "리프레시 토큰")
        val refreshToken: String,
        @field:Schema(description = "액세스 토큰 만료 시간")
        val accessTokenExpiresAt: String,
        @field:Schema(description = "리프레시 토큰 만료 시간")
        val refreshTokenExpiresAt: String
    )

    @Schema(description = "토큰 생성 요청")
    data class CreateTokenRequest(
        @field:Schema(description = "사용자 ID")
        val id: String,
        @field:Schema(description = "인증 채널")
        val authChannel: AuthChannel
    )

    @Schema(description = "사용자 생성 응답")
    data class CreateUserResponse(
        @field:Schema(description = "사용자")
        val user: UserResponse
    )
}