package com.hearlers.gateway.presentations.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

public class ResponseDto {

    @Builder
    @Getter
    @Schema(description = "응답 성공 시 반환되는 DTO")
    public static class Success<D> {
        @Builder.Default
        @Schema(description = "응답 상태", example = "SUCCESS")
        private String status = "SUCCESS";

        @Schema(description = "메시지")
        private String message;

        @Schema(description = "데이터")
        private D data;
    }

    @Builder
    @Getter
    @Schema(description = "응답 실패 시 반환되는 DTO")
    public static class Error<D> {
        @Builder.Default
        @Schema(description = "응답 상태", example = "ERROR")
        private String status = "ERROR";

        @Schema(description = "에러 코드")
        private String code;

        @Schema(description = "메시지")
        private String message;

        @Schema(description = "데이터")
        private D data;
    }
}
