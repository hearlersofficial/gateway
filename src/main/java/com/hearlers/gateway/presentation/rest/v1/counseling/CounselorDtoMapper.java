package com.hearlers.gateway.presentation.rest.v1.counseling;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselorDtoMapper {

    // Counselor → CounselorDto
    CounselorDto.Counselor of (Counselor counselor);

    // List<Counselor> → List<CounselorDto.Counselor>
    List<CounselorDto.Counselor> of (List<Counselor> counselors);

    FindCounselorsRequest of (CounselorDto.FindCounselorsRequest request);

    // List<Counselor> → FindCounselorsResponseDto
    default CounselorDto.FindCounselorsResponse ofGetCounselors (List<Counselor> counselors) {
        List<CounselorDto.Counselor> counselorDtos = of(counselors);
        CounselorDto.FindCounselorsResponse response = new CounselorDto.FindCounselorsResponse();
        response.setCounselors(counselorDtos);
        return response;
    }
    
}
