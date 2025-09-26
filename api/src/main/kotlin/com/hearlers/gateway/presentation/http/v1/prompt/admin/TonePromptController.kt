package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.model.tonePrompt
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest
import com.hearlers.gateway.PromptUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.TonePromptDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.TonePromptMapper
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
import org.springdoc.core.annotations.ParameterObject
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController("v1TonePromptAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class TonePromptController(
    private val promptUseCase: PromptUseCase,
    ) {
    @Operation(summary = "톤 프롬프트 조회", description = "ID로 톤 프롬프트를 조회합니다. 톤 프롬프트는 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "톤 프롬프트 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "톤 프롬프트 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "톤 프롬프트를 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/tone-prompts/{tone-prompt-id}")
    fun getTonePromptById(
        @PathVariable(name = "tone-prompt-id", required = true) tonePromptId: String
    ): ResponseEntity<ResponseDto.Success<TonePromptDto.FindByIdResponse>> {
        val findTonePromptByIdRequest = FindTonePromptByIdRequest.newBuilder()
            .setTonePromptId(tonePromptId)
            .build()
        val tonePrompt = promptUseCase.findTonePromptById(findTonePromptByIdRequest)
                ?: throw HttpException(HttpResultCode.NOT_FOUND)

        val response = TonePromptDto.FindByIdResponse(TonePromptMapper.convertProtoToResponseModel(tonePrompt))

        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 조회 성공")
    }

    @Operation(summary = "톤 프롬프트 전체 조회", description = "톤 프롬프트를 전체 조회합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "톤 프롬프트 전체 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "톤 프롬프트 전체 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/tone-prompts")
    fun getTonePrompts(
        @ParameterObject @ModelAttribute requestDto: @Valid TonePromptDto.FindRequest
    ): ResponseEntity<ResponseDto.Success<TonePromptDto.FindResponse>> {
        val request = TonePromptMapper.convertFindRequestToProto(requestDto)
        val tonePrompts = promptUseCase.findTonePrompts(request)

        val response = TonePromptDto.FindResponse(tonePrompts.map { TonePromptMapper.convertProtoToResponseModel(it) })

        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 전체 조회 성공")
    }

    @Operation(summary = "임시 버전에서 톤 프롬프트 업데이트", description = "임시 버전에서 톤 프롬프트를 업데이트합니다. 톤 ID와 본문을 지정할 수 있습니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "톤 프롬프트 업데이트 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "톤 프롬프트 업데이트 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/temporary-version/tone-prompts")
    fun updateTonePrompt(
        @RequestBody request: @Valid TonePromptDto.UpdateRequest
    ): ResponseEntity<ResponseDto.Success<TonePromptDto.UpdateResponse>> {
        val updateTonePromptRequest = TonePromptMapper.convertUpdateRequestToProto(request)
        val tonePrompt = promptUseCase.updateTonePrompt(updateTonePromptRequest)

        val response = TonePromptDto.UpdateResponse(TonePromptMapper.convertProtoToResponseModel(tonePrompt))

        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 업데이트 성공")
    }

}