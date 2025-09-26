package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.model.*
import com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest
import com.hearlers.gateway.PromptVersionUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PromptActivateHistoryDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.PromptActivateHistoryMapper
import com.hearlers.gateway.shared.response.ResponseDto
import com.hearlers.gateway.shared.response.ResponseDtoUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController("v1PromptActivateHistoryAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class PromptActivateHistoryController(
    private val promptVersionUseCase: PromptVersionUseCase,
) {
    @Operation(summary = "프롬프트 활성화 히스토리 목록 조회", description = "프롬프트 활성화 히스토리 목록을 조회합니다. 특정 버전 ID로 필터링할 수 있습니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 활성화 히스토리 목록 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 활성화 히스토리 목록 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/prompt-activate-histories")
    fun getPromptActivateHistories(
        @RequestParam(required = false, name = "prompt-version-id") promptVersionId: String?
    ): ResponseEntity<ResponseDto.Success<PromptActivateHistoryDto.FindResponse>> {
        val findPromptActivateHistoriesRequest =
            FindPromptActivateHistoriesRequest.newBuilder()
                .apply {
                    promptVersionId?.let { setPromptVersionId(it) }
                }
                .build()

        val promptActivateHistories =
            promptVersionUseCase.findPromptActivateHistories(findPromptActivateHistoriesRequest)

        val response = PromptActivateHistoryDto.FindResponse(promptActivateHistories.map { PromptActivateHistoryMapper.convertProtoToResponseModel(it) })

        return ResponseDtoUtil.okResponse(response, "프롬프트 활성화 히스토리 목록 조회 성공")
    }
}