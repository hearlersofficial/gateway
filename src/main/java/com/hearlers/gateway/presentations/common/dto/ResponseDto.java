package com.hearlers.gateway.presentations.common.dto;

import lombok.Builder;

public class ResponseDto {

    @Builder
    public static class Success {
        @Builder.Default
        private String status = "SUCCESS";

        private String message;

        private Object data;
    }

    @Builder
    public static class Error {
        @Builder.Default
        private String status = "ERROR";

        private String code;

        private String message;

        private Object data;
    }
}
