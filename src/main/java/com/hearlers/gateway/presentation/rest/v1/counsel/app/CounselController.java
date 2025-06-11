package com.hearlers.gateway.presentation.rest.v1.counsel.app;

import com.hearlers.gateway.application.counseling.CounselService;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "상담", description = "상담 관련 API")
public class CounselController {

    private final CounselService counselService;
    private final CounselDtoMapper counselDtoMapper;

    // 상담 생성
    @Operation(summary = "상담 생성", description = "새로운 상담을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "상담 생성 성공"),
            @ApiResponse(responseCode = "400", description = "상담 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/counselors/{counselor-id}/counsels")
    public ResponseEntity<ResponseDto.Success<CounselDto.CreateCounselResponse>> createCounsel(
            @PathVariable("counselor-id") String counselorId,
            @RequestAttribute(value = "userId", required = false) String userId,
            @Valid @RequestBody CounselDto.CreateCounselRequest request) {
        var createCounselRequest = counselDtoMapper.toCreateCounselRequest(userId, counselorId, request);
        var counsel = counselService.createCounsel(createCounselRequest);
        var response = counselDtoMapper.toCreateCounselResponse(counsel);

        return ResponseDtoUtil.createdResponse(response, "상담 생성 성공");
    }

    @Operation(summary = "상담 목록 조회", description = "상담사 ID 또는 'all'을 입력하여 상담 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담 목록 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/counsels")
    public ResponseEntity<ResponseDto.Success<CounselDto.FindCounselsResponse>> getCounsels(
            @Parameter(
                    name = "counselor-id",
                    description = "상담사 ID 또는 'all' 입력 시 전체 조회",
                    example = "all"
            )
            @PathVariable("counselor-id") String counselorId,
            @RequestAttribute(value = "userId", required = false) String userId ) {
        String resolvedCounselorId = "all".equalsIgnoreCase(counselorId) ? null : counselorId;
        var findCounselsRequest = counselDtoMapper.toFindCounselsRequest(userId, resolvedCounselorId);
        var counsels = counselService.findCounsels(findCounselsRequest);
        var response = counselDtoMapper.toFindCounselsResponse(counsels);

        return ResponseDtoUtil.okResponse(response, "상담 목록 조회 성공");
    }


    // 상담 단건 조회
    @Operation(summary = "상담 단건 조회", description = "상담을 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/counsels/{counsel-id}")
    public ResponseEntity<ResponseDto.Success<CounselDto.FindCounselByIdResponse>> getCounsel(
            @PathVariable("counselor-id") String counselorId,
            @PathVariable("counsel-id") String counselId) {
        var findCounselByIdRequest = counselDtoMapper.toFindCounselByIdRequest(counselId);
        var counsel = counselService.findCounselById(findCounselByIdRequest);
        var response = counselDtoMapper.toFindCounselByIdResponse(counsel);

        return ResponseDtoUtil.okResponse(response, "상담 조회 성공");
    }

    // 메시지 생성
    @Operation(summary = "메시지 생성", description = "상담에 새로운 메시지를 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "메시지 생성 성공"),
            @ApiResponse(responseCode = "400", description = "메시지 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/counselors/{counselor-id}/counsels/{counsel-id}/messages")
    public ResponseEntity<ResponseDto.Success<CounselDto.CreateMessageResponse>> createMessage(
            @PathVariable("counselor-id") String counselorId,
            @PathVariable("counsel-id") String counselId,
            @Valid @RequestBody CounselDto.CreateMessageRequest request) {
        var createMessageRequest = counselDtoMapper.toCreateMessageRequest(counselId, request);
        var createMessageResponse = counselService.createMessage(createMessageRequest);
        var response = counselDtoMapper.toCreateMessageResponse(createMessageResponse);
        return ResponseDtoUtil.createdResponse(response, "메시지 생성 성공");
    }

    // 메시지 목록 조회
    @Operation(summary = "메시지 목록 조회", description = "상담의 메시지 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "메시지 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "메시지 목록 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/counsels/{counsel-id}/messages")
    public ResponseEntity<ResponseDto.Success<CounselDto.FindMessagesResponse>> getMessages(
            @PathVariable("counselor-id") String counselorId,
            @PathVariable("counsel-id") String counselId) {
        var findMessagesRequest = counselDtoMapper.toFindMessagesRequest(counselId);
        var counselMessages = counselService.findMessages(findMessagesRequest);
        var response = counselDtoMapper.toFindMessagesResponse(counselMessages);

        return ResponseDtoUtil.okResponse(response, "메시지 목록 조회 성공");
    }

    // 메시지 반응
    @Operation(summary = "메시지 반응", description = "메시지에 반응을 추가합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "메시지 반응 성공"),
            @ApiResponse(responseCode = "400", description = "메시지 반응 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/counselors/{counselor-id}/counsels/{counsel-id}/messages/{message-id}/react")
    public ResponseEntity<ResponseDto.Success<CounselDto.ReactMessageResponse>> reactMessage(
            @PathVariable("counselor-id") String counselorId,
            @PathVariable("counsel-id") String counselId,
            @PathVariable("message-id") String messageId,
            @Valid @RequestBody CounselDto.ReactMessageRequest request) {
        var reactMessageRequest = counselDtoMapper.toReactMessageRequest(messageId, request);
        var counselMessage = counselService.reactMessage(reactMessageRequest);
        var response = counselDtoMapper.toReactMessageResponse(counselMessage);

        return ResponseDtoUtil.okResponse(response, "메시지 반응 성공");
    }

    // 상담사와 유저의 관계 조회
    @Operation(summary = "상담사와 유저의 관계 조회", description = "상담사와 유저의 관계를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "관계 조회 성공"),
            @ApiResponse(responseCode = "400", description = "관계 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/relationships")
    public ResponseEntity<ResponseDto.Success<CounselDto.FindCounselorUserRelationshipsResponse>> getCounselorUserRelationships(
            @PathVariable("counselor-id") String counselorId,
            @RequestAttribute(value = "userId", required = false) String userId) {
        var findRelationshipsRequest = counselDtoMapper.toFindCounselorUserRelationshipsRequest(counselorId, userId);
        var relationships = counselService.findCounselorUserRelationships(findRelationshipsRequest);
        var response = counselDtoMapper.toFindCounselorUserRelationshipsResponse(relationships);

        return ResponseDtoUtil.okResponse(response, "관계 조회 성공");
    }
}
