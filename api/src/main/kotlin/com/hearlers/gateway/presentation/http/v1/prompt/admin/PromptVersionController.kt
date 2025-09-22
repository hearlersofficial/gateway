package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.PromptVersionUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PromptVersionDto
import com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper.PromptVersionMapper
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

@RestController("v1PromptVersionAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class PromptVersionController(
    private val promptVersionUseCase: PromptVersionUseCase,
    ) {

    @Operation(summary = "프롬프트 버전 목록 조회", description = "프롬프트 버전 목록을 조회합니다. 옵션으로 이름 검색이 가능합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 버전 목록 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 버전 목록 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/prompt-versions")
    fun getPromptVersions(
        @ParameterObject request: @Valid PromptVersionDto.FindRequest
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.FindResponse>> {
        val promptVersions = runBlocking {
            promptVersionUseCase.findPromptVersions(PromptVersionMapper.convertFindRequestToProto(request))
        }
        val response = PromptVersionDto.FindResponse(
            promptVersions.map { PromptVersionMapper.convertProtoToResponseModel(it) },
        )
        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 목록 조회 성공")
    }

    @Operation(summary = "프롬프트 버전 조회", description = "ID로 특정 프롬프트 버전을 조회합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 버전 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 버전 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "프롬프트 버전을 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @GetMapping("/prompt-versions/{prompt-version-id}")
    fun getPromptVersionById(
        @PathVariable(name = "prompt-version-id", required = true) promptVersionId: String
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.FindByIdResponse>> {
        val promptVersion = runBlocking {
            promptVersionUseCase.findPromptVersionById(
                FindPromptVersionByIdRequest.newBuilder()
                    .setPromptVersionId(promptVersionId)
                    .build()
            )
        } ?: throw HttpException(HttpResultCode.NOT_FOUND)
        val response = PromptVersionDto.FindByIdResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 조회 성공")
    }


    @Operation(summary = "프롬프트 버전 수정", description = "프롬프트 버전을 수정합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 버전 수정 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 버전 수정 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/{prompt-version-id}")
    fun updatePromptVersion(
        @PathVariable(name = "prompt-version-id", required = true) promptVersionId: String,
        @RequestBody request: @Valid PromptVersionDto.UpdateRequest
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.UpdateResponse>> {
        val updatePromptVersionRequest = PromptVersionMapper.convertUpdateRequestToProto(promptVersionId, request)
        val promptVersion = runBlocking {
            promptVersionUseCase.updatePromptVersion(updatePromptVersionRequest)
        }
        val response = PromptVersionDto.UpdateResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 수정 성공")
    }

    @Operation(summary = "프롬프트 버전 삭제", description = "프롬프트 버전을 삭제합니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 버전 삭제 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 버전 삭제 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @DeleteMapping("/prompt-versions/{prompt-version-id}")
    fun deletePromptVersion(
        @PathVariable(name = "prompt-version-id", required = true) promptVersionId: String
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.DeleteResponse>> {
        val deletePromptVersionRequest = DeletePromptVersionsRequest.newBuilder()
            .addPromptVersionIds(promptVersionId)
            .build()
        val isSuccess : Boolean = runBlocking {
            promptVersionUseCase.deletePromptVersion(deletePromptVersionRequest)
        }
        val response = PromptVersionDto.DeleteResponse(isSuccess)
        return ResponseDtoUtil.okResponse(
            response,
            "프롬프트 버전 삭제 성공"
        )
    }


    @GetMapping("/prompt-versions/active-version")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "활성화된 프롬프트 버전 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "활성화된 프롬프트 버전 조회 실패",
            content = arrayOf(
                Content(
                    schema = Schema(implementation = ResponseDto.Error::class)
                )
            )
        )]
    )
    @Operation(
        summary = "현재 활성화된 프롬프트 버전 조회", description = "현재 활성화된 프롬프트 버전을 조회합니다. 활성화된 버전은 수정이 불가능 합니다."
    )
    fun getActiveVersion(): ResponseEntity<ResponseDto.Success<PromptVersionDto.FindActiveVersionResponse>> {
        val findActiveVersionRequest = FindActiveVersionRequest.newBuilder().build()
        val promptVersion = runBlocking {
            promptVersionUseCase.findActiveVersion(findActiveVersionRequest)
        }
        val response = PromptVersionDto.FindActiveVersionResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))
        return ResponseDtoUtil.okResponse(response, "활성화된 프롬프트 버전 조회 성공")
    }


    @GetMapping("/prompt-versions/temporary-version")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "임시 프롬프트 버전 조회 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "임시 프롬프트 버전 조회 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @Operation(
        summary = "현재 수정 중인 임시 프롬프트 버전 조회", description = "현재 수정 중인 임시 프롬프트 버전을 조회합니다. 2025.04.17 기준 피그마 상 보이는 모든 뷰는 이 API를 통하면 됩니다. 추후 토글을 통해 임시 버전과 활성화 버전을 왔다갈 수 있게 해야 좋을 듯 합니다. 임시 버전이 비게 되면, 임시 버전 라이프사이클에 의해 새로운 임시 버전이 자동 생성됩니다. 즉 오직 1개의 임시 버전이 항상 존재합니다."
    )
    fun getTemporaryVersion(): ResponseEntity<ResponseDto.Success<PromptVersionDto.FindTemporaryVersionResponse>> {
        val request = FindTemporaryVersionRequest.newBuilder().build()
        val promptVersion = runBlocking {
            promptVersionUseCase.findTemporaryVersion(request)
        }
        val response = PromptVersionDto.FindTemporaryVersionResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "임시 프롬프트 버전 조회 성공")
    }

    @Operation(summary = "임시 버전에 기존 프롬프트 버전 로드", description = "저장된 버전을 임시 버전으로 복사합니다. 기존 수정 중이던 임시 버전을 덮어씁니다.")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "기존 프롬프트 버전 로드 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "기존 프롬프트 버전 로드 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "프롬프트 버전을 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/temporary-version/{prompt-version-id}")
    fun loadPromptVersion(
        @PathVariable(name = "prompt-version-id", required = true) promptVersionId: String
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.LoadExistingPromptVersionResponse>> {
        val request = LoadExistingPromptVersionRequest.newBuilder()
            .setPromptVersionId(promptVersionId)
            .build()
        val promptVersion = runBlocking {
            promptVersionUseCase.loadExistingPromptVersion(request)
        }
        val response = PromptVersionDto.LoadExistingPromptVersionResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "기존 프롬프트 버전 로드 성공")
    }

    @Operation(
        summary = "임시 프롬프트 버전에 이름과 설명을 지정하고 영구 상태로 변경하여 저장", description = "현재 수정 중인 임시 프롬프트 버전을 영구 저장합니다. 이름과 설명을 지정하여 임시 상태(isTemporary=true)에서 정식 버전(isTemporary=false)으로 전환됩니다. 저장을 통해 임시 버전이 비게 되면, 임시 버전 라이프사이클에 의해 새로운 임시 버전이 자동 생성됩니다."
    )
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "임시 버전 저장 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "임시 버전 저장 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PutMapping("/prompt-versions/temporary-version")
    fun saveVersion(
        @RequestBody request: @Valid PromptVersionDto.SaveTemporaryVersionRequest
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.SaveTemporaryVersionResponse>> {
        val saveTemporaryVersionRequest = PromptVersionMapper.convertSaveTemporaryVersionRequestToProto(request)
        val promptVersion = runBlocking {
            promptVersionUseCase.saveTemporaryVersion(saveTemporaryVersionRequest)
        }
        val response = PromptVersionDto.SaveTemporaryVersionResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "임시 버전 저장 성공")
    }

    @Operation(
        summary = "프롬프트 버전 활성화",
        description = "저장된 버전을 활성화합니다(서비스에 반영). 이후 생성되는 상담들부터 해당 버전이 적용되며, 기존 상담들에는 영향이 없습니다. 임시버전은 활성화할 수 없습니다."
    )
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "프롬프트 버전 활성화 성공"
        ), ApiResponse(
            responseCode = "400",
            description = "프롬프트 버전 활성화 실패",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        ), ApiResponse(
            responseCode = "404",
            description = "프롬프트 버전을 찾을 수 없음",
            content = arrayOf(Content(schema = Schema(implementation = ResponseDto.Error::class)))
        )]
    )
    @PostMapping("/prompt-versions/{prompt-version-id}/activate")
    fun activatePromptVersion(
        @PathVariable(name = "prompt-version-id", required = true) promptVersionId: String
    ): ResponseEntity<ResponseDto.Success<PromptVersionDto.ActivatePromptVersionResponse>> {
        val activatePromptVersionRequest = ActivatePromptVersionRequest.newBuilder()
            .setPromptVersionId(promptVersionId)
            .build()
        val promptVersion = runBlocking {
            promptVersionUseCase.activatePromptVersion(activatePromptVersionRequest)
        }
        val response = PromptVersionDto.ActivatePromptVersionResponse(PromptVersionMapper.convertProtoToResponseModel(promptVersion))

        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 활성화 성공")
    }

}