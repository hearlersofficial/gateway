package com.hearlers.gateway.presentation.http.v1.user.admin

import com.hearlers.gateway.UserUseCase
import com.hearlers.gateway.presentation.http.v1.users.admin.UserDto
import com.hearlers.gateway.presentation.http.v1.users.admin.UserDtoMapper
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import kotlinx.coroutines.runBlocking
import org.mapstruct.factory.Mappers
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

    private val userDtoMapper = Mappers.getMapper(UserDtoMapper::class.java)

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
        val findUserRequest = userDtoMapper.toFindUserByUserIdRequest(userId)
        val user = runBlocking {
            userUseCase.findUserByUserId(findUserRequest)
        }
        val response = userDtoMapper.toFindUserByIdResponse(user)
        return ResponseDtoUtil.okResponse(response, "유저 조회 성공")
    }
}