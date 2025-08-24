package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;
import java.util.stream.Collectors;

import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselPromptDtoMapper {
    /*
    프롬프트 버전
     */
    CounselPromptDto.PromptVersionResponseDto of(PromptVersion promptVersion);
    UpdatePromptVersionRequest toUpdatePromptVersionRequest(CounselPromptDto.UpdatePromptVersionRequestDto dto, String promptVersionId);
    CounselPromptDto.UpdatePromptVersionResponseDto toUpdatePromptVersionResponseDto(PromptVersion promptVersion);
    SaveTemporaryVersionRequest toSaveTemporaryVersionRequest(CounselPromptDto.SaveTemporaryVersionRequestDto dto);
    CounselPromptDto.SaveTemporaryVersionResponseDto toSaveTemporaryVersionResponseDto(PromptVersion promptVersion);
    ActivatePromptVersionRequest toActivatePromptVersionRequest(String promptVersionId);
    CounselPromptDto.ActivatePromptVersionResponseDto toActivatePromptVersionResponseDto(PromptVersion promptVersion);
    CounselPromptDto.LoadExistingPromptVersionResponseDto toLoadExistingPromptVersionResponseDto(PromptVersion promptVersion);
    default DeletePromptVersionsRequest toDeletePromptVersionRequest(String promptVersionId) {
        return DeletePromptVersionsRequest.newBuilder()
                .addPromptVersionIds(promptVersionId)
                .build();
    }
    CounselPromptDto.DeletePromptVersionResponseDto toDeletePromptVersionResponseDto(Boolean isSuccess);
    FindPromptVersionByIdRequest toFindPromptVersionByIdRequest(String promptVersionId);
    CounselPromptDto.FindPromptVersionByIdResponseDto toFindPromptVersionByIdResponseDto(PromptVersion promptVersion);
    FindPromptVersionsRequest toFindPromptVersionsRequest(CounselPromptDto.FindPromptVersionsRequestDto dto);
    default CounselPromptDto.FindPromptVersionsResponseDto toFindPromptVersionsResponseDto(List<PromptVersion> promptVersions) {
        return CounselPromptDto.FindPromptVersionsResponseDto.builder()
                .promptVersions(promptVersions.stream().map(this::of).collect(Collectors.toList())).build();
    }
    CounselPromptDto.FindActiveVersionResponseDto toFindActiveVersionResponseDto(PromptVersion promptVersion);
    CounselPromptDto.FindTemporaryVersionResponseDto toFindTemporaryVersionResponseDto(PromptVersion promptVersion);

    /*
    상담 기법
     */
    CounselPromptDto.CounselTechniqueResponseDto of(CounselTechnique counselTechnique);
    CreateCounselTechniqueRequest toCreateCounselTechniqueRequest(CounselPromptDto.CreateCounselTechniqueRequestDto dto);
    CounselPromptDto.CreateCounselTechniqueResponseDto toCreateCounselTechniqueResponseDto(CounselTechnique counselTechnique);
    UpdateCounselTechniqueRequest toUpdateCounselTechniqueRequest(CounselPromptDto.UpdateCounselTechniqueRequestDto dto, String counselTechniqueId);
    CounselPromptDto.UpdateCounselTechniqueResponseDto toUpdateCounselTechniqueResponseDto(CounselTechnique counselTechnique);
    FindCounselTechniqueByIdRequest toFindCounselTechniqueByIdRequest(String counselTechniqueId);
    CounselPromptDto.FindCounselTechniqueByIdResponseDto toFindCounselTechniqueByIdResponseDto(CounselTechnique counselTechnique);
    FindCounselTechniquesRequest toFindCounselTechniquesRequest(CounselPromptDto.FindCounselTechniquesRequestDto dto);
    default CounselPromptDto.FindCounselTechniquesResponseDto toFindCounselTechniquesResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.FindCounselTechniquesResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }






    /*
    페르소나 프롬프트
     */
    CounselPromptDto.PersonaPromptResponseDto of(PersonaPrompt personaPrompt);
    UpdatePersonaPromptRequest toUpdatePersonaPromptRequest(CounselPromptDto.UpdatePersonaPromptRequestDto dto);
    CounselPromptDto.UpdatePersonaPromptResponseDto toUpdatePersonaPromptResponseDto(PersonaPrompt personaPrompt);
    FindPersonaPromptByIdRequest toFindPersonaPromptByIdRequest(String personaPromptId);
    CounselPromptDto.FindPersonaPromptByIdResponseDto toFindPersonaPromptByIdResponseDto(PersonaPrompt personaPrompt);
    FindPersonaPromptsRequest toFindPersonaPromptsRequest(CounselPromptDto.FindPersonaPromptsRequestDto dto);
    default CounselPromptDto.FindPersonaPromptsResponseDto toFindPersonaPromptsResponseDto(List<PersonaPrompt> personaPrompts) {
        return CounselPromptDto.FindPersonaPromptsResponseDto.builder()
                .personaPrompts(personaPrompts.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }



    /*
    톤 프롬프트
     */
    CounselPromptDto.TonePromptResponseDto of(TonePrompt tonePrompt);
    UpdateTonePromptRequest toUpdateTonePromptRequest(CounselPromptDto.UpdateTonePromptRequestDto dto);
    CounselPromptDto.UpdateTonePromptResponseDto toUpdateTonePromptResponseDto(TonePrompt tonePrompt);
    FindTonePromptByIdRequest toFindTonePromptByIdRequest(String tonePromptId);
    CounselPromptDto.FindTonePromptByIdResponseDto toFindTonePromptByIdResponseDto(TonePrompt tonePrompt);
    FindTonePromptsRequest toFindTonePromptsRequest(CounselPromptDto.FindTonePromptsRequestDto dto);
    default CounselPromptDto.FindTonePromptsResponseDto toFindTonePromptsResponseDto(List<TonePrompt> tonePrompts) {
        return CounselPromptDto.FindTonePromptsResponseDto.builder()
                .tonePrompts(tonePrompts.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }

    /*
    상담 기법 전환 규칙
     */
    CounselPromptDto.CounselTechniqueTransitionRuleResponseDto of(CounselTechniqueTransitionRule counselTechniqueTransitionRule);
    CreateCounselTechniqueTransitionRuleRequest toCreateTransitionRuleRequest(CounselPromptDto.CreateCounselTechniqueTransitionRuleRequestDto dto);
    CounselPromptDto.CreateCounselTechniqueTransitionRuleResponseDto toCreateTransitionRuleResponse(CounselTechniqueTransitionRule counselTechniqueTransitionRule);
    UpdateCounselTechniqueTransitionRuleRequest toUpdateTransitionRuleRequest(CounselPromptDto.UpdateCounselTechniqueTransitionRuleRequestDto dto, String counselTechniqueTransitionRuleId);
    CounselPromptDto.UpdateCounselTechniqueTransitionRuleResponseDto toUpdateTransitionRuleResponse(CounselTechniqueTransitionRule counselTechniqueTransitionRule);
    DeleteCounselTechniqueTransitionRuleRequest toDeleteTransitionRuleRequest(String counselTechniqueTransitionRuleId);
    FindCounselTechniqueTransitionRuleByIdRequest toFindTransitionRuleByIdRequest(String counselTechniqueTransitionRuleId);
    CounselPromptDto.FindCounselTechniqueTransitionRuleByIdResponseDto toFindTransitionRuleByIdResponseDto(CounselTechniqueTransitionRule counselTechniqueTransitionRule);
    FindCounselTechniqueTransitionRulesRequest toFindTransitionRulesRequest(CounselPromptDto.FindCounselTechniqueTransitionRulesRequestDto dto);
    default CounselPromptDto.FindCounselTechniqueTransitionRulesResponseDto toFindTransitionRulesResponseDto(List<CounselTechniqueTransitionRule> counselTechniqueTransitionRules) {
        return CounselPromptDto.FindCounselTechniqueTransitionRulesResponseDto.builder()
                .counselTechniqueTransitionRules(counselTechniqueTransitionRules.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }

    /*
    상담 활성화 히스토리
     */
    CounselPromptDto.PromptActivateHistoryResponseDto of(PromptActivateHistory promptActivateHistory);
    FindPromptActivateHistoriesRequest toFindPromptActivateHistoriesRequest(String promptVersionId);
    default CounselPromptDto.FindPromptActivateHistoriesResponseDto toFindPromptActivateHistoriesResponseDto(List<PromptActivateHistory> promptActivateHistories) {
        return CounselPromptDto.FindPromptActivateHistoriesResponseDto.builder()
                .promptActivateHistories(promptActivateHistories.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
}