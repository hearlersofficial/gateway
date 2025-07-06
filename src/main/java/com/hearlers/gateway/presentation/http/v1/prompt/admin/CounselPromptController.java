package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest;
import com.hearlers.gateway.application.prompt.CounselPromptService;
import com.hearlers.gateway.shared.response.ResponseDto;
import com.hearlers.gateway.shared.response.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController("v1CounselPromptAdminController")
@RequestMapping("/v1/admin")
@RequiredArgsConstructor
@Tag(name = "어드민/상담 프롬프트", description = "상담 프롬프트 관련 API")
public class CounselPromptController {
    private final CounselPromptService counselPromptService;
    CounselPromptDtoMapper counselPromptDtoMapper = Mappers.getMapper(CounselPromptDtoMapper.class);
    //----------------------
    // 프롬프트 버전 (PromptVersion) API
    //----------------------
    
    @Operation(summary = "프롬프트 버전 목록 조회", description = "프롬프트 버전 목록을 조회합니다. 옵션으로 이름 검색이 가능합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "프롬프트 버전 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "프롬프트 버전 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/prompt-versions")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindPromptVersionsResponseDto>> getPromptVersions(
            @Valid @ParameterObject CounselPromptDto.FindPromptVersionsRequestDto request) {
        var findPromptVersionsRequest = counselPromptDtoMapper.toFindPromptVersionsRequest(request);
        List<PromptVersion> promptVersions = counselPromptService.findPromptVersions(findPromptVersionsRequest);
        var response = counselPromptDtoMapper.toFindPromptVersionsResponseDto(promptVersions);
        
        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 목록 조회 성공");
    }

