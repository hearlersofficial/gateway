package com.hearlers.gateway.shared.presentation;

import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

public class ResponseDto {

    @Builder
    @Getter
    @Schema(description = "응답 성공 시 반환되는 DTO")
    public static class Success<T> {
        @Builder.Default
        @Schema(description = "응답 상태", example = "SUCCESS")
        private final String status = "SUCCESS";

        @Schema(description = "메시지")
        private final String message;

        @Schema(description = "데이터")
        private final T data;
    }

    @Builder
    @Getter
    @Schema(description = "응답 실패 시 반환되는 DTO")
    public static class Error<T> {
        @Schema(description = "응답 상태", example = "ERROR")
        private final HttpStatus status;

        @Schema(description = "에러 코드")
        private final String code;

        @Schema(description = "메시지")
        private final String message;

        @Schema(description = "데이터")
        private final T data;
    }
}
