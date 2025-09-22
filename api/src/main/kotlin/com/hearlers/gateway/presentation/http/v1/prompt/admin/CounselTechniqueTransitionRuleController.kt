package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.service.DeleteCounselTechniqueTransitionRuleRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniqueTransitionRuleByIdRequest
import com.hearlers.gateway.CounselTechniqueUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.CounselTechniqueTransitionRuleDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.CounselTechniqueTransitionRuleMapper
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


@RestController("v1CounselTechniqueTransitionRuleAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class CounselTechniqueTransitionRuleController(
    private val counselTechniqueUseCase: CounselTechniqueUseCase
) {
    @Operation(summary = "상담 기법 전환 규칙 조회", description = "ID로 상담 기법 전환 규칙을 조회합니다.")
    @ApiResponses(
        value = [ApiResponse(responseCode = "200", description = "상담 기법 전환 규칙 조회 성공"), ApiResponse(
            responseCode = "400",
            description = "상담 기법 전환 규칙 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/counsel-techniques/transition-rules/{transition-rule-id}")
    fun getCounselTechniqueTransitionRuleById(
        @PathVariable(name = "transition-rule-id") counselTechniqueTransitionRuleId: String
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueTransitionRuleDto.FindByIdResponse>> {
        val findCounselTechniqueTransitionRuleByIdRequest =
            FindCounselTechniqueTransitionRuleByIdRequest.newBuilder()
                .setCounselTechniqueTransitionRuleId(counselTechniqueTransitionRuleId)
                .build()
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueTransitionRuleById(
                findCounselTechniqueTransitionRuleByIdRequest
            ) ?: throw HttpException(HttpResultCode.NOT_FOUND)
        }
        val response = CounselTechniqueTransitionRuleDto.FindByIdResponse(
            CounselTechniqueTransitionRuleMapper.convertProtoToResponseModel(counselTechniqueTransitionRule)
        )
        return ResponseDtoUtil.okResponse(
            response,
            "상담 기법 전환 규칙 조회 성공"
        )
    }

    @Operation(summary = "상담 기법 전환 규칙 전체 조회", description = "상담 기법 전환 규칙을 전체 조회합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "상담 기법 전환 규칙 목록 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "상담 기법 전환 규칙 목록 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/counsel-techniques/transition-rules")
    fun getCounselTechniqueTransitionRules(
        @ParameterObject @ModelAttribute requestDto: @Valid CounselTechniqueTransitionRuleDto.FindRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueTransitionRuleDto.FindResponse>> {
        val request = CounselTechniqueTransitionRuleMapper.convertFindRequestToProto(requestDto)
        val counselTechniqueTransitionRules = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueTransitionRules(request)
        }
        val response = CounselTechniqueTransitionRuleDto.FindResponse(
            counselTechniqueTransitionRules.map {
                CounselTechniqueTransitionRuleMapper.convertProtoToResponseModel(it)
            }
        )

        return ResponseDtoUtil.okResponse(
            response,
            "상담 기법 전환 규칙 목록 조회 성공"
        )
    }

    @Operation(summary = "상담 기법 전환 규칙 생성", description = "상담 기법 전환 규칙을 생성합니다.")
    @ApiResponses(
        value = [ApiResponse(responseCode = "200", description = "상담 기법 전환 규칙 생성 성공"), ApiResponse(
            responseCode = "400",
            description = "상담 기법 전환 규칙 생성 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PostMapping("/counsel-techniques/transition-rules")
    fun createCounselTechniqueTransitionRule(
        @RequestBody request: @Valid CounselTechniqueTransitionRuleDto.CreateRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueTransitionRuleDto.CreateResponse>> {
        val createCounselTechniqueTransitionRuleRequest = CounselTechniqueTransitionRuleMapper.convertCreateRequestToProto(request)
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.createCounselTechniqueTransitionRule(createCounselTechniqueTransitionRuleRequest)
        }
        val response = CounselTechniqueTransitionRuleDto.CreateResponse(CounselTechniqueTransitionRuleMapper.convertProtoToResponseModel(counselTechniqueTransitionRule))

        return ResponseDtoUtil.okResponse(
            response,
            "상담 기법 전환 규칙 생성 성공"
        )
    }

    @Operation(summary = "상담 기법 전환 규칙 수정", description = "상담 기법 전환 규칙을 수정합니다.")
    @ApiResponses(
        value = [ApiResponse(responseCode = "200", description = "상담 기법 전환 규칙 수정 성공"), ApiResponse(
            responseCode = "400",
            description = "상담 기법 전환 규칙 수정 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/counsel-techniques/transition-rules/{transition-rule-id}")
    fun updateCounselTechniqueTransitionRule(
        @PathVariable(name = "transition-rule-id") counselTechniqueTransitionRuleId: String,
        @RequestBody request: @Valid CounselTechniqueTransitionRuleDto.UpdateRequest
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueTransitionRuleDto.UpdateResponse>> {
        val updateCounselTechniqueTransitionRuleRequest =
            CounselTechniqueTransitionRuleMapper.convertUpdateRequestToProto(counselTechniqueTransitionRuleId, request)
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.updateCounselTechniqueTransitionRule(updateCounselTechniqueTransitionRuleRequest)
        }
        val response = CounselTechniqueTransitionRuleDto.UpdateResponse(CounselTechniqueTransitionRuleMapper.convertProtoToResponseModel(counselTechniqueTransitionRule))

        return ResponseDtoUtil.okResponse(
            response,
            "상담 기법 전환 규칙 수정 성공"
        )
    }

    @Operation(summary = "상담 기법 전환 규칙 삭제", description = "상담 기법 전환 규칙을 삭제합니다.")
    @ApiResponses(
        value = [ApiResponse(responseCode = "200", description = "상담 기법 전환 규칙 삭제 성공"), ApiResponse(
            responseCode = "400",
            description = "상담 기법 전환 규칙 삭제 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @DeleteMapping("/counsel-techniques/transition-rules/{transition-rule-id}")
    fun deleteCounselTechniqueTransitionRule(
        @PathVariable(name = "transition-rule-id") counselTechniqueTransitionRuleId: String
    ): ResponseEntity<ResponseDto.Success<CounselTechniqueTransitionRuleDto.DeleteResponse>> {
        val deleteCounselTechniqueTransitionRuleRequest =
            DeleteCounselTechniqueTransitionRuleRequest.newBuilder()
                .setCounselTechniqueTransitionRuleId(counselTechniqueTransitionRuleId)
                .build()
        val deleteCounselTechniqueTransitionRuleResponse = runBlocking {
            counselTechniqueUseCase.deleteCounselTechniqueTransitionRule(deleteCounselTechniqueTransitionRuleRequest)
        }
        val response = CounselTechniqueTransitionRuleDto.DeleteResponse(deleteCounselTechniqueTransitionRuleResponse)

        return ResponseDtoUtil.okResponse(response, "상담 기법 전환 규칙 삭제 성공")
    }

}