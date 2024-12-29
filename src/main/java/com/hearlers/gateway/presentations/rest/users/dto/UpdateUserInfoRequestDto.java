package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.api.proto.v1.model.Gender;
import com.hearlers.api.proto.v1.model.Mbti;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "사용자 정보 수정 요청 DTO")
public class UpdateUserInfoRequestDto {
    @Schema(description = "닉네임", example = "킹왕짱")
    private String nickname;

    @Schema(description = "프로필 이미지", example = "https://example.com")
    private String profileImage;

    @Schema(description = "전화번호", example = "010-1234-5678")
    private String phoneNumber;

    @Schema(description = "성별", example = "GENDER_MALE")
    private Gender gender;

    @Schema(description = "생년월일", example = "1999-01-01")
    private String birthday;

    @Schema(description = "자기소개", example = "저는 아무개입니다.")
    private String introduction;

    @Schema(description = "MBTI", example = "MBTI_ENTP")
    private Mbti mbti;
}