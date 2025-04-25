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
}
