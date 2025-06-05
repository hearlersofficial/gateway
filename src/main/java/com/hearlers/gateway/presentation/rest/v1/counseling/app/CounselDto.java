package com.hearlers.gateway.presentation.rest.v1.counseling.app;

import com.hearlers.api.proto.v1.model.CounselMessageReaction;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

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
}
