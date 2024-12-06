package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.shared.enums.Gender;
import com.hearlers.gateway.shared.enums.Mbti;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "사용자 정보 수정 응답 DTO")
public class UpdateUserInfoResponseDto {
    @Schema(description = "닉네임", example = "킹왕짱")
    private String nickname;

    @Schema(description = "MBTI", example = "MBTI_ENTP")
    private Mbti mbti;

    @Schema(description = "성별", example = "GENDER_MALE")
    private Gender gender;
}
