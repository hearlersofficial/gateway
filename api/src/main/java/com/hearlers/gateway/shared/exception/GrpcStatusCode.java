package com.hearlers.gateway.shared.exception;

import io.grpc.Status;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum GrpcStatusCode {
    INVALID_ARGUMENT(HttpStatus.BAD_REQUEST, "E40001", "요청 형식이 올바르지 않습니다."),
    FAILED_PRECONDITION(HttpStatus.BAD_REQUEST, "E40002", "요청 처리 조건이 충족되지 않았습니다."),
    OUT_OF_RANGE(HttpStatus.BAD_REQUEST, "E40003", "요청 값이 허용 범위를 벗어났습니다."),
    UNAUTHENTICATED(HttpStatus.UNAUTHORIZED, "E40101", "인증이 필요합니다."),
    PERMISSION_DENIED(HttpStatus.FORBIDDEN, "E40301", "접근 권한이 없습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "E40401", "요청한 리소스를 찾을 수 없습니다."),
    ALREADY_EXISTS(HttpStatus.CONFLICT, "E40901", "이미 존재하는 리소스입니다."),
    RESOURCE_EXHAUSTED(HttpStatus.TOO_MANY_REQUESTS, "E42901", "요청 한도를 초과했습니다."),
    DEADLINE_EXCEEDED(HttpStatus.GATEWAY_TIMEOUT, "E50401", "요청 처리 시간이 초과되었습니다."),
    UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE, "E50301", "서비스를 일시적으로 사용할 수 없습니다."),
    UNIMPLEMENTED(HttpStatus.NOT_IMPLEMENTED, "E50101", "요청한 기능이 구현되지 않았습니다."),
    INTERNAL(HttpStatus.INTERNAL_SERVER_ERROR, "E50001", "서버 내부 오류가 발생했습니다."),
    UNKNOWN(HttpStatus.INTERNAL_SERVER_ERROR, "E50001", "서버 내부 오류가 발생했습니다."),
    DATA_LOSS(HttpStatus.INTERNAL_SERVER_ERROR, "E50001", "서버 내부 오류가 발생했습니다."),
    ABORTED(HttpStatus.INTERNAL_SERVER_ERROR, "E50001", "서버 내부 오류가 발생했습니다."),
    CANCELLED(HttpStatus.INTERNAL_SERVER_ERROR, "E50001", "서버 내부 오류가 발생했습니다.");

    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String errorDescription;

    public static GrpcStatusCode fromGrpcCode(Status.Code code) {
        try {
            return valueOf(code.name());
        } catch (IllegalArgumentException e) {
            return UNKNOWN;
        }
    }
}