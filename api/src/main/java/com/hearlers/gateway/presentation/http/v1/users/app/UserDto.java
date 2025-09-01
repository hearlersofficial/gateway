package com.hearlers.gateway.presentation.http.v1.users.app;

import com.hearlers.api.proto.v1.model.Gender;
import com.hearlers.api.proto.v1.model.Mbti;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Schema(description = "내 정보 조회 응답")
    public static class FindMyUserResponse {
        @Schema(description = "유저 정보")
        private User user;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Schema(description = "내 프로필 업데이트 요청")
    public static class UpdateMyUserRequest {
        @Schema(description = "닉네임", nullable = true)
        private String nickname;
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
    @Schema(description = "내 프로필 업데이트 응답")
    public static class UpdateMyUserResponse {
        @Schema(description = "업데이트된 유저 정보")
        private User user;
    }
}