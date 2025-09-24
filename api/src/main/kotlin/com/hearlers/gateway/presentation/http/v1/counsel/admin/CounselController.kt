package com.hearlers.gateway.presentation.http.v1.counsel.admin

import com.hearlers.gateway.CounselUseCase
import com.hearlers.gateway.presentation.http.v1.counsel.admin.dto.CounselDto
import com.hearlers.gateway.presentation.http.v1.counsel.admin.mapper.CounselDtoMapper
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

@RestController("v1CounselAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담", description = "상담 관련 API")
class CounselController(
    private val counselUseCase: CounselUseCase,
) {

    @Operation(summary = "상담 생성", description = "새로운 상담을 생성합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "상담 생성 성공"),
            ApiResponse(responseCode = "400", description = "잘못된 요청", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
        ]
    )
    @PostMapping("/counsels")
    fun createCounsel(
        @RequestParam(required = true) userId: String,
        @RequestParam(required = true) counselorId: String,
        @RequestBody @Valid request: CounselDto.CreateCounselRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.CreateCounselResponse>> {
        val createCounselRequest = CounselDtoMapper.toCreateCounselRequest(userId, counselorId, request)
        val response = runBlocking { counselUseCase.createCounsel(createCounselRequest) }
        val counselResponse = CounselDtoMapper.toCreateCounselResponse(response)
        return ResponseDtoUtil.okResponse(counselResponse, "상담 생성 성공")
    }

    @Operation(summary = "상담 목록 조회", description = "상담 목록을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "상담 목록 조회 성공"),
            ApiResponse(responseCode = "400", description = "잘못된 요청", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
        ]
    )
    @GetMapping("/counsels")
    fun findCounsels(
        @RequestParam(required = false) userId: String?,
        @RequestParam(required = false) counselorId: String?
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselsResponse>> {
        val findCounselsRequest = CounselDtoMapper.toFindCounselsRequest(userId, counselorId)
        val counsels = runBlocking { counselUseCase.findCounsels(findCounselsRequest) }
        val response = CounselDtoMapper.toFindCounselsResponse(counsels)
        return ResponseDtoUtil.okResponse(response, "상담 목록 조회 성공")
    }

    @Operation(summary = "상담 단건 조회", description = "ID로 특정 상담을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "상담 조회 성공"),
            ApiResponse(responseCode = "404", description = "상담을 찾을 수 없음", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
        ]
    )
    @GetMapping("/counsels/{counselId}")
    fun findCounselById(
        @PathVariable counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselByIdResponse>> {
        val findCounselByIdRequest = CounselDtoMapper.toFindCounselByIdRequest(counselId)
        val counsel = runBlocking { counselUseCase.findCounselById(findCounselByIdRequest) } ?: throw HttpException(HttpResultCode.NOT_FOUND)
        val response = CounselDtoMapper.toFindCounselByIdResponse(counsel)
        return ResponseDtoUtil.okResponse(response, "상담 조회 성공")
    }

    @Operation(summary = "메시지 생성", description = "특정 상담에 새 메시지를 생성합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "메시지 생성 성공"),
            ApiResponse(responseCode = "400", description = "잘못된 요청", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
        ]
    )
    @PostMapping("/counsels/{counselId}/messages")
    fun createMessage(
        @PathVariable counselId: String,
        @RequestBody @Valid request: CounselDto.CreateMessageRequest,
        @RequestAttribute(value = "userId", required = true) userId: String,
        ): ResponseEntity<ResponseDto.Success<CounselDto.CreateMessageResponse>> {
        val createMessageRequest = CounselDtoMapper.toCreateMessageRequest(counselId, request)
        val response = runBlocking { counselUseCase.createMessage(createMessageRequest, userId) }
        val messageResponse = CounselDtoMapper.toCreateMessageResponse(response)
        return ResponseDtoUtil.okResponse(messageResponse, "메시지 생성 성공")
    }

    @Operation(summary = "메시지 목록 조회", description = "특정 상담의 메시지 목록을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "메시지 목록 조회 성공")
        ]
    )
    @GetMapping("/counsels/{counselId}/messages")
    fun findMessages(
        @PathVariable counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindMessagesResponse>> {
        val findMessagesRequest = CounselDtoMapper.toFindMessagesRequest(counselId)
        val counselMessages = runBlocking { counselUseCase.findMessages(findMessagesRequest) }
        val response = CounselDtoMapper.toFindMessagesResponse(counselMessages)
        return ResponseDtoUtil.okResponse(response, "메시지 목록 조회 성공")
    }

    @Operation(summary = "메시지 반응", description = "특정 메시지에 반응을 추가합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "메시지 반응 성공"),
            ApiResponse(responseCode = "400", description = "잘못된 요청", content = [Content(schema = Schema(implementation = ResponseDto.Error::class))])
        ]
    )
    @PostMapping("/messages/{messageId}/react")
    fun reactMessage(
        @PathVariable messageId: String,
        @RequestBody @Valid request: CounselDto.ReactMessageRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.ReactMessageResponse>> {
        val reactMessageRequest = CounselDtoMapper.toReactMessageRequest(messageId, request)
        val counselMessage = runBlocking { counselUseCase.reactMessage(reactMessageRequest) }
        val response = CounselDtoMapper.toReactMessageResponse(counselMessage)
        return ResponseDtoUtil.okResponse(response, "메시지 반응 성공")
    }

    @Operation(summary = "상담사와 사용자 관계 조회", description = "상담사와 사용자의 관계 목록을 조회합니다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "관계 조회 성공")
        ]
    )
    @GetMapping("/counselor-user-relationships")
    fun findCounselorUserRelationships(
        @RequestParam(required = false) userId: String?
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselorUserRelationshipsResponse>> {
        val request = CounselDtoMapper.toFindCounselorUserRelationshipsRequest(userId)
        val relationships = runBlocking { counselUseCase.findCounselorUserRelationships(request) }
        val response = CounselDtoMapper.toFindCounselorUserRelationshipsResponse(relationships)
        return ResponseDtoUtil.okResponse(response, "관계 조회 성공")
    }
}