    @Operation(summary = "프롬프트 버전 조회", description = "ID로 특정 프롬프트 버전을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "프롬프트 버전 조회 성공"),
            @ApiResponse(responseCode = "400", description = "프롬프트 버전 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "프롬프트 버전을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/prompt-versions/{prompt-version-id}")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindPromptVersionByIdResponseDto>> getPromptVersionById(
            @PathVariable(name = "prompt-version-id", required = true) String promptVersionId) {
        var findPromptVersionByIdRequest = counselPromptDtoMapper.toFindPromptVersionByIdRequest(promptVersionId);
        PromptVersion promptVersion = counselPromptService.findPromptVersionById(findPromptVersionByIdRequest);
        var response = counselPromptDtoMapper.toFindPromptVersionByIdResponseDto(promptVersion);
        
        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 조회 성공");
    }
    


    @Operation(summary = "현재 활성화된 프롬프트 버전 조회 (TBD)", 
               description = """
               현재 활성화된 프롬프트 버전을 조회합니다. 활성화된 버전은 수정이 불가능 합니다.
               """
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "활성화된 프롬프트 버전 조회 성공"),
            @ApiResponse(responseCode = "400", description = "활성화된 프롬프트 버전 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/prompt-versions/active-version")
    public ResponseEntity<ResponseDto.Success<Void>> getActiveVersion() {
        // TODO: 활성화된 프롬프트 버전 조회
        return ResponseDtoUtil.okResponse(null, "활성화된 프롬프트 버전 조회 성공");
    }
    

    @Operation(summary = "현재 수정 중인 임시 프롬프트 버전 조회", 
               description = """
               현재 수정 중인 임시 프롬프트 버전을 조회합니다.\n
               2025.04.17 기준 피그마 상 보이는 모든 뷰는 이 API를 통하면 됩니다. \n
               추후 토글을 통해 임시 버전과 활성화 버전을 왔다갈 수 있게 해야 좋을 듯 합니다. \n
               임시 버전이 비게 되면, 임시 버전 라이프사이클에 의해 새로운 임시 버전이 자동 생성됩니다. 즉 오직 1개의 임시 버전이 항상 존재합니다.
               """
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "임시 프롬프트 버전 조회 성공"),
            @ApiResponse(responseCode = "400", description = "임시 프롬프트 버전 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/prompt-versions/temporary-version")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindTemporaryVersionResponseDto>> getTemporaryVersion() {
        PromptVersion promptVersion = counselPromptService.findTemporaryVersion(null);
        var response = counselPromptDtoMapper.toFindTemporaryVersionResponseDto(promptVersion);
        
        return ResponseDtoUtil.okResponse(response, "임시 프롬프트 버전 조회 성공");
    }
    
    @Operation(summary = "임시 버전에 기존 프롬프트 버전 로드", 
               description = "저장된 버전을 임시 버전으로 복사합니다. 기존 수정 중이던 임시 버전을 덮어씁니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "기존 프롬프트 버전 로드 성공"),
            @ApiResponse(responseCode = "400", description = "기존 프롬프트 버전 로드 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "프롬프트 버전을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/prompt-versions/temporary-version/{prompt-version-id}")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.LoadExistingPromptVersionResponseDto>> loadPromptVersion(
            @PathVariable(name = "prompt-version-id", required = true) String promptVersionId) {
        LoadExistingPromptVersionRequest request = LoadExistingPromptVersionRequest.newBuilder()
                .setPromptVersionId(promptVersionId)
                .build();
        PromptVersion promptVersion = counselPromptService.loadExistingPromptVersion(request);
        var response = counselPromptDtoMapper.toLoadExistingPromptVersionResponseDto(promptVersion);
        
        return ResponseDtoUtil.okResponse(response, "기존 프롬프트 버전 로드 성공");
    }
    
    @Operation(summary = "임시 프롬프트 버전에 이름과 설명을 지정하고 영구 상태로 변경하여 저장", 
               description = """
               현재 수정 중인 임시 프롬프트 버전을 영구 저장합니다. 이름과 설명을 지정하여 임시 상태(isTemporary=true)에서 정식 버전(isTemporary=false)으로 전환됩니다. 
               저장을 통해 임시 버전이 비게 되면, 임시 버전 라이프사이클에 의해 새로운 임시 버전이 자동 생성됩니다.
               """
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "임시 버전 저장 성공"),
            @ApiResponse(responseCode = "400", description = "임시 버전 저장 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/prompt-versions/temporary-version")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.SaveTemporaryVersionResponseDto>> saveVersion(
            @Valid @RequestBody CounselPromptDto.SaveTemporaryVersionRequestDto request) {
        var saveTemporaryVersionRequest = counselPromptDtoMapper.toSaveTemporaryVersionRequest(request);
        PromptVersion promptVersion = counselPromptService.saveTemporaryVersion(saveTemporaryVersionRequest);
        var response = counselPromptDtoMapper.toSaveTemporaryVersionResponseDto(promptVersion);
        
        return ResponseDtoUtil.okResponse(response, "임시 버전 저장 성공");
    }
    
    @Operation(summary = "프롬프트 버전 활성화", 
               description = "저장된 버전을 활성화합니다(서비스에 반영). 이후 생성되는 상담들부터 해당 버전이 적용되며, 기존 상담들에는 영향이 없습니다. 임시버전은 활성화할 수 없습니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "프롬프트 버전 활성화 성공"),
            @ApiResponse(responseCode = "400", description = "프롬프트 버전 활성화 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "프롬프트 버전을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/prompt-versions/{prompt-version-id}/activate")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.ActivatePromptVersionResponseDto>> activatePromptVersion(
            @PathVariable(name = "prompt-version-id", required = true) String promptVersionId) {
        var activatePromptVersionRequest = counselPromptDtoMapper.toActivatePromptVersionRequest(promptVersionId);
        PromptVersion promptVersion = counselPromptService.activatePromptVersion(activatePromptVersionRequest);
        var response = counselPromptDtoMapper.toActivatePromptVersionResponseDto(promptVersion);
        
        return ResponseDtoUtil.okResponse(response, "프롬프트 버전 활성화 성공");
    }

    //----------------------
    // 페르소나 프롬프트 (PersonaPrompt) API
    //----------------------
    
    @Operation(summary = "페르소나 프롬프트 조회", 
               description = "ID로 페르소나 프롬프트를 조회합니다. 페르소나 프롬프트는 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "페르소나 프롬프트 조회 성공"),
            @ApiResponse(responseCode = "400", description = "페르소나 프롬프트 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "페르소나 프롬프트를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/persona-prompts/{persona-prompt-id}")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindPersonaPromptByIdResponseDto>> getPersonaPromptById(
            @PathVariable(name = "persona-prompt-id", required = true) String personaPromptId) {
        var findPersonaPromptByIdRequest = counselPromptDtoMapper.toFindPersonaPromptByIdRequest(personaPromptId);
        PersonaPrompt personaPrompt = counselPromptService.findPersonaPromptById(findPersonaPromptByIdRequest);
        var response = counselPromptDtoMapper.toFindPersonaPromptByIdResponseDto(personaPrompt);
        
        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 조회 성공");
    }
    
    @Operation(summary = "임시 버전에서 페르소나 프롬프트 업데이트", 
               description = "임시 버전에서 페르소나 프롬프트를 업데이트합니다. 카운셀러 ID와 본문을 지정할 수 있습니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "페르소나 프롬프트 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "페르소나 프롬프트 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/prompt-versions/temporary-version/persona-prompts")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.UpdatePersonaPromptResponseDto>> updatePersonaPrompt(
            @Valid @RequestBody CounselPromptDto.UpdatePersonaPromptRequestDto request) {
        var updatePersonaPromptRequest = counselPromptDtoMapper.toUpdatePersonaPromptRequest(request);
        PersonaPrompt personaPrompt = counselPromptService.updatePersonaPrompt(updatePersonaPromptRequest);
        var response = counselPromptDtoMapper.toUpdatePersonaPromptResponseDto(personaPrompt);
        
        return ResponseDtoUtil.okResponse(response, "페르소나 프롬프트 업데이트 성공");
    }
    
    //----------------------
    // 톤 프롬프트 (TonePrompt) API
    //----------------------
    
    @Operation(summary = "톤 프롬프트 조회", 
               description = "ID로 톤 프롬프트를 조회합니다. 톤 프롬프트는 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 프롬프트 조회 성공"),
            @ApiResponse(responseCode = "400", description = "톤 프롬프트 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "톤 프롬프트를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/tone-prompts/{tone-prompt-id}")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindTonePromptByIdResponseDto>> getTonePromptById(
            @PathVariable(name = "tone-prompt-id", required = true) String tonePromptId) {
        var findTonePromptByIdRequest = counselPromptDtoMapper.toFindTonePromptByIdRequest(tonePromptId);
        TonePrompt tonePrompt = counselPromptService.findTonePromptById(findTonePromptByIdRequest);
        var response = counselPromptDtoMapper.toFindTonePromptByIdResponseDto(tonePrompt);
        
        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 조회 성공");
    }
    
    @Operation(summary = "임시 버전에서 톤 프롬프트 업데이트", 
               description = "임시 버전에서 톤 프롬프트를 업데이트합니다. 톤 ID와 본문을 지정할 수 있습니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 프롬프트 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "톤 프롬프트 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/prompt-versions/temporary-version/tone-prompts")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.UpdateTonePromptResponseDto>> updateTonePrompt(
            @Valid @RequestBody CounselPromptDto.UpdateTonePromptRequestDto request) {
        var updateTonePromptRequest = counselPromptDtoMapper.toUpdateTonePromptRequest(request);
        TonePrompt tonePrompt = counselPromptService.updateTonePrompt(updateTonePromptRequest);
        var response = counselPromptDtoMapper.toUpdateTonePromptResponseDto(tonePrompt);
        
        return ResponseDtoUtil.okResponse(response, "톤 프롬프트 업데이트 성공");
    }
    
    //----------------------
    // 상담 기법 (CounselTechnique) API
    //----------------------
    
    @Operation(summary = "상담 기법 조회", 
               description = "ID로 상담 기법을 조회합니다. 상담 기법은 불변객체이며, 수정 시 새로운 객체가 생성됩니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 기법 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담 기법 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "상담 기법을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/counsel-techniques/{counsel-technique-id}")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindCounselTechniqueByIdResponseDto>> getCounselTechniqueById(
            @PathVariable(name = "counsel-technique-id") String counselTechniqueId) {
        var findCounselTechniqueByIdRequest = counselPromptDtoMapper.toFindCounselTechniqueByIdRequest(counselTechniqueId);
        CounselTechnique counselTechnique = counselPromptService.findCounselTechniqueById(findCounselTechniqueByIdRequest);
        var response = counselPromptDtoMapper.toFindCounselTechniqueByIdResponseDto(counselTechnique);
        
        return ResponseDtoUtil.okResponse(response, "상담 기법 조회 성공");
    }
    
    @Operation(
        summary = "상담 기법 전체 조회 || 첫 번째 상담 기법 ID를 통해 연결된 모든 상담 기법 목록 조회", 
        description = """
            상담 기법을 전체 조회하거나, 첫 번째 상담 기법 ID를 통해 연결된 모든 상담 기법 목록을 조회합니다.
            first-counsel-technique-id 파라미터가 없으면 전체 조회, 있으면 해당 ID로 시작하는 연결된 기법들을 순서대로 반환합니다.
            **현재 전체 조회는 구현되지 않았습니다. 이에 따라 쿼리 파라미터가 필수입니다.
            """
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 기법 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담 기법 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/counsel-techniques")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindOrderedCounselTechniquesResponseDto>> getOrderedCounselTechniques(
            @RequestParam(required = true, name = "first-counsel-technique-id") String firstCounselTechniqueId) {
        var findOrderedCounselTechniquesRequest = counselPromptDtoMapper.toFindOrderedCounselTechniquesRequest(firstCounselTechniqueId);
        List<CounselTechnique> counselTechniques = counselPromptService.findOrderedCounselTechniques(findOrderedCounselTechniquesRequest);
        var response = counselPromptDtoMapper.toFindOrderedCounselTechniquesResponseDto(counselTechniques);
        
        return ResponseDtoUtil.okResponse(response, "상담 기법 목록 조회 성공");
    }

    @Operation(summary = "임시 버전에 새로운 상담 기법 생성", 
               description = "새로운 상담 기법을 임시기법으로 생성합니다. 임시기법은 다른 기법들과 링크되지 않으며, 추후 순서 지정이 필요합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "상담 기법 생성 성공"),
            @ApiResponse(responseCode = "400", description = "상담 기법 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/prompt-versions/temporary-version/counsel-techniques")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.CreateCounselTechniqueResponseDto>> createCounselTechnique(
            @Valid @RequestBody CounselPromptDto.CreateCounselTechniqueRequestDto request) {
        var createCounselTechniqueRequest = counselPromptDtoMapper.toCreateCounselTechniqueRequest(request);
        CounselTechnique counselTechnique = counselPromptService.createCounselTechnique(createCounselTechniqueRequest);
        var response = counselPromptDtoMapper.toCreateCounselTechniqueResponseDto(counselTechnique);
        
        return ResponseDtoUtil.createdResponse(response, "상담 기법 생성 성공");
    }

    @Operation(summary = "임시 버전에서 상담 기법 업데이트", 
               description = "임시 버전에서 기존 상담 기법을 업데이트합니다. 아직 링크되지 않은 임시기법은 수정할 수 없습니다. 수정 후 해당 기법이 포함된 기법리스트가 반환됩니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 기법 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "상담 기법 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "상담 기법을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/prompt-versions/temporary-version/counsel-techniques/{counsel-technique-id}") 
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.UpdateCounselTechniqueResponseDto>> updateCounselTechnique(
            @PathVariable(name = "counsel-technique-id", required = true) String counselTechniqueId,
            @Valid @RequestBody CounselPromptDto.UpdateCounselTechniqueRequestDto request) {
        var updateCounselTechniqueRequest = counselPromptDtoMapper.toUpdateCounselTechniqueRequest(request, counselTechniqueId);
        CounselTechnique counselTechnique = counselPromptService.updateCounselTechnique(updateCounselTechniqueRequest);
        var response = counselPromptDtoMapper.toUpdateCounselTechniqueResponseDto(counselTechnique);
        
        return ResponseDtoUtil.okResponse(response, "상담 기법 업데이트 성공");
    }
    
    @Operation(summary = "임시 버전에서 상담 기법 시퀀스 저장", 
               description = "임시 버전에서 상담 기법 시퀀스를 저장합니다. 기존 기법 및 임시기법들을 연결하고, 연결된 최종 기법 리스트를 반환합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 기법 시퀀스 저장 성공"),
            @ApiResponse(responseCode = "400", description = "상담 기법 시퀀스 저장 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/prompt-versions/temporary-version/counsel-techniques/all/sequences")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.SaveCounselTechniqueSequenceResponseDto>> saveCounselTechniqueSequence(
            @Valid @RequestBody CounselPromptDto.SaveCounselTechniqueSequenceRequestDto request) {
        var saveCounselTechniqueSequenceRequest = counselPromptDtoMapper.toSaveCounselTechniqueSequenceRequest(request);
        List<CounselTechnique> counselTechniques = counselPromptService.saveCounselTechniqueSequence(saveCounselTechniqueSequenceRequest);
        var response = counselPromptDtoMapper.toSaveCounselTechniqueSequenceResponseDto(counselTechniques);
        
        return ResponseDtoUtil.okResponse(response, "상담 기법 시퀀스 저장 성공");
    }
    
    //----------------------
    // 프롬프트 활성화 히스토리 (PromptActivateHistory) API
    //----------------------
    
    @Operation(summary = "프롬프트 활성화 히스토리 목록 조회", 
               description = "프롬프트 활성화 히스토리 목록을 조회합니다. 특정 버전 ID로 필터링할 수 있습니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "프롬프트 활성화 히스토리 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "프롬프트 활성화 히스토리 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/prompt-activate-histories")
    public ResponseEntity<ResponseDto.Success<CounselPromptDto.FindPromptActivateHistoriesResponseDto>> getPromptActivateHistories(
            @RequestParam(required = false, name = "prompt-version-id") String promptVersionId) {
        var findPromptActivateHistoriesRequest = counselPromptDtoMapper.toFindPromptActivateHistoriesRequest(promptVersionId);
        List<PromptActivateHistory> promptActivateHistories = counselPromptService.findPromptActivateHistories(findPromptActivateHistoriesRequest);
        var response = counselPromptDtoMapper.toFindPromptActivateHistoriesResponseDto(promptActivateHistories);
        
        return ResponseDtoUtil.okResponse(response, "프롬프트 활성화 히스토리 목록 조회 성공");
    }
}
