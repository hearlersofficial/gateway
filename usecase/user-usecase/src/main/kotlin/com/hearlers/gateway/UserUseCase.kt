package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.model.UserTracking
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest
import com.hearlers.api.proto.v1.service.UpdateTrackingRequest
import com.hearlers.api.proto.v1.service.UpdateUserRequest

interface UserUseCase {
    fun updateUser(request: UpdateUserRequest): User
    fun findUserByUserId(request: FindUserByUserIdRequest): User?
    fun updateUserTracking(request: UpdateTrackingRequest): UserTracking
    fun getUserTrackingByUserId(userId: String): UserTracking
}