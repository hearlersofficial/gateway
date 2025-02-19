package com.hearlers.gateway.presentations.rest.counselors;

import com.hearlers.gateway.presentations.common.dto.ResponseDto;
import com.hearlers.gateway.presentations.rest.counselors.dto.CreateCounselMessageRequestDto;
import com.hearlers.gateway.presentations.rest.counselors.dto.CreateCounselRequestDto;
import com.hearlers.gateway.presentations.rest.counselors.dto.GetCounselorsResponseDto;
import com.hearlers.gateway.shared.enums.CounselorName;
import com.hearlers.gateway.shared.enums.CounselorType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counselors")
@Tag(name = "CounselorsController", description = "상담 관련 API, 추후 gRPC 서버에서 데이터 받아온 것 return 값으로 변경")
public class CounselorsController {

    @Operation(summary = "최초 상담 시작", description = "최초 상담 시작 API로 버블을 통해 입장 or 일반 입장 두 가지 케이스가 가능합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "최초 상담 시작 성공"),
            @ApiResponse(responseCode = "404", description = "상담사 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "400", description = "최초 상담 시작 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/{counselorId}/counsels")
    public void createCounsel(
            @PathVariable("counselorId") String counselorId,
            @Valid @RequestBody(required = false) CreateCounselRequestDto request) {
        // TODO : 내부 서버와 통신하여 최초 상담 시작
        // CounselorId를 바탕으로 조회

        // TODO return 타입 변경 -> ResponseEntity<List<CreateCounselResponseDto>>

    }

    @Operation(summary = "기존 진행중인 상담 입장", description = "기존에 진행중인 상담에 입장합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "기존 상담 조회 성공"),
            @ApiResponse(responseCode = "404", description = "상담사 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "400", description = "기존 상담 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/{counselorId}/counsels/{counselId}")
    public void getCounsel(
            @PathVariable("counselorId") String counselorId,
            @PathVariable("counselId") String counselId) {
        // TODO : 내부 서버와 통신하여 상담 재개 (counselorId와 counselId로 조회해서)
        // TODO return 타입 변경 -> ResponseEntity<List<GetCounselResponseDto>>
    }

    @Operation(summary = "채팅 전송", description = "상담 채팅방에서 채팅을 전송합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "채팅 전송 성공"),
            @ApiResponse(responseCode = "404", description = "상담사 혹은 상담 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "400", description = "채팅 전송 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "403", description = "상담 제한 도달", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/{counselorId}/counsels/{counselId}")
    public void createCounselMessage(
            @PathVariable("counselorId") String counselorId,
            @PathVariable("counselId") String counselId,
            @Valid @RequestBody CreateCounselMessageRequestDto request) {
        // TODO : 내부 서버와 통신하여 상담 메시지 전송
        // TODO return 타입 변경 -> ResponseEntity<List<CreateCounselMessageResponseDto>>
        // 상담 제한 도달 시 403 Forbidden 에러 반환해주기
    }

    @Operation(summary = "모든 상담사 정보 조회", description = "모든 상담사의 정보를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "모든 상담사 정보 조회 성공"),
            @ApiResponse(responseCode = "400", description = "모든 상담사 정보 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping
    public ResponseEntity<ResponseDto.Success<List<GetCounselorsResponseDto>>> getCounselors() {
        // TODO : 내부 서버와 통신하여 모든 상담사 정보 조회

        List<GetCounselorsResponseDto> counselors = new ArrayList<>();
        counselors.add(
                new GetCounselorsResponseDto("1", CounselorType.COUNSELOR_TYPE_DEPRESSION,
                        CounselorName.COUNSELOR_NAME_DAHYE, "Experienced counselor",
                        "Hello, I'm John",
                        "Option1", "Option2"));
        counselors.add(
                new GetCounselorsResponseDto("2", CounselorType.COUNSELOR_TYPE_ANXIETY,
                        CounselorName.COUNSELOR_NAME_JIHWAN, "Experienced counselor",
                        "Hello, I'm Jane",
                        "Option1", "Option2"));

        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        ResponseDto.Success.<List<GetCounselorsResponseDto>>builder()
                                .message("비로그인 유저 생성 성공")
                                .data(counselors)
                                .build()
                );
    }

    @Operation(summary = "상담 채팅 좋아요", description = "상담사의 채팅에 좋아요를 누릅니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "상담 채팅 좋아요 성공"),
            @ApiResponse(responseCode = "404", description = "상담사 혹은 상담 정보 혹은 메시지 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "400", description = "상담 채팅 좋아요 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/{counselorId}/counsels/{counselId}/messages/{messageId}/like")
    public void likeCounselMessage(
            @PathVariable("counselorId") String counselorId,
            @PathVariable("counselId") String counselId,
            @PathVariable("messageId") String messageId) {
        // TODO : 내부 서버와 통신하여 상담 메시지 좋아요
    }

    @Operation(summary = "상담 채팅 싫어요", description = "상담사의 채팅에 싫어요를 누릅니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "상담 채팅 싫어요 성공"),
            @ApiResponse(responseCode = "404", description = "상담사 혹은 상담 정보 혹은 메시지 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "400", description = "상담 채팅 싫어요 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/{counselorId}/counsels/{counselId}/messages/{messageId}/dislike")
    public void dislikeCounselMessage(
            @PathVariable("counselorId") String counselorId,
            @PathVariable("counselId") String counselId,
            @PathVariable("messageId") String messageId) {
        // TODO : 내부 서버와 통신하여 상담 메시지 싫어요
    }
}
