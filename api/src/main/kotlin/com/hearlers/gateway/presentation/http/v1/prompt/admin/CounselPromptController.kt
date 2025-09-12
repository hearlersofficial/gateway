package com.hearlers.gateway.presentation.http.v1.prompt.admin

import com.hearlers.api.proto.v1.model.*
import com.hearlers.api.proto.v1.service.FindActiveVersionRequest
import com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest
import com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest
import com.hearlers.gateway.CounselTechniqueUseCase
import com.hearlers.gateway.PromptUseCase
import com.hearlers.gateway.PromptVersionUseCase
import com.hearlers.gateway.presentation.http.v1.prompt.admin.CounselPromptDto.*
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

@RestController("v1CounselPromptAdminController")
@RequestMapping("/v1/admin")
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
class CounselPromptController(
    private val promptUseCase: PromptUseCase,
    private val counselTechniqueUseCase: CounselTechniqueUseCase,
    private val promptVersionUseCase: PromptVersionUseCase,
    private val counselPromptDtoMapper: CounselPromptDtoMapper,
) {

    //----------------------
    // 프롬프트 버전 (PromptVersion) API
    //----------------------
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
        @ParameterObject request: @Valid FindPromptVersionsRequestDto
    ): ResponseEntity<ResponseDto.Success<FindPromptVersionsResponseDto>> {
        val findPromptVersionsRequest = counselPromptDtoMapper.toFindPromptVersionsRequest(request)
        val promptVersions = promptVersionUseCase.findPromptVersions(findPromptVersionsRequest)
        val response = counselPromptDtoMapper.toFindPromptVersionsResponseDto(promptVersions)

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
    ): ResponseEntity<ResponseDto.Success<FindPromptVersionByIdResponseDto>> {
        val findPromptVersionByIdRequest = counselPromptDtoMapper.toFindPromptVersionByIdRequest(promptVersionId)
        val promptVersion = promptVersionUseCase.findPromptVersionById(findPromptVersionByIdRequest)
        val response = counselPromptDtoMapper.toFindPromptVersionByIdResponseDto(promptVersion)

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
        @RequestBody request: @Valid UpdatePromptVersionRequestDto
    ): ResponseEntity<ResponseDto.Success<UpdatePromptVersionResponseDto>> {
        val updatePromptVersionRequest = counselPromptDtoMapper.toUpdatePromptVersionRequest(request, promptVersionId)
        val promptVersion = promptVersionUseCase.updatePromptVersion(updatePromptVersionRequest)
        val response = counselPromptDtoMapper.toUpdatePromptVersionResponseDto(promptVersion)

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
    ): ResponseEntity<ResponseDto.Success<DeletePromptVersionResponseDto?>> {
        val deletePromptVersionRequest = counselPromptDtoMapper.toDeletePromptVersionRequest(promptVersionId)
        promptVersionUseCase.deletePromptVersion(deletePromptVersionRequest)
        return ResponseDtoUtil.okResponse(null, "프롬프트 버전 삭제 성공")
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
    fun getActiveVersion(): ResponseEntity<ResponseDto.Success<FindActiveVersionResponseDto>> {
        val findActiveVersionRequest = FindActiveVersionRequest.newBuilder().build()
        val promptVersion = promptVersionUseCase.findActiveVersion(findActiveVersionRequest)
        val response = counselPromptDtoMapper.toFindActiveVersionResponseDto(promptVersion)
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
    fun getTemporaryVersion(): ResponseEntity<ResponseDto.Success<FindTemporaryVersionResponseDto>> {
        val request = FindTemporaryVersionRequest.newBuilder().build()
        val promptVersion = promptVersionUseCase.findTemporaryVersion(request)
        val response = counselPromptDtoMapper.toFindTemporaryVersionResponseDto(promptVersion)

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
    ): ResponseEntity<ResponseDto.Success<LoadExistingPromptVersionResponseDto>> {
        val request = LoadExistingPromptVersionRequest.newBuilder()
            .setPromptVersionId(promptVersionId)
            .build()
        val promptVersion = promptVersionUseCase.loadExistingPromptVersion(request)
        val response = counselPromptDtoMapper.toLoadExistingPromptVersionResponseDto(promptVersion)

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
        @RequestBody request: @Valid SaveTemporaryVersionRequestDto
    ): ResponseEntity<ResponseDto.Success<SaveTemporaryVersionResponseDto>> {
        val saveTemporaryVersionRequest = counselPromptDtoMapper.toSaveTemporaryVersionRequest(request)
        val promptVersion = promptVersionUseCase.saveTemporaryVersion(saveTemporaryVersionRequest)
        val response = counselPromptDtoMapper.toSaveTemporaryVersionResponseDto(promptVersion)

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
    ): ResponseEntity<ResponseDto.Success<ActivatePromptVersionResponseDto>> {
        val activatePromptVersionRequest = counselPromptDtoMapper.toActivatePromptVersionRequest(promptVersionId)
        val promptVersion = promptVersionUseCase.activatePromptVersion(activatePromptVersionRequest)
        val response = counselPromptDtoMapper.toActivatePromptVersionResponseDto(promptVersion)

        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 활성화 성공")
    }

    //----------------------
    // 페르소나 프롬프트 (PersonaPrompt) API
    //----------------------
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
    ): ResponseEntity<ResponseDto.Success<FindPersonaPromptByIdResponseDto>> {
        val findPersonaPromptByIdRequest = counselPromptDtoMapper.toFindPersonaPromptByIdRequest(personaPromptId)
        val personaPrompt = promptUseCase.findPersonaPromptById(findPersonaPromptByIdRequest)
        val response = counselPromptDtoMapper.toFindPersonaPromptByIdResponseDto(personaPrompt)

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
        @ParameterObject @ModelAttribute requestDto: @Valid FindPersonaPromptsRequestDto
    ): ResponseEntity<ResponseDto.Success<FindPersonaPromptsResponseDto>> {
        val request = counselPromptDtoMapper.toFindPersonaPromptsRequest(requestDto)
        val personaPrompts = promptUseCase.findPersonaPrompts(request)
        val response = counselPromptDtoMapper.toFindPersonaPromptsResponseDto(personaPrompts)

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
        @RequestBody request: @Valid UpdatePersonaPromptRequestDto
    ): ResponseEntity<ResponseDto.Success<UpdatePersonaPromptResponseDto>> {
        val updatePersonaPromptRequest = counselPromptDtoMapper.toUpdatePersonaPromptRequest(request)
        val personaPrompt = promptUseCase.updatePersonaPrompt(updatePersonaPromptRequest)
        val response = counselPromptDtoMapper.toUpdatePersonaPromptResponseDto(personaPrompt)

        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 업데이트 성공")
    }

    //----------------------
    // 톤 프롬프트 (TonePrompt) API
    //----------------------
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
    ): ResponseEntity<ResponseDto.Success<FindTonePromptByIdResponseDto>> {
        val findTonePromptByIdRequest = counselPromptDtoMapper.toFindTonePromptByIdRequest(tonePromptId)
        val tonePrompt = promptUseCase.findTonePromptById(findTonePromptByIdRequest)
        val response = counselPromptDtoMapper.toFindTonePromptByIdResponseDto(tonePrompt)

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
        @ParameterObject @ModelAttribute requestDto: @Valid FindTonePromptsRequestDto
    ): ResponseEntity<ResponseDto.Success<FindTonePromptsResponseDto>> {
        val request = counselPromptDtoMapper.toFindTonePromptsRequest(requestDto)
        val tonePrompts = promptUseCase.findTonePrompts(request)
        val response = counselPromptDtoMapper.toFindTonePromptsResponseDto(tonePrompts)

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
        @RequestBody request: @Valid UpdateTonePromptRequestDto
    ): ResponseEntity<ResponseDto.Success<UpdateTonePromptResponseDto>> {
        val updateTonePromptRequest = counselPromptDtoMapper.toUpdateTonePromptRequest(request)
        val tonePrompt = promptUseCase.updateTonePrompt(updateTonePromptRequest)
        val response = counselPromptDtoMapper.toUpdateTonePromptResponseDto(tonePrompt)

        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 업데이트 성공")
    }


    //----------------------
    // 상담 기법 (CounselTechnique) API
    //----------------------
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
    ): ResponseEntity<ResponseDto.Success<FindCounselTechniqueByIdResponseDto>> {
        val findCounselTechniqueByIdRequest =
            counselPromptDtoMapper.toFindCounselTechniqueByIdRequest(counselTechniqueId)
        val counselTechnique = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueById(findCounselTechniqueByIdRequest)
        }
        val response = counselPromptDtoMapper.toFindCounselTechniqueByIdResponseDto(counselTechnique)

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
        @ParameterObject @ModelAttribute requestDto: @Valid FindCounselTechniquesRequestDto
    ): ResponseEntity<ResponseDto.Success<FindCounselTechniquesResponseDto>> {
        val request = counselPromptDtoMapper.toFindCounselTechniquesRequest(requestDto)
        val counselTechniques = runBlocking { counselTechniqueUseCase.findCounselTechniques(request) }
        val response = counselPromptDtoMapper.toFindCounselTechniquesResponseDto(counselTechniques)

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
        @RequestBody request: @Valid CreateCounselTechniqueRequestDto
    ): ResponseEntity<ResponseDto.Success<CreateCounselTechniqueResponseDto>> {
        val createCounselTechniqueRequest = counselPromptDtoMapper.toCreateCounselTechniqueRequest(request)
        val counselTechnique = runBlocking { counselTechniqueUseCase.createCounselTechnique(createCounselTechniqueRequest) }
        val response = counselPromptDtoMapper.toCreateCounselTechniqueResponseDto(counselTechnique)

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
        @RequestBody request: @Valid UpdateCounselTechniqueRequestDto
    ): ResponseEntity<ResponseDto.Success<UpdateCounselTechniqueResponseDto>> {
        val updateCounselTechniqueRequest =
            counselPromptDtoMapper.toUpdateCounselTechniqueRequest(request, counselTechniqueId)
        val counselTechnique = runBlocking { counselTechniqueUseCase.updateCounselTechnique(updateCounselTechniqueRequest) }
        val response = counselPromptDtoMapper.toUpdateCounselTechniqueResponseDto(counselTechnique)

        return ResponseDtoUtil.okResponse(response, "상담 기법 업데이트 성공")
    }

    //----------------------
    // 상담 기법 전환 규칙 (CounselTechniqueTransitionRule) API
    //----------------------
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
    ): ResponseEntity<ResponseDto.Success<FindCounselTechniqueTransitionRuleByIdResponseDto>> {
        val findCounselTechniqueTransitionRuleByIdRequest =
            counselPromptDtoMapper.toFindTransitionRuleByIdRequest(counselTechniqueTransitionRuleId)
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueTransitionRuleById(
                findCounselTechniqueTransitionRuleByIdRequest
            )
        }
        val response = counselPromptDtoMapper.toFindTransitionRuleByIdResponseDto(counselTechniqueTransitionRule)

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
        @ParameterObject @ModelAttribute requestDto: @Valid FindCounselTechniqueTransitionRulesRequestDto
    ): ResponseEntity<ResponseDto.Success<FindCounselTechniqueTransitionRulesResponseDto>> {
        val request = counselPromptDtoMapper.toFindTransitionRulesRequest(requestDto)
        val counselTechniqueTransitionRules = runBlocking {
            counselTechniqueUseCase.findCounselTechniqueTransitionRules(request)
        }
        val response = counselPromptDtoMapper.toFindTransitionRulesResponseDto(counselTechniqueTransitionRules)

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
        @RequestBody request: @Valid CreateCounselTechniqueTransitionRuleRequestDto
    ): ResponseEntity<ResponseDto.Success<CreateCounselTechniqueTransitionRuleResponseDto>> {
        val createCounselTechniqueTransitionRuleRequest = counselPromptDtoMapper.toCreateTransitionRuleRequest(request)
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.createCounselTechniqueTransitionRule(createCounselTechniqueTransitionRuleRequest)
        }
        val response = counselPromptDtoMapper.toCreateTransitionRuleResponse(counselTechniqueTransitionRule)

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
        @RequestBody request: @Valid UpdateCounselTechniqueTransitionRuleRequestDto
    ): ResponseEntity<ResponseDto.Success<UpdateCounselTechniqueTransitionRuleResponseDto>> {
        val updateCounselTechniqueTransitionRuleRequest =
            counselPromptDtoMapper.toUpdateTransitionRuleRequest(request, counselTechniqueTransitionRuleId)
        val counselTechniqueTransitionRule = runBlocking {
            counselTechniqueUseCase.updateCounselTechniqueTransitionRule(updateCounselTechniqueTransitionRuleRequest)
        }
        val response = counselPromptDtoMapper.toUpdateTransitionRuleResponse(counselTechniqueTransitionRule)

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
    ): ResponseEntity<ResponseDto.Success<DeleteCounselTechniqueTransitionRuleResponseDto?>> {
        val deleteCounselTechniqueTransitionRuleRequest =
            counselPromptDtoMapper.toDeleteTransitionRuleRequest(counselTechniqueTransitionRuleId)
        runBlocking { counselTechniqueUseCase.deleteCounselTechniqueTransitionRule(deleteCounselTechniqueTransitionRuleRequest) }
        return ResponseDtoUtil.okResponse(null, "프롬프트 버전 삭제 성공")
    }


    //----------------------
    // 프롬프트 활성화 히스토리 (PromptActivateHistory) API
    //----------------------
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
    ): ResponseEntity<ResponseDto.Success<FindPromptActivateHistoriesResponseDto>> {
        val findPromptActivateHistoriesRequest =
            counselPromptDtoMapper.toFindPromptActivateHistoriesRequest(promptVersionId)
        val promptActivateHistories =
            promptVersionUseCase.findPromptActivateHistories(findPromptActivateHistoriesRequest)
        val response = counselPromptDtoMapper.toFindPromptActivateHistoriesResponseDto(promptActivateHistories)

        return ResponseDtoUtil.okResponse(response, "프롬프트 활성화 히스토리 목록 조회 성공")
    }
}