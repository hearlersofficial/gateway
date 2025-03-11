package com.hearlers.gateway.presentation.rest.counselors.dto;

import com.hearlers.gateway.shared.enums.CounselorName;
import com.hearlers.gateway.shared.enums.CounselorType;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Schema(description = "모든 상담사 조회 응답 DTO")
public class GetCounselorsResponseDto {

    @Schema(description = "상담사 ID", example = "1")
    private String counselorId;

    @Schema(description = "상담사 타입", example = "COUNSELOR_TYPE_DEPRESSION")
    private CounselorType counselorType;

    @Schema(description = "상담사 이름", example = "COUNSELOR_NAME_DAHYE")
    private CounselorName counselorName;

    @Schema(description = "상담사 소개", example = "독일에서 상담 심리학을 전공했으며, ~~")
    private String description;

    @Schema(description = "상담사 프로필 이미지 URL", example = "나는 이것저것 고민이 많아서 어제 밤잠을 설쳤어. 너는 어때? 어제 잠은 푹 잤어?")
    private String introMessage;

    @Schema(description = "상담사 응답 메시지1", example = "나도 어제 잘 못 잤어.")
    private String responseOption1;

    @Schema(description = "상담사 응답 메시지2", example = "그래..? 나는 어제 푹 잤는데ㅠㅠ")
    private String responseOption2;
}
