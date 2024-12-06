package com.hearlers.gateway.presentations.rest.counselors.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "상담 채팅 전송 DTO")
public class CreateCounselMessageRequestDto {
    @Schema(description = "상담 메시지", example = "안녕? 나 힘들다...")
    private String message;
}
