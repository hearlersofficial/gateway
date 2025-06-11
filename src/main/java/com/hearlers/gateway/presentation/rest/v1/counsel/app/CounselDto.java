package com.hearlers.gateway.presentation.rest.v1.counsel.app;

import com.hearlers.api.proto.v1.model.CounselMessageReaction;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class CounselDto {

    @Getter
    @Builder
    @Schema(description = "상담")
    public static class Counsel {
        @Schema(description = "상담 ID", example = "123534543")
        private String id;
        @Schema(description = "상담사 ID", example = "53453454323")
        private String counselorId;
        @Schema(description = "유저 ID", example = "53453454323")
        private String userId;
        @Schema(description = "마지막 메시지", example = "안녕하세요, 상담사님!", nullable = true)
        private String lastMessage;
        @Schema(description = "마지막 채팅 날짜", example = "2024-12-29T12:34:56.000Z", nullable = true)
        private String lastChatedAt;
        @Schema(description = "프롬프트 버전 ID", example = "5435345345")
        private String promptVersionId;
        @Schema(description = "상담 테크닉 ID", example = "436534342321")
        private String counselTechniqueId;
        @Schema(description = "상담사와 유저의 관계 ID", example = "436534342321")
        private String counselorUserRelationshipId;
        @Schema(description = "상담 생성 시간")
        private String createdAt;
        @Schema(description = "상담 수정 시간")
        private String updatedAt;
        @Schema(description = "상담 삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "상담 메세지")
    public static class CounselMessage {
        @Schema(description = "메시지 ID")
        private String id;
        @Schema(description = "상담 ID")
        private String counselId;
        @Schema(description = "메시지 내용")
        private String message;
        @Schema(description = "유저 메시지 여부")
        private boolean isUserMessage;
        @Schema(description = "메시지 반응 시간 (ISO 8601)", nullable = true)
        private String reactedAt;
        @Schema(description = "메시지 반응 객체", nullable = true)
        private CounselMessageReaction reaction;
        @Schema(description = "생성 시간 (ISO 8601)")
        private String createdAt;
        @Schema(description = "수정 시간 (ISO 8601)")
        private String updatedAt;
        @Schema(description = "삭제 시간 (ISO 8601)", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "상담사와 유저의 관계")
    public static class CounselorUserRelationship {
        @Schema(description = "관계 ID")
        private String id;
        @Schema(description = "상담사 ID")
        private String counselorId;
        @Schema(description = "유저 ID")
        private String userId;
        @Schema(description = "라포 점수")
        private Integer rapport;
        @Schema(description = "생성 시간 (ISO 8601)")
        private String createdAt;
        @Schema(description = "수정 시간 (ISO 8601)")
        private String updatedAt;
        @Schema(description = "삭제 시간 (ISO 8601)", nullable = true)
        private String deletedAt;
    }

    // 상담 생성 요청
    @Getter
    @Builder
    @Schema(description = "상담 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateCounselRequest {
        @Schema(description = "버블 ID", nullable = true)
        private String bubbleId;
        @Schema(description = "응답 옵션 번호", nullable = true)
        private Integer responseOptionNo;
    }

    @Getter
    @Builder
    @Schema(description = "상담 생성 응답")
    public static class CreateCounselResponse {
        @Schema(description = "생성된 상담")
        private Counsel counsel;
        @Schema(description = "상담 메시지 목록")
        private List<CounselMessage> counselMessages;
    }


    @Getter
    @Builder
    @Schema(description = "상담 목록 조회 응답")
    public static class FindCounselsResponse {
        @Schema(description = "상담 목록")
        private List<Counsel> counsels;
    }


    @Getter
    @Builder
    @Schema(description = "상담 단건 조회 응답")
    public static class FindCounselByIdResponse {
        @Schema(description = "상담", nullable = true)
        private Counsel counsel;
    }

    // 상담 메시지 생성 요청
    @Getter
    @Builder
    @Schema(description = "메시지 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateMessageRequest {
        @Schema(description = "메시지 내용", required = true)
        private String message;
    }

    @Getter
    @Builder
    @Schema(description = "메시지 생성 응답")
    public static class CreateMessageResponse {
        @Schema(description = "생성된 상담 메시지")
        private CounselMessage createdCounselMessage;
        @Schema(description = "상담사 응답 메시지")
        private CounselMessage counselorResponseMessage;
    }


    @Getter
    @Builder
    @Schema(description = "메시지 목록 조회 응답")
    public static class FindMessagesResponse {
        @Schema(description = "상담 메시지 목록")
        private List<CounselMessage> counselMessages;
    }

    // 메시지 반응 요청
    @Getter
    @Builder
    @Schema(description = "메시지 반응 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReactMessageRequest {
        @Schema(description = "메시지 반응", required = true)
        private CounselMessageReaction reaction;
    }

    @Getter
    @Builder
    @Schema(description = "메시지 반응 응답")
    public static class ReactMessageResponse {
        @Schema(description = "반응이 추가된 상담 메시지")
        private CounselMessage counselMessage;
    }


    @Getter
    @Builder
    @Schema(description = "상담사와 유저 관계 조회 응답")
    public static class FindCounselorUserRelationshipsResponse {
        @Schema(description = "상담사와 유저 관계 목록")
        private List<CounselorUserRelationship> counselorUserRelationships;
    }
}
