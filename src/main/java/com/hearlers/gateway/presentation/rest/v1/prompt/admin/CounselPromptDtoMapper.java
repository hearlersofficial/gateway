package com.hearlers.gateway.presentation.rest.v1.prompt.admin;

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
    
    default SaveTemporaryVersionRequest toSaveTemporaryVersionRequest(CounselPromptDto.SaveTemporaryVersionRequestDto dto) {
        return SaveTemporaryVersionRequest.newBuilder()
                .setName(dto.getName())
                .setDescription(dto.getDescription())
                .build();
    }
    
    default UpdateTonePromptRequest toUpdateTonePromptRequest(CounselPromptDto.UpdateTonePromptRequestDto dto) {
        return UpdateTonePromptRequest.newBuilder()
                .setToneId(dto.getToneId())
                .setBody(dto.getBody())
                .build();
    }
    
    default UpdatePersonaPromptRequest toUpdatePersonaPromptRequest(CounselPromptDto.UpdatePersonaPromptRequestDto dto) {
        return UpdatePersonaPromptRequest.newBuilder()
                .setCounselorId(dto.getCounselorId())
                .setBody(dto.getBody())
                .build();
    }
    
    default CreateCounselTechniqueRequest toCreateCounselTechniqueRequest(CounselPromptDto.CreateCounselTechniqueRequestDto dto) {
        return CreateCounselTechniqueRequest.newBuilder()
                .setName(dto.getName())
                .setToneId(dto.getToneId())
                .setContext(dto.getContext())
                .setInstruction(dto.getInstruction())
                .setMessageThreshold(dto.getMessageThreshold())
                .build();
    }
    
    default UpdateCounselTechniqueRequest toUpdateCounselTechniqueRequest(CounselPromptDto.UpdateCounselTechniqueRequestDto dto) {
        UpdateCounselTechniqueRequest.Builder builder = UpdateCounselTechniqueRequest.newBuilder()
                .setCounselTechniqueId(dto.getCounselTechniqueId());
        
        if (dto.getName() != null) {
            builder.setName(dto.getName());
        }
        if (dto.getContext() != null) {
            builder.setContext(dto.getContext());
        }
        if (dto.getInstruction() != null) {
            builder.setInstruction(dto.getInstruction());
        }
        if (dto.getMessageThreshold() != null) {
            builder.setMessageThreshold(dto.getMessageThreshold());
        }
        
        return builder.build();
    }
    
    default SaveCounselTechniqueSequenceRequest toSaveCounselTechniqueSequenceRequest(CounselPromptDto.SaveCounselTechniqueSequenceRequestDto dto) {
        return SaveCounselTechniqueSequenceRequest.newBuilder()
                .setToneId(dto.getToneId())
                .addAllCounselTechniqueIds(dto.getCounselTechniqueIds())
                .build();
    }
    
    default FindPromptVersionByIdRequest toFindPromptVersionByIdRequest(String promptVersionId) {
        return FindPromptVersionByIdRequest.newBuilder()
                .setPromptVersionId(promptVersionId)
                .build();
    }
    
    default ActivatePromptVersionRequest toActivatePromptVersionRequest(String promptVersionId) {
        return ActivatePromptVersionRequest.newBuilder()
                .setPromptVersionId(promptVersionId)
                .build();
    }
    
    default FindPersonaPromptByIdRequest toFindPersonaPromptByIdRequest(String personaPromptId) {
        return FindPersonaPromptByIdRequest.newBuilder()
                .setPersonaPromptId(personaPromptId)
                .build();
    }
    
    default FindTonePromptByIdRequest toFindTonePromptByIdRequest(String tonePromptId) {
        return FindTonePromptByIdRequest.newBuilder()
                .setTonePromptId(tonePromptId)
                .build();
    }
    
    default FindCounselTechniqueByIdRequest toFindCounselTechniqueByIdRequest(String counselTechniqueId) {
        return FindCounselTechniqueByIdRequest.newBuilder()
                .setCounselTechniqueId(counselTechniqueId)
                .build();
    }
    
    default FindOrderedCounselTechniquesRequest toFindOrderedCounselTechniquesRequest(String firstCounselTechniqueId) {
        return FindOrderedCounselTechniquesRequest.newBuilder()
                .setFirstCounselTechniqueId(firstCounselTechniqueId)
                .build();
    }
    
    default FindPromptActivateHistoriesRequest toFindPromptActivateHistoriesRequest(String promptVersionId) {
        FindPromptActivateHistoriesRequest.Builder builder = FindPromptActivateHistoriesRequest.newBuilder();
        if (promptVersionId != null) {
            builder.setPromptVersionId(promptVersionId);
        }
        return builder.build();
    }
    
    // 응답 DTO 변환 메소드
    default CounselPromptDto.FindPromptVersionsResponseDto toFindPromptVersionsResponseDto(List<PromptVersion> promptVersions) {
        CounselPromptDto.FindPromptVersionsResponseDto responseDto = new CounselPromptDto.FindPromptVersionsResponseDto();
        responseDto.setPromptVersions(promptVersions.stream().map(this::of).collect(Collectors.toList()));
        return responseDto;
    }
    
    default CounselPromptDto.FindPromptVersionByIdResponseDto toFindPromptVersionByIdResponseDto(PromptVersion promptVersion) {
        CounselPromptDto.FindPromptVersionByIdResponseDto responseDto = new CounselPromptDto.FindPromptVersionByIdResponseDto();
        responseDto.setPromptVersion(of(promptVersion));
        return responseDto;
    }
    
    default CounselPromptDto.FindTemporaryVersionResponseDto toFindTemporaryVersionResponseDto(PromptVersion promptVersion) {
        CounselPromptDto.FindTemporaryVersionResponseDto responseDto = new CounselPromptDto.FindTemporaryVersionResponseDto();
        responseDto.setPromptVersion(of(promptVersion));
        return responseDto;
    }
    
    default CounselPromptDto.LoadExistingPromptVersionResponseDto toLoadExistingPromptVersionResponseDto(PromptVersion promptVersion) {
        CounselPromptDto.LoadExistingPromptVersionResponseDto responseDto = new CounselPromptDto.LoadExistingPromptVersionResponseDto();
        responseDto.setPromptVersion(of(promptVersion));
        return responseDto;
    }
    
    default CounselPromptDto.SaveTemporaryVersionResponseDto toSaveTemporaryVersionResponseDto(PromptVersion promptVersion) {
        CounselPromptDto.SaveTemporaryVersionResponseDto responseDto = new CounselPromptDto.SaveTemporaryVersionResponseDto();
        responseDto.setPromptVersion(of(promptVersion));
        return responseDto;
    }
    
    default CounselPromptDto.ActivatePromptVersionResponseDto toActivatePromptVersionResponseDto(PromptVersion promptVersion) {
        CounselPromptDto.ActivatePromptVersionResponseDto responseDto = new CounselPromptDto.ActivatePromptVersionResponseDto();
        responseDto.setPromptVersion(of(promptVersion));
        return responseDto;
    }
    
    default CounselPromptDto.FindPersonaPromptByIdResponseDto toFindPersonaPromptByIdResponseDto(PersonaPrompt personaPrompt) {
        CounselPromptDto.FindPersonaPromptByIdResponseDto responseDto = new CounselPromptDto.FindPersonaPromptByIdResponseDto();
        responseDto.setPersonaPrompt(of(personaPrompt));
        return responseDto;
    }
    
    default CounselPromptDto.UpdatePersonaPromptResponseDto toUpdatePersonaPromptResponseDto(PersonaPrompt personaPrompt) {
        CounselPromptDto.UpdatePersonaPromptResponseDto responseDto = new CounselPromptDto.UpdatePersonaPromptResponseDto();
        responseDto.setPersonaPrompt(of(personaPrompt));
        return responseDto;
    }
    
    default CounselPromptDto.FindTonePromptByIdResponseDto toFindTonePromptByIdResponseDto(TonePrompt tonePrompt) {
        CounselPromptDto.FindTonePromptByIdResponseDto responseDto = new CounselPromptDto.FindTonePromptByIdResponseDto();
        responseDto.setTonePrompt(of(tonePrompt));
        return responseDto;
    }
    
    default CounselPromptDto.UpdateTonePromptResponseDto toUpdateTonePromptResponseDto(TonePrompt tonePrompt) {
        CounselPromptDto.UpdateTonePromptResponseDto responseDto = new CounselPromptDto.UpdateTonePromptResponseDto();
        responseDto.setTonePrompt(of(tonePrompt));
        return responseDto;
    }
    
    default CounselPromptDto.CreateCounselTechniqueResponseDto toCreateCounselTechniqueResponseDto(CounselTechnique counselTechnique) {
        CounselPromptDto.CreateCounselTechniqueResponseDto responseDto = new CounselPromptDto.CreateCounselTechniqueResponseDto();
        responseDto.setCounselTechnique(of(counselTechnique));
        return responseDto;
    }
    
    default CounselPromptDto.FindOrderedCounselTechniquesResponseDto toFindOrderedCounselTechniquesResponseDto(List<CounselTechnique> counselTechniques) {
        CounselPromptDto.FindOrderedCounselTechniquesResponseDto responseDto = new CounselPromptDto.FindOrderedCounselTechniquesResponseDto();
        responseDto.setCounselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()));
        return responseDto;
    }
    
    default CounselPromptDto.FindCounselTechniqueByIdResponseDto toFindCounselTechniqueByIdResponseDto(CounselTechnique counselTechnique) {
        CounselPromptDto.FindCounselTechniqueByIdResponseDto responseDto = new CounselPromptDto.FindCounselTechniqueByIdResponseDto();
        responseDto.setCounselTechnique(of(counselTechnique));
        return responseDto;
    }
    
    default CounselPromptDto.UpdateCounselTechniqueResponseDto toUpdateCounselTechniqueResponseDto(CounselTechnique counselTechnique) {
        CounselPromptDto.UpdateCounselTechniqueResponseDto responseDto = new CounselPromptDto.UpdateCounselTechniqueResponseDto();
        responseDto.setCounselTechnique(of(counselTechnique));
        return responseDto;
    }
    
    default CounselPromptDto.SaveCounselTechniqueSequenceResponseDto toSaveCounselTechniqueSequenceResponseDto(List<CounselTechnique> counselTechniques) {
        CounselPromptDto.SaveCounselTechniqueSequenceResponseDto responseDto = new CounselPromptDto.SaveCounselTechniqueSequenceResponseDto();
        responseDto.setCounselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()));
        return responseDto;
    }
    
    default CounselPromptDto.FindPromptActivateHistoriesResponseDto toFindPromptActivateHistoriesResponseDto(List<PromptActivateHistory> promptActivateHistories) {
        CounselPromptDto.FindPromptActivateHistoriesResponseDto responseDto = new CounselPromptDto.FindPromptActivateHistoriesResponseDto();
        responseDto.setPromptActivateHistories(promptActivateHistories.stream().map(this::of).collect(Collectors.toList()));
        return responseDto;
    }
}