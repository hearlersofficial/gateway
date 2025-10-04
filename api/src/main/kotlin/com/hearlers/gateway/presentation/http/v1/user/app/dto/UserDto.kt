package com.hearlers.gateway.presentation.http.v1.user.app.dto

import com.hearlers.api.proto.v1.model.Gender
import com.hearlers.api.proto.v1.model.Mbti
import com.hearlers.gateway.presentation.http.v1.user.admin.dto.UserDto
import io.swagger.v3.oas.annotations.media.Schema

object UserDto {

    @Schema(description = "유저 정보")
    data class User(
        @field:Schema(description = "유저 ID")
        val id: String,
        @field:Schema(description = "닉네임")
        val nickname: String,
        @field:Schema(description = "유저 프로필")
        val userProfile: UserProfile
    )

    @Schema(description = "유저 트래킹 정보")
    data class UserTracking(
        @field:Schema(description = "인트로 컷씬 시청 유무")
        val hasSeenIntroCutscene: Boolean,
        @field:Schema(description = "생성 시간")
        val createdAt: String,
        @field:Schema(description = "수정 시간")
        val updatedAt: String,
        @field:Schema(description = "삭제 시간", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "유저 프로필 정보")
    data class UserProfile(
        @field:Schema(description = "프로필 이미지 URL", nullable = true)
        val profileImage: String?,
        @field:Schema(description = "성별", nullable = true)
        val gender: Gender?,
        @field:Schema(description = "MBTI", nullable = true)
        val mbti: Mbti?,
        @field:Schema(description = "생년월일", nullable = true)
        val birthday: String?
    )

    @Schema(description = "내 정보 조회 응답")
    data class FindMyUserResponse(
        @field:Schema(description = "유저 정보")
        val user: User
    )

    @Schema(description = "내 프로필 업데이트 요청")
    data class UpdateMyUserRequest(
        @field:Schema(description = "닉네임", nullable = true)
        val nickname: String?,
        @field:Schema(description = "프로필 이미지 URL", nullable = true)
        val profileImage: String?,
        @field:Schema(description = "성별", nullable = true)
        val gender: Gender?,
        @field:Schema(description = "MBTI", nullable = true)
        val mbti: Mbti?,
        @field:Schema(description = "생년월일", nullable = true)
        val birthday: String?
    )

    @Schema(description = "내 프로필 업데이트 응답")
    data class UpdateMyUserResponse(
        @field:Schema(description = "업데이트된 유저 정보")
        val user: User
    )

    @Schema(description = "내 트래킹 업데이트 요청")
    data class UpsertMyTrackingRequest (
        @field:Schema(description = "인트로 컷씬 시청 유무", nullable = false)
        val hasSeenIntroCutscene: Boolean,
    )
}
