package com.hearlers.gateway.presentation.http.v1.auth.mapper

import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.model.UserProfile
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest
import com.hearlers.gateway.auth.model.AuthInfo
import com.hearlers.gateway.presentation.http.v1.auth.dto.AuthDto

object AuthDtoMapper {

    fun of(user: User): AuthDto.UserResponse {
        return AuthDto.UserResponse(
            user.id,
            user.nickname,
            of(user.userProfile),
            user.createdAt,
            user.updatedAt,
            user.deletedAt
        )
    }

    fun of(userProfile: UserProfile): AuthDto.UserProfileResponse {
        return AuthDto.UserProfileResponse(
            profileImage = userProfile.profileImage,
            phoneNumber = userProfile.phoneNumber,
            gender = userProfile.gender,
            birthday = userProfile.birthday,
            introduction = userProfile.introduction,
            mbti = userProfile.mbti,
            createdAt = userProfile.createdAt,
            updatedAt = userProfile.updatedAt,
            deletedAt = if (userProfile.hasDeletedAt()) userProfile.deletedAt else null
        )
    }

    fun ofAuthUserAndToken(authUser: AuthUser, token: AuthInfo.TokenInfo): SaveRefreshTokenRequest {
        return SaveRefreshTokenRequest.newBuilder()
            .setUserId(authUser.userId)
            .setToken(token.refreshToken)
            .setExpiresAt(token.refreshTokenExpiresAt.toString())
            .build()
    }

    fun of(token: AuthInfo.TokenInfo): AuthDto.TokenResponse {
        return AuthDto.TokenResponse(
            accessToken = token.accessToken,
            refreshToken = token.refreshToken,
            accessTokenExpiresAt = token.accessTokenExpiresAt.toString(),
            refreshTokenExpiresAt = token.refreshTokenExpiresAt.toString()
        )
    }
}