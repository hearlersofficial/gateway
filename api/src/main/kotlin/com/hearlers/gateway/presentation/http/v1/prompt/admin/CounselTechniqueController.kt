package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest
import com.hearlers.gateway.CounselTechniqueUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.CounselTechniqueDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.CounselTechniqueMapper
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

@RestController("v1CounselTechniqueAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class CounselTechniqueController(
    private val counselTechniqueUseCase: CounselTechniqueUseCase
) {
    @Operation(summary = "상담 기법 조회", description = "ID로 상담 기법을 조회합니다. 상담 기법은 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "상담 기법 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "상담 기법 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "상담 기법을 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/counsel-techniques/{counsel-technique-id}")
    fun getCounselTechniqueById(
        @PathVariable(name = "counsel-technique-id") counselTechniqueId: String
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueDto.FindByIdResponse>> {
        val findCounselTechniqueByIdRequest = FindCounselTechniqueByIdRequest.newBuilder()
            .setCounselTechniqueId(counselTechniqueId)
            .build()
        val counselTechnique = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueById(findCounselTechniqueByIdRequest)
                ?: throw HttpException(HttpResultCode.NOT_FOUND)
        }
        val response = CounselTechniqueDto.FindByIdResponse(CounselTechniqueMapper.convertProtoToResponseModel(counselTechnique))
        return ResponseDtoUtil.okResponse(response, "상담 기법 조회 성공")
    }

    @Operation(
        summary = "상담 기법 전체 조회", description = "상담 기법을 전체 조회합니다. prompt-version-id는 필수 파라미터입니다."
    )
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "상담 기법 목록 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "상담 기법 목록 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/counsel-techniques")
    fun getCounselTechniques(
        @ParameterObject @ModelAttribute requestDto: @Valid CounselTechniqueDto.FindRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueDto.FindResponse>> {
        val request = CounselTechniqueMapper.convertFindRequestToProto(requestDto)
        print(request)
        print(requestDto)
        val counselTechniques = runBlocking { counselTechniqueUseCase.findCounselTechniques(request) }
        val response = CounselTechniqueDto.FindResponse(counselTechniques.map { CounselTechniqueMapper.convertProtoToResponseModel(it) })

        return ResponseDtoUtil.okResponse(response, "상담 기법 목록 조회 성공")
    }

    @Operation(
        summary = "임시 버전에 새로운 상담 기법 생성",
        description = "새로운 상담 기법을 임시기법으로 생성합니다. 임시기법은 다른 기법들과 링크되지 않으며, 추후 순서 지정이 필요합니다."
    )
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "201",
            description = "상담 기법 생성 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "상담 기법 생성 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PostMapping("/prompt-versions/temporary-version/counsel-techniques")
    fun createCounselTechnique(
        @RequestBody request: @Valid CounselTechniqueDto.CreateRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueDto.CreateResponse>> {
        val createCounselTechniqueRequest = CounselTechniqueMapper.convertCreateRequestToProto(request)
        val counselTechnique = runBlocking { counselTechniqueUseCase.createCounselTechnique(createCounselTechniqueRequest) }
        val response = CounselTechniqueDto.CreateResponse(CounselTechniqueMapper.convertProtoToResponseModel(counselTechnique))

        return ResponseDtoUtil.createdResponse(response, "상담 기법 생성 성공")
    }

    @Operation(
        summary = "임시 버전에서 상담 기법 업데이트",
        description = "임시 버전에서 기존 상담 기법을 업데이트합니다. 아직 링크되지 않은 임시기법은 수정할 수 없습니다. 수정 후 해당 기법이 포함된 기법리스트가 반환됩니다."
    )
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "상담 기법 업데이트 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "상담 기법 업데이트 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "상담 기법을 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/temporary-version/counsel-techniques/{counsel-technique-id}")
    fun updateCounselTechnique(
        @PathVariable(name = "counsel-technique-id", required = true) counselTechniqueId: String,
        @RequestBody request: @Valid CounselTechniqueDto.UpdateRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueDto.UpdateResponse>> {
        val updateCounselTechniqueRequest =
            CounselTechniqueMapper.convertUpdateRequestToProto(counselTechniqueId, request)
        val counselTechnique = runBlocking { counselTechniqueUseCase.updateCounselTechnique(updateCounselTechniqueRequest) }
        val response = CounselTechniqueDto.UpdateResponse(CounselTechniqueMapper.convertProtoToResponseModel(counselTechnique))

        return ResponseDtoUtil.okResponse(response, "상담 기법 업데이트 성공")
    }
}