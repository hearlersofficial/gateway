package com.hearlers.gateway.presentation.rest.v1.counseling;

import com.hearlers.gateway.application.counseling.CounselorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.gateway.application.counseling.CounselPromptService;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "상담사", description = "상담사 관련 API")
public class CounselorController {

    private final CounselPromptService counselPromptService;
    private final CounselorService counselorService;
    private final CounselorDtoMapper counselorDtoMapper;
    


    @Operation(summary = "상담사 조회", description = "상담사를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindCounselorsResponse>> getCounselors(@Valid @RequestBody CounselorDto.FindCounselorsRequest request) {
        var findCounselorsRequest = counselorDtoMapper.of(request);
        var counselors = counselorService.findCounselors(findCounselorsRequest);
        var response = counselorDtoMapper.ofGetCounselors(counselors);

        return ResponseDtoUtil.okResponse(response, "상담사 조회 성공");
    }
//     @Operation(summary = "채팅 전송", description = "상담 채팅방에서 채팅을 전송합니다.")
//     @ApiResponses(value = {
//             @ApiResponse(responseCode = "201", description = "채팅 전송 성공"),
//             @ApiResponse(responseCode = "404", description = "상담사 혹은 상담 정보 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
//             @ApiResponse(responseCode = "400", description = "채팅 전송 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
//             @ApiResponse(responseCode = "403", description = "상담 제한 도달", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
//     })
//     @PostMapping("/v1/{counselorId}/counsels/{counselId}")
//     public void createCounselMessage(
//             @PathVariable("counselorId") String counselorId,
//             @PathVariable("counselId") String counselId,
//             @Valid @RequestBody CreateCounselMessageRequestDto request) {
//         // TODO : 내부 서버와 통신하여 상담 메시지 전송
//         // TODO return 타입 변경 -> ResponseEntity<List<CreateCounselMessageResponseDto>>
//         // 상담 제한 도달 시 403 Forbidden 에러 반환해주기
//     }

//     @Operation(summary = "모든 상담사 정보 조회", description = "모든 상담사의 정보를 조회합니다.")
//     @ApiResponses(value = {
//             @ApiResponse(responseCode = "200", description = "모든 상담사 정보 조회 성공"),
//             @ApiResponse(responseCode = "400", description = "모든 상담사 정보 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
//     })
//     @GetMapping("/v1")
//     public ResponseEntity<ResponseDto.Success> getCounselors() {
//         // TODO : 내부 서버와 통신하여 모든 상담사 정보 조회

//         List<GetCounselorsResponseDto> counselors = new ArrayList<>();
//         counselors.add(
//                 new GetCounselorsResponseDto("1", CounselorType.COUNSELOR_TYPE_DEPRESSION,
//                         CounselorName.COUNSELOR_NAME_DAHYE, "Experienced counselor",
//                         "Hello, I'm John",
//                         "Option1", "Option2"));
//         counselors.add(
//                 new GetCounselorsResponseDto("2", CounselorType.COUNSELOR_TYPE_ANXIETY,
//                         CounselorName.COUNSELOR_NAME_JIHWAN, "Experienced counselor",
//                         "Hello, I'm Jane",
//                         "Option1", "Option2"));

//         return ResponseEntity.status(HttpStatus.OK)
//                 .body(
//                         ResponseDto.Success.builder()
//                                 .message("비로그인 유저 생성 성공")
//                                 .data(counselors)
//                                 .build()
//                 );
//     }

   
}
