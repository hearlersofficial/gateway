package com.hearlers.gateway.presentation.http.v1.user.admin.dto

import com.hearlers.api.proto.v1.model.Gender
import com.hearlers.api.proto.v1.model.Mbti
import io.swagger.v3.oas.annotations.media.Schema

object UserDto {

    @Schema(description = "유저 정보")
    data class User(
        @field:Schema(description = "유저 ID")
        val id: String,
        @field:Schema(description = "닉네임")
        val nickname: String,
        @field:Schema(description = "유저 프로필")
        val userProfile: UserProfile,
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

    @Schema(description = "유저 ID로 조회 응답")
    data class FindUserByIdResponse(
        @field:Schema(description = "유저 정보")
        val user: User
    )
}
