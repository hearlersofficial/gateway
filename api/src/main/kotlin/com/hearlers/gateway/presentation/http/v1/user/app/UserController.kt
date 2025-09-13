package com.hearlers.gateway.presentation.http.v1.user.app

import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest
import com.hearlers.gateway.UserUseCase
import com.hearlers.gateway.presentation.http.v1.users.app.UserDto
import com.hearlers.gateway.presentation.http.v1.users.app.UserDtoMapper
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import kotlinx.coroutines.runBlocking
import org.mapstruct.factory.Mappers
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController("v1UserAppController")
@RequestMapping("/v1/users")
@Tag(name = "앱/유저", description = "유저 관련 API")
class UserController(
    private val userUseCase: UserUseCase,
    useCase: UserUseCase,
    aCase: UserUseCase
) {

    private val userDtoMapper = Mappers.getMapper(UserDtoMapper::class.java)

    @Operation(summary = "내 정보 조회", description = "현재 로그인한 사용자의 정보를 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "내 정보 조회 성공"),
            ApiResponse(
                responseCode = "404",
                description = "사용자를 찾을 수 없음",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/me")
    fun getMyUser(
        @RequestAttribute(value = "userId", required = false) userId: String
    ): ResponseEntity<ResponseDto.Success<UserDto.FindMyUserResponse>> {
        val findUserRequest = FindUserByUserIdRequest.newBuilder().setUserId(userId).build()
        val user = runBlocking {
            userUseCase.findUserByUserId(findUserRequest)
        }
        val response = userDtoMapper.toFindMyUserResponse(user)
        return ResponseDtoUtil.okResponse(response, "내 정보 조회 성공")
    }

    @Operation(summary = "내 프로필 업데이트", description = "현재 로그인한 사용자의 프로필 정보를 업데이트합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "프로필 업데이트 성공"),
            ApiResponse(
                responseCode = "400",
                description = "잘못된 요청",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            ),
            ApiResponse(
                responseCode = "404",
                description = "사용자를 찾을 수 없음",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @PutMapping("/me")
    fun updateMyUser(
        @RequestAttribute(value = "userId", required = false) userId: String,
        @Valid @RequestBody request: UserDto.UpdateMyUserRequest
    ): ResponseEntity<ResponseDto.Success<UserDto.UpdateMyUserResponse>> {
        val updateUserRequest = userDtoMapper.toUpdateUserRequest(userId, request)
        val user = runBlocking {
            userUseCase.updateUser(updateUserRequest)
        }
        val response = userDtoMapper.toUpdateMyUserResponse(user)
        return ResponseDtoUtil.okResponse(response, "프로필 업데이트 성공")
    }
}