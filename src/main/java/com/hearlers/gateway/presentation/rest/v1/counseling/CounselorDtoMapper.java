package com.hearlers.gateway.presentation.rest.v1.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Counselor;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselorDtoMapper {

    // Counselor → CounselorDto
    CounselorDto.Counselor of (Counselor counselor);

    // Tone → ToneDto
    CounselorDto.Tone of (Tone tone);


    // Counselor
    // FindOne
    default FindCounselorByIdRequest toFindCounselorRequest (String CounselorId) {
        return FindCounselorByIdRequest.newBuilder()
                .setCounselorId(CounselorId)
                .build();
    };
    default CounselorDto.FindCounselorResponse toFindCounselorResponse (Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.FindCounselorResponse.builder()
                .counselor(counselorDto)
                .build();
    };
    // FindMany
    FindCounselorsRequest toFindCounselorsRequest (CounselorDto.FindCounselorsRequest request);
    default CounselorDto.FindCounselorsResponse toFindCounselorsResponse (List<Counselor> counselors) {
        return CounselorDto.FindCounselorsResponse.builder()
                .counselors(counselors.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    // Tone
    // FindOne
    default FindToneByIdRequest toFindToneRequest (String toneId) {
        return FindToneByIdRequest.newBuilder()
                .setToneId(toneId)
                .build();
    };
    default CounselorDto.FindToneResponse toFindToneResponse (Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.FindToneResponse.builder()
                .tone(toneDto)
                .build();
    }

    // FindMany
    FindTonesRequest toFindTonesRequest (CounselorDto.FindTonesRequest request);
    default CounselorDto.FindTonesResponse toFindTonesResponse (List<Tone> tones) {
        return CounselorDto.FindTonesResponse.builder()
                .tones(tones.stream()
                        .map(this::of)
                        .toList())
                .build();
    }
    
    // Counselor Create
    default CreateCounselorRequest toCreateCounselorRequest(CounselorDto.CreateCounselorRequest request) {
        return CreateCounselorRequest.newBuilder()
                .setToneId(request.getToneId())
                .setName(request.getName())
                .setDescription(request.getDescription())
                .setCounselorGender(request.getGender())
                .build();
    }
    
    default CounselorDto.CreateCounselorResponse toCreateCounselorResponse(Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.CreateCounselorResponse.builder()
                .counselor(counselorDto)
                .build();
    }
    
    // Counselor Update
    default UpdateCounselorRequest toUpdateCounselorRequest(String counselorId, CounselorDto.UpdateCounselorRequest request) {
        UpdateCounselorRequest.Builder builder = UpdateCounselorRequest.newBuilder()
                .setCounselorId(counselorId);
        
        if (request.getToneId() != null) {
            builder.setToneId(request.getToneId());
        }
        
        if (request.getName() != null) {
            builder.setName(request.getName());
        }
        
        if (request.getDescription() != null) {
            builder.setDescription(request.getDescription());
        }
        
        if (request.getGender() != null) {
            builder.setCounselorGender(request.getGender());
        }
        
        return builder.build();
    }
    
    default CounselorDto.UpdateCounselorResponse toUpdateCounselorResponse(Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.UpdateCounselorResponse.builder()
                .counselor(counselorDto)
                .build();
    }
    
    // Tone Create
    default CreateToneRequest toCreateToneRequest(CounselorDto.CreateToneRequest request) {
        return CreateToneRequest.newBuilder()
                .setName(request.getName())
                .setDescription(request.getDescription())
                .build();
    }
    
    default CounselorDto.CreateToneResponse toCreateToneResponse(Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.CreateToneResponse.builder()
                .tone(toneDto)
                .build();
    }
    
    // Tone Update
    default UpdateToneRequest toUpdateToneRequest(String toneId, CounselorDto.UpdateToneRequest request) {
        UpdateToneRequest.Builder builder = UpdateToneRequest.newBuilder()
                .setToneId(toneId);
                
        if (request.getName() != null) {
            builder.setName(request.getName());
        }
        
        if (request.getDescription() != null) {
            builder.setDescription(request.getDescription());
        }
        
        return builder.build();
    }
    
    default CounselorDto.UpdateToneResponse toUpdateToneResponse(Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.UpdateToneResponse.builder()
                .tone(toneDto)
                .build();
    }
}
