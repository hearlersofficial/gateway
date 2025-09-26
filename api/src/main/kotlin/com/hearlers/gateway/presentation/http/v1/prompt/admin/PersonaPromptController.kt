package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest
import com.hearlers.gateway.PromptUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PersonaPromptDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.PersonaPromptMapper
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
import org.springdoc.core.annotations.ParameterObject
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController("v1PersonaPromptAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class PersonaPromptController(
    private val promptUseCase: PromptUseCase,
    ) {
    @Operation(summary = "페르소나 프롬프트 조회", description = "ID로 페르소나 프롬프트를 조회합니다. 페르소나 프롬프트는 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "페르소나 프롬프트 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "페르소나 프롬프트 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "페르소나 프롬프트를 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/persona-prompts/{persona-prompt-id}")
    fun getPersonaPromptById(
        @PathVariable(name = "persona-prompt-id", required = true) personaPromptId: String
    ): ResponseEntity<ResponseDto.Success<PersonaPromptDto.FindByIdResponse>> {
        val findPersonaPromptByIdRequest = FindPersonaPromptByIdRequest.newBuilder()
            .setPersonaPromptId(personaPromptId)
            .build()
        val personaPrompt =
            promptUseCase.findPersonaPromptById(findPersonaPromptByIdRequest)
                ?: throw HttpException(HttpResultCode.NOT_FOUND)

        val response = PersonaPromptDto.FindByIdResponse(PersonaPromptMapper.convertProtoToResponseModel(personaPrompt))

        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 조회 성공")
    }

    @Operation(summary = "페르소나 프롬프트 전체 조회", description = "페르소나 프롬프트를 전체 조회합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "페르소나 프롬프트 전체 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "페르소나 프롬프트 전체 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/persona-prompts")
    fun getPersonaPrompts(
        @ParameterObject @ModelAttribute requestDto: @Valid PersonaPromptDto.FindRequest
    ): ResponseEntity<ResponseDto.Success<PersonaPromptDto.FindResponse>> {
        val request = PersonaPromptMapper.convertFindRequestToProto(requestDto)
        val personaPrompts =
            promptUseCase.findPersonaPrompts(request)

        val response = PersonaPromptDto.FindResponse(personaPrompts.map { PersonaPromptMapper.convertProtoToResponseModel(it) })

        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 전체 조회 성공")
    }

    @Operation(summary = "임시 버전에서 페르소나 프롬프트 업데이트", description = "임시 버전에서 페르소나 프롬프트를 업데이트합니다. 카운셀러 ID와 본문을 지정할 수 있습니다.")
    @ApiResponses(
        value = [ApiResponse(responseCode = "200", description = "페르소나 프롬프트 업데이트 성공"), ApiResponse(
            responseCode = "400",
            description = "페르소나 프롬프트 업데이트 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/temporary-version/persona-prompts")
    fun updatePersonaPrompt(
        @RequestBody request: @Valid PersonaPromptDto.UpdateRequest
    ): ResponseEntity<ResponseDto.Success<PersonaPromptDto.UpdateResponse>> {
        val updatePersonaPromptRequest = PersonaPromptMapper.convertUpdateRequestToProto(request)
        val personaPrompt =
            promptUseCase.updatePersonaPrompt(updatePersonaPromptRequest)

        val response = PersonaPromptDto.UpdateResponse(PersonaPromptMapper.convertProtoToResponseModel(personaPrompt))

        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 업데이트 성공")
    }

}