package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.*;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.CounselorScopedPrompt;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.model.ToneScopedPrompt;
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionsRequest;
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest;
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselPromptDtoMapper {
    
    // PromptVersion 관련 매핑

    @Mappings({
            @Mapping(source = "counselorScopedPromptsList", target = "counselorScopedPrompts"),
            @Mapping(source = "toneScopedPromptsList", target = "toneScopedPrompts")
    })
    CounselPromptDto.PromptVersionResponseDto of(PromptVersion promptVersion);
    CounselPromptDto.CounselorScopedPromptResponseDto of(CounselorScopedPrompt counselorScopedPrompt);
    CounselPromptDto.ToneScopedPromptResponseDto of(ToneScopedPrompt toneScopedPrompt);


    // PersonaPrompt 관련 매핑
    CounselPromptDto.PersonaPromptResponseDto of(PersonaPrompt personaPrompt);
    
    // TonePrompt 관련 매핑
    CounselPromptDto.TonePromptResponseDto of(TonePrompt tonePrompt);
    
    // CounselTechnique 관련 매핑
    CounselPromptDto.CounselTechniqueResponseDto of(CounselTechnique counselTechnique);
    
    // PromptActivateHistory 관련 매핑
    CounselPromptDto.PromptActivateHistoryResponseDto of(PromptActivateHistory promptActivateHistory);
    
    // 요청 DTO 변환 메소드
    default FindPromptVersionsRequest toFindPromptVersionsRequest(CounselPromptDto.FindPromptVersionsRequestDto dto) {
        FindPromptVersionsRequest.Builder builder = FindPromptVersionsRequest.newBuilder();
        if (dto.getName() != null) {
            builder.setName(dto.getName());
        }
        return builder.build();
    }
    
    SaveTemporaryVersionRequest toSaveTemporaryVersionRequest(CounselPromptDto.SaveTemporaryVersionRequestDto dto);

    UpdateTonePromptRequest toUpdateTonePromptRequest(CounselPromptDto.UpdateTonePromptRequestDto dto);
    
    UpdatePersonaPromptRequest toUpdatePersonaPromptRequest(CounselPromptDto.UpdatePersonaPromptRequestDto dto);
    
    CreateCounselTechniqueRequest toCreateCounselTechniqueRequest(CounselPromptDto.CreateCounselTechniqueRequestDto dto);
    
    UpdateCounselTechniqueRequest toUpdateCounselTechniqueRequest(CounselPromptDto.UpdateCounselTechniqueRequestDto dto, String counselTechniqueId);
    
    SaveCounselTechniqueSequenceRequest toSaveCounselTechniqueSequenceRequest(CounselPromptDto.SaveCounselTechniqueSequenceRequestDto dto);
    
    FindPromptVersionByIdRequest toFindPromptVersionByIdRequest(String promptVersionId);
    
    ActivatePromptVersionRequest toActivatePromptVersionRequest(String promptVersionId);
    
    FindPersonaPromptByIdRequest toFindPersonaPromptByIdRequest(String personaPromptId);
    
    FindTonePromptByIdRequest toFindTonePromptByIdRequest(String tonePromptId);
    
    FindCounselTechniqueByIdRequest toFindCounselTechniqueByIdRequest(String counselTechniqueId);

    FindOrderedCounselTechniquesRequest toFindOrderedCounselTechniquesRequest(String firstCounselTechniqueId);
    
    FindPromptActivateHistoriesRequest toFindPromptActivateHistoriesRequest(String promptVersionId);
    
    // 응답 DTO 변환 메소드
    default CounselPromptDto.FindPromptVersionsResponseDto toFindPromptVersionsResponseDto(List<PromptVersion> promptVersions) {
        return CounselPromptDto.FindPromptVersionsResponseDto.builder()
                .promptVersions(promptVersions.stream().map(this::of).collect(Collectors.toList())).build();
    }
    
    default CounselPromptDto.FindPromptVersionByIdResponseDto toFindPromptVersionByIdResponseDto(PromptVersion promptVersion) {
        return CounselPromptDto.FindPromptVersionByIdResponseDto.builder()
                .promptVersion(of(promptVersion))
                .build();
    }

    CounselPromptDto.FindActiveVersionResponseDto toFindActiveVersionResponseDto(PromptVersion promptVersion);


    default CounselPromptDto.FindTemporaryVersionResponseDto toFindTemporaryVersionResponseDto(PromptVersion promptVersion) {
        return CounselPromptDto.FindTemporaryVersionResponseDto.builder()
                .promptVersion(of(promptVersion))
                .build();
    }
    
    default CounselPromptDto.LoadExistingPromptVersionResponseDto toLoadExistingPromptVersionResponseDto(PromptVersion promptVersion) {
        return CounselPromptDto.LoadExistingPromptVersionResponseDto.builder()
                .promptVersion(of(promptVersion))
                .build();
    }
    
    default CounselPromptDto.SaveTemporaryVersionResponseDto toSaveTemporaryVersionResponseDto(PromptVersion promptVersion) {
        return CounselPromptDto.SaveTemporaryVersionResponseDto.builder()
                .promptVersion(of(promptVersion))
                .build();
    }
    
    default CounselPromptDto.ActivatePromptVersionResponseDto toActivatePromptVersionResponseDto(PromptVersion promptVersion) {
        return CounselPromptDto.ActivatePromptVersionResponseDto.builder()
                .promptVersion(of(promptVersion))
                .build();
    }
    
    default CounselPromptDto.FindPersonaPromptByIdResponseDto toFindPersonaPromptByIdResponseDto(PersonaPrompt personaPrompt) {
        return CounselPromptDto.FindPersonaPromptByIdResponseDto.builder()
                .personaPrompt(of(personaPrompt))
                .build();
    }
    
    default CounselPromptDto.UpdatePersonaPromptResponseDto toUpdatePersonaPromptResponseDto(PersonaPrompt personaPrompt) {
        return CounselPromptDto.UpdatePersonaPromptResponseDto.builder()
                .personaPrompt(of(personaPrompt))
                .build();
    }
    
    default CounselPromptDto.FindTonePromptByIdResponseDto toFindTonePromptByIdResponseDto(TonePrompt tonePrompt) {
        return CounselPromptDto.FindTonePromptByIdResponseDto.builder()
                .tonePrompt(of(tonePrompt))
                .build();
    }
    
    default CounselPromptDto.UpdateTonePromptResponseDto toUpdateTonePromptResponseDto(TonePrompt tonePrompt) {
        return CounselPromptDto.UpdateTonePromptResponseDto.builder()
                .tonePrompt(of(tonePrompt))
                .build();
    }
    
    default CounselPromptDto.CreateCounselTechniqueResponseDto toCreateCounselTechniqueResponseDto(CounselTechnique counselTechnique) {
        return CounselPromptDto.CreateCounselTechniqueResponseDto.builder()
                .counselTechnique(of(counselTechnique))
                .build();
    }
    
    default CounselPromptDto.FindOrderedCounselTechniquesResponseDto toFindOrderedCounselTechniquesResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.FindOrderedCounselTechniquesResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.FindCounselTechniqueByIdResponseDto toFindCounselTechniqueByIdResponseDto(CounselTechnique counselTechnique) {
        return CounselPromptDto.FindCounselTechniqueByIdResponseDto.builder()
                .counselTechnique(of(counselTechnique))
                .build();
    }
    
    default CounselPromptDto.UpdateCounselTechniqueResponseDto toUpdateCounselTechniqueResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.UpdateCounselTechniqueResponseDto.builder()
                .counselTechnique(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.SaveCounselTechniqueSequenceResponseDto toSaveCounselTechniqueSequenceResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.SaveCounselTechniqueSequenceResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.FindPromptActivateHistoriesResponseDto toFindPromptActivateHistoriesResponseDto(List<PromptActivateHistory> promptActivateHistories) {
        return CounselPromptDto.FindPromptActivateHistoriesResponseDto.builder()
                .promptActivateHistories(promptActivateHistories.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
}