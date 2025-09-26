package com.hearlers.gateway.presentation.http.v1.user.admin

import com.hearlers.api.proto.v1.model.user
import com.hearlers.gateway.UserUseCase
import com.hearlers.gateway.presentation.http.v1.user.admin.dto.UserDto
import com.hearlers.gateway.presentation.http.v1.user.admin.mapper.UserDtoMapper
import com.hearlers.gateway.shared.exception.HttpException
import com.hearlers.gateway.shared.exception.HttpResultCode
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("v1UserAdminController")
@RequestMapping("/v1/admin/users")
@Tag(name = "어드민/유저", description = "유저 관련 API")
class UserController(
    private val userUseCase: UserUseCase
) {

    @Operation(summary = "유저 단건 조회", description = "유저를 단건 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "유저 조회 성공"),
            ApiResponse(
                responseCode = "404",
                description = "유저를 찾을 수 없음",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/{user-id}")
    fun getUser(@PathVariable("user-id") userId: String): ResponseEntity<ResponseDto.Success<UserDto.FindUserByIdResponse>> {
        val findUserRequest = UserDtoMapper.toFindUserByUserIdRequest(userId)
        val user = userUseCase.findUserByUserId(findUserRequest)
                ?: throw HttpException(HttpResultCode.NOT_FOUND)
        val response = UserDtoMapper.toFindUserByIdResponse(user)
        return ResponseDtoUtil.okResponse(response, "유저 조회 성공")
    }
}
