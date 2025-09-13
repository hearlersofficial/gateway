package com.hearlers.gateway.presentation.http.v1.counsel.admin

import com.hearlers.gateway.CounselService
import com.hearlers.gateway.presentation.http.v1.counsel.app.CounselDto
import com.hearlers.gateway.presentation.http.v1.counsel.app.CounselDtoMapper
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
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

@RestController("v1CounselAdminController")
@RequestMapping
@Tag(name = "어드민/상담", description = "상담 관련 API")
class CounselController(private val counselService: CounselService) {

    private val counselDtoMapper = Mappers.getMapper(CounselDtoMapper::class.java)

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
    @PostMapping("/v1/admin/counselors/{counselor-id}/counsels")
    fun createCounsel(
        @PathVariable("counselor-id") counselorId: String,
        @RequestAttribute(value = "userId", required = false) userId: String?,
        @Valid @RequestBody request: CounselDto.CreateCounselRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.CreateCounselResponse>> {
        val createCounselRequest = counselDtoMapper.toCreateCounselRequest(userId, counselorId, request)
        val counsel = runBlocking {
            counselService.createCounsel(createCounselRequest)
        }
        val response = counselDtoMapper.toCreateCounselResponse(counsel)

        return ResponseDtoUtil.createdResponse(response, "상담 생성 성공")
    }

    @Operation(summary = "상담 목록 조회", description = "상담사 ID 또는 'all'을 입력하여 상담 목록을 조회합니다.")
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
    @GetMapping("/v1/admin/counselors/{counselor-id}/counsels")
    fun getCounsels(
        @Parameter(
            name = "counselor-id",
            description = "상담사 ID 또는 'all' 입력 시 전체 조회",
            example = "all"
        )
        @PathVariable("counselor-id") counselorId: String,
        @RequestAttribute(value = "userId", required = false) userId: String?
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselsResponse>> {
        val resolvedCounselorId = if ("all".equals(counselorId, ignoreCase = true)) null else counselorId
        val findCounselsRequest = counselDtoMapper.toFindCounselsRequest(userId, resolvedCounselorId)
        val counsels = runBlocking {
            counselService.findCounsels(findCounselsRequest)
        }
        val response = counselDtoMapper.toFindCounselsResponse(counsels)

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
    @GetMapping("/v1/admin/counselors/{counselor-id}/counsels/{counsel-id}")
    fun getCounsel(
        @PathVariable("counselor-id") counselorId: String,
        @PathVariable("counsel-id") counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindCounselByIdResponse>> {
        val findCounselByIdRequest = counselDtoMapper.toFindCounselByIdRequest(counselId)
        val counsel = runBlocking {
            counselService.findCounselById(findCounselByIdRequest)
        }
        val response = counselDtoMapper.toFindCounselByIdResponse(counsel)

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
    @PostMapping("/v1/admin/counselors/{counselor-id}/counsels/{counsel-id}/messages")
    fun createMessage(
        @PathVariable("counselor-id") counselorId: String,
        @PathVariable("counsel-id") counselId: String,
        @Valid @RequestAttribute(value = "userId", required = true) userId: String,
        @Valid @RequestBody request: CounselDto.CreateMessageRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.CreateMessageResponse>> {
        val createMessageRequest = counselDtoMapper.toCreateMessageRequest(counselId, request)
        val createMessageResponse = runBlocking {
            counselService.createMessage(createMessageRequest, userId)
        }
        val response = counselDtoMapper.toCreateMessageResponse(createMessageResponse)
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
    @GetMapping("/v1/admin/counselors/{counselor-id}/counsels/{counsel-id}/messages")
    fun getMessages(
        @PathVariable("counselor-id") counselorId: String,
        @PathVariable("counsel-id") counselId: String
    ): ResponseEntity<ResponseDto.Success<CounselDto.FindMessagesResponse>> {
        val findMessagesRequest = counselDtoMapper.toFindMessagesRequest(counselId)
        val counselMessages = runBlocking {
            counselService.findMessages(findMessagesRequest)
        }
        val response = counselDtoMapper.toFindMessagesResponse(counselMessages)

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
    @PostMapping("/v1/admin/counselors/{counselor-id}/counsels/{counsel-id}/messages/{message-id}/react")
    fun reactMessage(
        @PathVariable("counselor-id") counselorId: String,
        @PathVariable("counsel-id") counselId: String,
        @PathVariable("message-id") messageId: String,
        @Valid @RequestBody request: CounselDto.ReactMessageRequest
    ): ResponseEntity<ResponseDto.Success<CounselDto.ReactMessageResponse>> {
        val reactMessageRequest = counselDtoMapper.toReactMessageRequest(messageId, request)
        val counselMessage = runBlocking {
            counselService.reactMessage(reactMessageRequest)
        }
        val response = counselDtoMapper.toReactMessageResponse(counselMessage)

        return ResponseDtoUtil.okResponse(response, "메시지 반응 성공")
    }
}