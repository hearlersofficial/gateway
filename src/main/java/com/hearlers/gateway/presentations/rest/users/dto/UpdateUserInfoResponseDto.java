package com.hearlers.gateway.presentations.rest.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "사용자 정보 수정 응답 DTO")
public class UpdateUserInfoResponseDto {

    @Schema(description = "유저 ID", example = "1")
    private String userId;

    @Schema(description = "변경 여부", example = "true")
    private boolean isUpdated;
}
