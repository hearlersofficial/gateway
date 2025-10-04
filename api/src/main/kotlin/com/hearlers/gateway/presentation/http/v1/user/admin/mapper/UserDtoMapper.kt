package com.hearlers.gateway.presentation.http.v1.user.admin.mapper

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.model.UserProfile
import com.hearlers.api.proto.v1.model.UserTracking
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest
import com.hearlers.gateway.presentation.http.v1.user.admin.dto.UserDto

object UserDtoMapper {

    fun of(user: User): UserDto.User {
        return UserDto.User(
            id = user.id,
            nickname = user.nickname,
            userProfile = of(user.userProfile),
            createdAt = user.createdAt,
            updatedAt = user.updatedAt,
            deletedAt = if (user.hasDeletedAt()) user.deletedAt else null
        )
    }

    fun of(userProfile: UserProfile): UserDto.UserProfile {
        return UserDto.UserProfile(
            userProfile.profileImage,
            userProfile.gender,
            userProfile.mbti,
            userProfile.birthday
        )
    }

    fun of(userTracking: UserTracking): UserDto.UserTracking {
        return UserDto.UserTracking(
            userTracking.hasSeenIntroCutscene,
            userTracking.createdAt,
            userTracking.updatedAt,
            userTracking.deletedAt
        )
    }

}
