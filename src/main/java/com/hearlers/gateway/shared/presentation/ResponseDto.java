package com.hearlers.gateway.shared.presentation;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Schema(description = "응답 DTO")
public class ResponseDto {

    @Getter
    @Builder
    @JsonInclude(Include.NON_NULL)
    @Schema(description = "성공 응답 DTO")
    public static class Success<T> {
        @Schema(description = "성공 메시지", example = "요청이 성공적으로 처리되었습니다.")
        private String message;
        
        @Schema(description = "응답 데이터")
        private T data;
        
        @Schema(description = "응답 시간", example = "2024-07-01 14:30:45")
        private String timestamp;
    }

    @Getter
    @Builder
    @JsonInclude(Include.NON_NULL)
    @Schema(description = "에러 응답 DTO")
    public static class Error<T> {
        @Schema(description = "HTTP 상태 코드", example = "BAD_REQUEST")
        private HttpStatus status;
        
        @Schema(description = "에러 코드", example = "E40001")
        private String code;
        
        @Schema(description = "에러 메시지", example = "요청 처리 중 오류가 발생하였습니다.")
        private String message;
        
        @Schema(description = "상세 에러 정보")
        private List<String> details;
        
        @Schema(description = "추가 데이터")
        private T data;
        
        @Schema(description = "응답 시간", example = "2024-07-01 14:30:45")
        private String timestamp;
    }
}
