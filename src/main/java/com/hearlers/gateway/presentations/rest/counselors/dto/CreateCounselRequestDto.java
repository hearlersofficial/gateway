package com.hearlers.gateway.presentations.rest.counselors.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

// Bubble 입장 시 DTO
@Schema(description = "최초 상담 시작 요청 DTO (Optional)")
@Getter
public class CreateCounselRequestDto {
    @NotBlank(message = "상담 시작 메시지는 필수 입력 항목입니다.")
    @Schema(description = "상담 시작 메시지", example = "나는 이것저것 고민이 많아서 어제 밤잠을 설쳤어. 너는 어때? 어제 잠은 푹 잤어?")
    private String introMessage;

    @NotBlank(message = "상담 시작 응답은 필수 입력 항목입니다.")
    @Schema(description = "introMessage에 대한 응답", example = "나도 어제 잘 못 잤어.")
    private String response;
}
