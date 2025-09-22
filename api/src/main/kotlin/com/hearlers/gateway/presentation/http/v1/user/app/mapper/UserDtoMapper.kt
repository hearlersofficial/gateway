package com.hearlers.gateway.presentation.http.v1.user.app.mapper

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.model.UserProfile
import com.hearlers.api.proto.v1.service.UpdateUserRequest
import com.hearlers.gateway.presentation.http.v1.user.app.dto.UserDto

object UserDtoMapper {

    fun of(user: User): UserDto.User {
        return UserDto.User(
            id = user.id,
            nickname = user.nickname,
            userProfile = of(user.userProfile)
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

    fun toUpdateUserRequest(userId: String, request: UserDto.UpdateMyUserRequest): UpdateUserRequest {
        val builder = UpdateUserRequest.newBuilder().setUserId(userId)
        request.nickname?.let { builder.setNickname(it) }
        request.profileImage?.let { builder.setProfileImage(it) }
        request.gender?.let { builder.setGender(it) }
        request.mbti?.let { builder.setMbti(it) }
        request.birthday?.let { builder.setBirthday(it) }
        return builder.build()
    }

    fun toUpdateMyUserResponse(user: User): UserDto.UpdateMyUserResponse {
        return UserDto.UpdateMyUserResponse(user = of(user))
    }

    fun toFindMyUserResponse(user: User): UserDto.FindMyUserResponse {
        return UserDto.FindMyUserResponse(user = of(user))
    }
}
