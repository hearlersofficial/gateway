package com.hearlers.gateway.presentation.rest.v1.counseling.admin;

import java.util.List;

import com.hearlers.api.proto.v1.common.Extension;
import com.hearlers.api.proto.v1.model.CounselorGender;
import com.hearlers.api.proto.v1.model.Speaker;
import com.hearlers.gateway.shared.presentation.PresignedUrlResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

public class CounselorDto {

    @Getter
    @Builder
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
        @Schema(description = "상담사 프로필 이미지")
        private String profileImage;
        @Schema(description = "상담사 성별")
        private CounselorGender gender;
        @Schema(description = "상담사 생성 시간")
        private String createdAt;
        @Schema(description = "상담사 수정 시간")
        private String updatedAt;
        @Schema(description = "상담사 삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "버블")
    public static class Bubble {
        @Schema(description = "버블 ID")
        private String id;
        @Schema(description = "버블 질문")
        private String question;
        @Schema(description = "버블 응답 1")
        private String responseOption1;
        @Schema(description = "버블 응답 2")
        private String responseOption2;
        @Schema(description = "버블 생성 시간")
        private String createdAt;
        @Schema(description = "버블 수정 시간")
        private String updatedAt;
        @Schema(description = "버블 삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드")
    public static class Episode {
        @Schema(description = "에피소드 ID")
        private String id;
        @Schema(description = "상담사 ID")
        private String counselorId;
        @Schema(description = "에피소드 제목")
        private String title;
        @Schema(description = "에피소드 해금을 위한 라포 수치")
        private Integer requiredRapportThreshold;
        @Schema(description = "임시 여부")
        private Boolean isTemporary;
        @Schema(description = "에피소드 컷신 목록")
        private List<EpisodeCutScene> cutScenes;
        @Schema(description = "에피소드 생성 시간")
        private String createdAt;
        @Schema(description = "에피소드 수정 시간")
        private String updatedAt;
        @Schema(description = "에피소드 삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 컷신")
    public static class EpisodeCutScene {
        @Schema(description = "컷신 ID")
        private String id;
        @Schema(description = "에피소드 ID")
        private String episodeId;
        @Schema(description = "컷신 발화자")
        private Speaker speaker;
        @Schema(description = "컷신 내용")
        private String content;
        @Schema(description = "컷신 순서 인덱스")
        private Integer orderIndex;
        @Schema(description = "컷신 이미지 URL")
        private String image;
        @Schema(description = "컷신 생성 시간")
        private String createdAt;
        @Schema(description = "컷신 수정 시간")
        private String updatedAt;
        @Schema(description = "컷신 삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "톤")
    public static class Tone {
        @Schema(description = "톤 ID")
        private String id;
        @Schema(description = "톤 이름")
        private String name;
        @Schema(description = "톤 설명")
        private String description;
        @Schema(description = "톤 생성 시간")
        private String createdAt;
        @Schema(description = "톤 수정 시간")
        private String updatedAt;
        @Schema(description = "톤 삭제 시간", nullable = true)
        private String deletedAt;
    }

    // 상담사 관련 DTO
    @Getter
    @Builder
    @Schema(description = "상담사 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateCounselorRequest {
        @Schema(description = "톤 ID", required = true)
        private String toneId;
        @Schema(description = "상담사 이름", required = true)
        private String name;
        @Schema(description = "상담사 설명", required = true)
        private String description;
        @Schema(description = "상담사 프로필 이미지", required = true)
        private String profileImage;
        @Schema(description = "상담사 성별", required = true)
        private CounselorGender gender;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 생성 응답")
    public static class CreateCounselorResponse {
        @Schema(description = "생성된 상담사")
        private Counselor counselor;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 조회 요청")
    public static class FindCounselorsRequest {
        @Parameter(name = "tone-id", description = "톤 ID (선택)")
        private String toneId;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 조회 응답")
    public static class FindCounselorsResponse {
        @Schema(description = "상담사 목록")
        private List<Counselor> counselors;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 ID로 조회 요청")
    public static class FindCounselorByIdRequest {
        @Schema(description = "상담사 ID", required = true)
        private String counselorId;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 ID로 조회 응답")
    public static class FindCounselorByIdResponse {
        @Schema(description = "상담사 정보")
        private Counselor counselor;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 업데이트 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateCounselorRequest {
        @Schema(description = "톤 ID", nullable = true)
        private String toneId;
        @Schema(description = "상담사 이름", nullable = true)
        private String name;
        @Schema(description = "상담사 설명", nullable = true)
        private String description;
        @Schema(description = "상담사 프로필 이미지", nullable = true)
        private String profileImage;
        @Schema(description = "상담사 성별", nullable = true)
        private CounselorGender gender;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 업데이트 응답")
    public static class UpdateCounselorResponse {
        @Schema(description = "업데이트된 상담사")
        private Counselor counselor;
    }

    // 버블 관련 DTO
    @Getter
    @Builder
    @Schema(description = "버블 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateBubbleRequest {
        @Schema(description = "버블 질문", required = true)
        private String question;
        @Schema(description = "버블 응답 1", required = true)
        private String responseOption1;
        @Schema(description = "버블 응답 2", required = true)
        private String responseOption2;
    }

    @Getter
    @Builder
    @Schema(description = "버블 생성 응답")
    public static class CreateBubbleResponse {
        @Schema(description = "생성된 버블")
        private Bubble bubble;
    }

    @Getter
    @Builder
    @Schema(description = "버블 조회 요청")
    public static class FindBubblesRequest {
        @Schema(description = "상담사 ID", required = true)
        private String counselorId;
    }

    @Getter
    @Builder
    @Schema(description = "버블 조회 응답")
    public static class FindBubblesResponse {
        @Schema(description = "버블 목록")
        private List<Bubble> bubbles;
    }

    @Getter
    @Builder
    @Schema(description = "버블 ID로 조회 요청")
    public static class FindBubbleByIdRequest {
        @Schema(description = "버블 ID", required = true)
        private String bubbleId;
        @Schema(description = "상담사 ID", required = true)
        private String counselorId;
    }

    @Getter
    @Builder
    @Schema(description = "버블 ID로 조회 응답")
    public static class FindBubbleByIdResponse {
        @Schema(description = "버블 정보")
        private Bubble bubble;
    }

    @Getter
    @Builder
    @Schema(description = "랜덤 버블 조회 요청")
    public static class FindRandomBubbleRequest {
        @Schema(description = "상담사 ID", required = true)
        private String counselorId;
    }

    @Getter
    @Builder
    @Schema(description = "랜덤 버블 조회 응답")
    public static class FindRandomBubbleResponse {
        @Schema(description = "랜덤 버블 정보")
        private Bubble bubble;
    }

    @Getter
    @Builder
    @Schema(description = "버블 업데이트 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateBubbleRequest {
        @Schema(description = "버블 질문", nullable = true)
        private String question;
        @Schema(description = "버블 응답 1", nullable = true)
        private String responseOption1;
        @Schema(description = "버블 응답 2", nullable = true)
        private String responseOption2;
    }

    @Getter
    @Builder
    @Schema(description = "버블 업데이트 응답")
    public static class UpdateBubbleResponse {
        @Schema(description = "업데이트된 버블")
        private Bubble bubble;
    }

    @Getter
    @Builder
    @Schema(description = "버블 삭제 요청")
    public static class DeleteBubbleRequest {
        @Schema(description = "버블 ID", required = true)
        private String bubbleId;
        @Schema(description = "상담사 ID", required = true)
        private String counselorId;
    }

    @Getter
    @Builder
    @Schema(description = "버블 삭제 응답")
    public static class DeleteBubbleResponse {
        @Schema(description = "삭제 성공 여부")
        private Boolean success;
    }

    // 에피소드 관련 DTO
    @Getter
    @Builder
    @Schema(description = "에피소드 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateEpisodeRequest {
        @Schema(description = "에피소드 제목", required = true)
        private String title;
        @Schema(description = "에피소드 해금을 위한 라포 수치", required = true)
        private Integer requiredRapportThreshold;
        @Schema(description = "임시 여부", required = true)
        private Boolean isTemporary;
        @Schema(description = "에피소드 컷신 목록", required = true)
        private List<SaveNewEpisodeCutSceneRequest> cutScenes;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 생성 응답")
    public static class CreateEpisodeResponse {
        @Schema(description = "생성된 에피소드")
        private Episode episode;
    }


    @Getter
    @Builder
    @Schema(description = "에피소드 조회 응답")
    public static class FindEpisodesResponse {
        @Schema(description = "에피소드 목록")
        private List<Episode> episodes;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 ID로 조회 요청")
    public static class FindEpisodeByIdRequest {
        @Schema(description = "에피소드 ID", required = true)
        private String episodeId;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 ID로 조회 응답")
    public static class FindEpisodeByIdResponse {
        @Schema(description = "에피소드 정보")
        private Episode episode;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 업데이트 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateEpisodeRequest {
        @Schema(description = "에피소드 제목", nullable = true)
        private String title;
        @Schema(description = "에피소드 해금을 위한 라포 수치", nullable = true)
        private Integer requiredRapportThreshold;
        @Schema(description = "임시 여부", nullable = true)
        private Boolean isTemporary;
        @Schema(description = "에피소드 컷신 목록", nullable = true)
        private List<SaveEpisodeCutSceneRequest> cutScenes;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 업데이트 응답")
    public static class UpdateEpisodeResponse {
        @Schema(description = "업데이트된 에피소드")
        private Episode episode;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 컷신 저장 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SaveEpisodeCutSceneRequest {
        @Schema(description = "컷신 ID (수정 시 필요)", nullable = true)
        private String id;
        @Schema(description = "컷신 발화자", required = true)
        private Speaker speaker;
        @Schema(description = "컷신 내용", required = true)
        private String content;
        @Schema(description = "컷신 순서 인덱스", required = true)
        private Integer orderIndex;
        @Schema(description = "컷신 이미지 URL", required = true)
        private String image;
    }

    @Getter
    @Builder
    @Schema(description = "에피소드 컷신 저장 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SaveNewEpisodeCutSceneRequest {
        @Schema(description = "컷신 발화자", required = true)
        private Speaker speaker;
        @Schema(description = "컷신 내용", required = true)
        private String content;
        @Schema(description = "컷신 순서 인덱스", required = true)
        private Integer orderIndex;
        @Schema(description = "컷신 이미지 URL", required = true)
        private String image;
    }


    // 톤 관련 DTO
    @Getter
    @Builder
    @Schema(description = "톤 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateToneRequest {
        @Schema(description = "톤 이름", required = true)
        private String name;
        @Schema(description = "톤 설명", required = true)
        private String description;
    }

    @Getter
    @Builder
    @Schema(description = "톤 생성 응답")
    public static class CreateToneResponse {
        @Schema(description = "생성된 톤")
        private Tone tone;
    }

    @Getter
    @Builder
    @Schema(description = "톤 조회 요청")
    public static class FindTonesRequest {
        @Schema(description = "톤 이름 (선택)", nullable = true)
        private String name;
    }

    @Getter
    @Builder
    @Schema(description = "톤 조회 응답")
    public static class FindTonesResponse {
        @Schema(description = "톤 목록")
        private List<Tone> tones;
    }

    @Getter
    @Builder
    @Schema(description = "톤 ID로 조회 요청")
    public static class FindToneByIdRequest {
        @Schema(description = "톤 ID", required = true)
        private String toneId;
    }

    @Getter
    @Builder
    @Schema(description = "톤 ID로 조회 응답")
    public static class FindToneByIdResponse {
        @Schema(description = "톤 정보")
        private Tone tone;
    }

    @Getter
    @Builder
    @Schema(description = "톤 업데이트 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateToneRequest {
        @Schema(description = "톤 ID", required = true)
        private String toneId;
        @Schema(description = "톤 이름", nullable = true)
        private String name;
        @Schema(description = "톤 설명", nullable = true)
        private String description;
    }

    @Getter
    @Builder
    @Schema(description = "톤 업데이트 응답")
    public static class UpdateToneResponse {
        @Schema(description = "업데이트된 톤")
        private Tone tone;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Schema(description = "상담사 이미지 URL 생성 요청")
    public static class GenerateCounselorImageUrlRequest {
        @Schema(description = "이미지 확장자", required = true)
        private Extension extension;
    }

    @Getter
    @Builder
    @Schema(description = "상담사 이미지 URL 생성 응답")
    public static class GenerateCounselorImageUrlResponse {
        @Schema(description = "Presigned URL")
        private PresignedUrlResponse presignedUrl;
    }

    @Getter
    @Builder
    @Schema(description = "컷신 이미지 URL 생성 요청")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GenerateCutSceneImageUrlRequest {
        @Schema(description = "이미지 확장자", required = true)
        private Extension extension;
    }

    @Getter
    @Builder
    @Schema(description = "컷신 이미지 URL 생성 응답")
    public static class GenerateCutSceneImageUrlResponse {
        @Schema(description = "Presigned URL")
        private PresignedUrlResponse presignedUrl;
    }
}