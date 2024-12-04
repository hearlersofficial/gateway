package com.hearlers.gateway.presentations.rest.counselors.dto;

import com.hearlers.gateway.shared.enums.CounselorName;
import com.hearlers.gateway.shared.enums.CounselorType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GetCounselorsResponseDto {
    private int counselorId;
    private CounselorType counselorType;
    private CounselorName counselorName;
    private String description;
    private String introMessage;
    private String responseOption1;
    private String responseOption2;
}
