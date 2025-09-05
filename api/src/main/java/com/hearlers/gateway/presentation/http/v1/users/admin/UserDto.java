package com.hearlers.gateway.presentation.http.v1.users.admin;

import com.hearlers.api.proto.v1.model.Gender;
import com.hearlers.api.proto.v1.model.Mbti;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

public class UserDto {

    @Getter
    @Builder
    @Schema(description = "유저 정보")
    public static class User {
        @Schema(description = "유저 ID")
        private String id;
        @Schema(description = "닉네임")
        private String nickname;
        @Schema(description = "유저 프로필")
        private UserProfile userProfile;
        @Schema(description = "생성 시간")
        private String createdAt;
        @Schema(description = "수정 시간")
        private String updatedAt;
        @Schema(description = "삭제 시간", nullable = true)
        private String deletedAt;
    }

    @Getter
    @Builder
    @Schema(description = "유저 프로필 정보")
    public static class UserProfile {
        @Schema(description = "프로필 이미지 URL", nullable = true)
        private String profileImage;
        @Schema(description = "성별", nullable = true)
        private Gender gender;
        @Schema(description = "MBTI", nullable = true)
        private Mbti mbti;
        @Schema(description = "생년", nullable = true)
        private Integer birthYear;
    }


    @Getter
    @Builder
    @Schema(description = "유저 ID로 조회 응답")
    public static class FindUserByIdResponse {
        @Schema(description = "유저 정보")
        private User user;
    }
}
