package com.hearlers.gateway.presentation.http.v1.counsel.app

import com.hearlers.gateway.CounselUseCase
import com.hearlers.gateway.presentation.http.v1.counsel.app.dto.CounselDto
import com.hearlers.gateway.presentation.http.v1.counsel.app.mapper.CounselDtoMapper
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
import jakarta.validation.Valid
import kotlinx.coroutines.runBlocking
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController("v1CounselAppController")
@RequestMapping("/v1/app")
@Tag(name = "앱/상담", description = "상담 관련 API")
class CounselController(
    private val counselUseCase: CounselUseCase
) {

    @Operation(summary = "상담 생성", description = "새로운 상담을 생성합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "201", description = "상담 생성 성공"),
            ApiResponse(
                responseCode = "400",
                description = "상담 생성 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @PostMapping("/counselors/{counselorId}/counsels")
    fun createCounsel(
        @PathVariable counselorId: String,
        @RequestAttribute(value = "userId") userId: String,
        @Valid @RequestBody request: CounselDto.CreateCounselRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.CreateCounselResponse>> {
        val createCounselRequest = CounselDtoMapper.toCreateCounselRequest(userId, counselorId, request)
        val counsel = runBlocking { counselUseCase.createCounsel(createCounselRequest) }
        val response = CounselDtoMapper.toCreateCounselResponse(counsel)
        return ResponseDtoUtil.createdResponse(response, "상담 생성 성공")
    }

    @Operation(summary = "상담 목록 조회", description = "상담사 ID 또는 'me'를 입력하여 상담 목록을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "상담 목록 조회 성공"),
            ApiResponse(
                responseCode = "400",
                description = "상담 목록 조회 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/counsels")
    fun getCounsels(
        @RequestAttribute(value = "userId") userId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselsResponse>> {
        val findCounselsRequest = CounselDtoMapper.toFindCounselsRequest(userId, null)
        val counsels = runBlocking { counselUseCase.findCounsels(findCounselsRequest) }
        val response = CounselDtoMapper.toFindCounselsResponse(counsels)
        return ResponseDtoUtil.okResponse(response, "상담 목록 조회 성공")
    }

    @Operation(summary = "상담 단건 조회", description = "상담을 단건 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "상담 조회 성공"),
            ApiResponse(
                responseCode = "400",
                description = "상담 조회 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/counsels/{counselId}")
    fun getCounsel(
        @PathVariable counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselByIdResponse>> {
        val findCounselByIdRequest = CounselDtoMapper.toFindCounselByIdRequest(counselId)
        val counsel = runBlocking { counselUseCase.findCounselById(findCounselByIdRequest) } ?: throw HttpException(HttpResultCode.NOT_FOUND)
        val response = CounselDtoMapper.toFindCounselByIdResponse(counsel)
        return ResponseDtoUtil.okResponse(response, "상담 조회 성공")
    }

    @Operation(summary = "메시지 생성", description = "상담에 새로운 메시지를 생성합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "201", description = "메시지 생성 성공"),
            ApiResponse(
                responseCode = "400",
                description = "메시지 생성 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @PostMapping("/counsels/{counselId}/messages")
    fun createMessage(
        @PathVariable counselId: String,
        @RequestAttribute(value = "userId") userId: String,
        @Valid @RequestBody request: CounselDto.CreateMessageRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.CreateMessageResponse>> {
        val createMessageRequest = CounselDtoMapper.toCreateMessageRequest(counselId, request)
        val createMessageResponse = runBlocking { counselUseCase.createMessage(createMessageRequest, userId) }
        val response = CounselDtoMapper.toCreateMessageResponse(createMessageResponse)
        return ResponseDtoUtil.createdResponse(response, "메시지 생성 성공")
    }

    @Operation(summary = "메시지 목록 조회", description = "상담의 메시지 목록을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "메시지 목록 조회 성공"),
            ApiResponse(
                responseCode = "400",
                description = "메시지 목록 조회 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/counsels/{counselId}/messages")
    fun getMessages(
        @PathVariable counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindMessagesResponse>> {
        val findMessagesRequest = CounselDtoMapper.toFindMessagesRequest(counselId)
        val counselMessages = runBlocking { counselUseCase.findMessages(findMessagesRequest) }
        val response = CounselDtoMapper.toFindMessagesResponse(counselMessages)
        return ResponseDtoUtil.okResponse(response, "메시지 목록 조회 성공")
    }

    @Operation(summary = "메시지 반응", description = "메시지에 반응을 추가합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "메시지 반응 성공"),
            ApiResponse(
                responseCode = "400",
                description = "메시지 반응 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @PostMapping("/messages/{messageId}/react")
    fun reactMessage(
        @PathVariable messageId: String,
        @Valid @RequestBody request: CounselDto.ReactMessageRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.ReactMessageResponse>> {
        val reactMessageRequest = CounselDtoMapper.toReactMessageRequest(messageId, request)
        val counselMessage = runBlocking { counselUseCase.reactMessage(reactMessageRequest) }
        val response = CounselDtoMapper.toReactMessageResponse(counselMessage)
        return ResponseDtoUtil.okResponse(response, "메시지 반응 성공")
    }

    @Operation(summary = "상담사와 유저의 관계 조회", description = "상담사와 유저의 관계를 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "관계 조회 성공"),
            ApiResponse(
                responseCode = "400",
                description = "관계 조회 실패",
                content = [Content(schema = Schema(implementation = ResponseDto.Error::class))]
            )
        ]
    )
    @GetMapping("/counselor-user-relationships")
    fun getCounselorUserRelationships(
        @RequestAttribute(value = "userId") userId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselorUserRelationshipsResponse>> {
        val findRelationshipsRequest = CounselDtoMapper.toFindCounselorUserRelationshipsRequest(userId)
        val relationships = runBlocking { counselUseCase.findCounselorUserRelationships(findRelationshipsRequest) }
        val response = CounselDtoMapper.toFindCounselorUserRelationshipsResponse(relationships)
        return ResponseDtoUtil.okResponse(response, "관계 조회 성공")
    }
}
