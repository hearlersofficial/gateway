package com.hearlers.gateway.presentation.rest.counselors.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
@Schema(description = "상담 채팅 전송 DTO")
public class CreateCounselMessageRequestDto {
    @NotBlank(message = "상담 메시지는 필수 입력 항목입니다.")
    @Schema(description = "상담 메시지", example = "안녕? 나 힘들다...")
    private String message;
}
