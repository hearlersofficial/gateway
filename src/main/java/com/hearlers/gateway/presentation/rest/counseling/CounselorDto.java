package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselorGender;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;


public class CounselorDto {

    @Getter
    @Setter
    @Schema(description = "상담사")
    public static class Counselor {
        @Schema(description = "상담사 ID")
        private String id;
        @Schema(description = "톤 ID")
        private String toneId;
        @Schema(description = "상담사 이름")
        private String name;
        @Schema(description = "상담사 설명")
        private String description;
        @Schema(description = "상담사 성별")
        private CounselorGender gender;
        @Schema(description = "상담사 소개 메시지")
        private String introMessage;
        @Schema(description = "상담사 응답 옵션 1")
        private String responseOption1;
        @Schema(description = "상담사 응답 옵션 2")
        private String responseOption2;
        @Schema(description = "상담사 생성 시간")
        private String createdAt;
        @Schema(description = "상담사 수정 시간")
        private String updatedAt;
        @Schema(description = "상담사 삭제 시간")
        private String deletedAt;
    }


    @Getter
    @Setter
    @Schema(description = "상담사 조회 요청")
    public static class FindCounselorsRequest {
        @Schema(description = "톤 ID (선택)", example = "tone_123456", nullable = true)
        private String toneId;
    }

    @Getter
    @Setter
    @Schema(description = "상담사 조회 응답")
    public static class FindCounselorsResponse {
        @Schema(description = "상담사 목록")
        private List<Counselor> counselors;
    }
}