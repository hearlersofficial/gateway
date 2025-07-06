package com.hearlers.gateway.presentation.http.v1.counselor.app;

import com.hearlers.gateway.application.counselor.CounselorService;
import com.hearlers.gateway.shared.response.ResponseDto;
import com.hearlers.gateway.shared.response.ResponseDtoUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("v1CounselorAppController")
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "앱/상담사", description = "상담사 관련 API")
public class CounselorController {

    private final CounselorService counselorService;
    CounselorDtoMapper counselorDtoMapper = Mappers.getMapper(CounselorDtoMapper.class);

    @Operation(summary = "상담사 단건 조회", description = "상담사를 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindCounselorByIdResponse>> getCounselor(@PathVariable("counselor-id") String counselorId) {
        var findCounselorByIdRequest = counselorDtoMapper.toFindCounselorRequest(counselorId);
        var counselor = counselorService.findCounselorById(findCounselorByIdRequest);
        var response = counselorDtoMapper.toFindCounselorResponse(counselor);

        return ResponseDtoUtil.okResponse(response, "상담사 조회 성공");
    }


    @Operation(summary = "상담사 복수 조회", description = "상담사를 복수 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindCounselorsResponse>> getCounselors(@Valid @ParameterObject CounselorDto.FindCounselorsRequest request) {
        var findCounselorsRequest = counselorDtoMapper.toFindCounselorsRequest(request);
        var counselors = counselorService.findCounselors(findCounselorsRequest);
        var response = counselorDtoMapper.toFindCounselorsResponse(counselors);

        return ResponseDtoUtil.okResponse(response, "상담사 조회 성공");
    }


    @Operation(summary = "톤 단건 조회", description = "톤을 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 조회 성공"),
            @ApiResponse(responseCode = "400", description = "톤 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/tones/{tone-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindToneByIdResponse>> getTone(@PathVariable("tone-id") String toneId) {
        var findToneByIdRequest = counselorDtoMapper.toFindToneRequest(toneId);
        var tone = counselorService.findToneById(findToneByIdRequest);
        var response = counselorDtoMapper.toFindToneResponse(tone);
        return ResponseDtoUtil.okResponse(response, "톤 조회 성공");
    }

    @Operation(summary = "톤 복수 조회", description = "톤을 복수 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 조회 성공"),
            @ApiResponse(responseCode = "400", description = "톤 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/tones")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindTonesResponse>> getTones(@Valid @ParameterObject CounselorDto.FindTonesRequest request) {
        var findTonesRequest = counselorDtoMapper.toFindTonesRequest(request);
        var tones = counselorService.findTones(findTonesRequest);
        var response = counselorDtoMapper.toFindTonesResponse(tones);
        return ResponseDtoUtil.okResponse(response, "톤 조회 성공");
    }

    @Operation(summary = "에피소드 단건 조회", description = "에피소드를 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 조회 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/episodes/{episode-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindEpisodeByIdResponse>> getEpisode(
            @PathVariable("episode-id") String episodeId,
            @PathVariable("counselor-id") String counselorId
    ) {
        var withTemporary = true; // Assuming this is a placeholder for any additional parameters needed
        var findEpisodeByIdRequest = counselorDtoMapper.toFindEpisodeByIdRequest(episodeId, withTemporary);
        var episode = counselorService.findEpisodeById(findEpisodeByIdRequest);
        var response = counselorDtoMapper.toFindEpisodeByIdResponse(episode);

        return ResponseDtoUtil.okResponse(response, "에피소드 조회 성공");
    }

    @Operation(summary = "에피소드 복수 조회", description = "에피소드를 복수 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 조회 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/episodes")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindEpisodesResponse>> getEpisodes(
            @PathVariable("counselor-id") String counselorId
    ) {
        var withTemporary = true;
        var findEpisodesRequest = counselorDtoMapper.toFindEpisodesRequest(counselorId, withTemporary);
        var episodes = counselorService.findEpisodes(findEpisodesRequest);
        var response = counselorDtoMapper.toFindEpisodesResponse(episodes);

        return ResponseDtoUtil.okResponse(response, "에피소드 조회 성공");
    }

    @Operation(summary = "버블 단건 조회", description = "버블을 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/bubbles/{bubble-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindBubbleByIdResponse>> getCounselor(
            @PathVariable("bubble-id") String bubbleId,
            @PathVariable("counselor-id") String counselorId
    ) {
        var findBubbleByIdRequest = counselorDtoMapper.toFindBubbleByIdRequest(counselorId, bubbleId);
        var bubble = counselorService.findBubbleById(findBubbleByIdRequest);
        var response = counselorDtoMapper.toFindBubbleByIdResponse(bubble);
        return ResponseDtoUtil.okResponse(response, "상담사 조회 성공");
    }

    @Operation(summary = "버블 랜덤 조회", description = "버블을 랜덤으로 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "버블 랜덤 조회 성공"),
            @ApiResponse(responseCode = "400", description = "버블 랜덤 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/bubbles/random")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindBubbleByIdResponse>> getRandomBubble(
            @PathVariable("counselor-id") String counselorId
    ) {
        var findRandomBubbleRequest = counselorDtoMapper.toFindRandomBubbleRequest(counselorId);
        var bubble = counselorService.findRandomBubble(findRandomBubbleRequest);
        var response = counselorDtoMapper.toFindBubbleByIdResponse(bubble);
        return ResponseDtoUtil.okResponse(response, "버블 랜덤 조회 성공");
    }

    @Operation(summary = "버블 복수 조회", description = "버블을 복수 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "버블 조회 성공"),
            @ApiResponse(responseCode = "400", description = "버블 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/counselors/{counselor-id}/bubbles")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindBubblesResponse>> getBubbles(
            @PathVariable("counselor-id") String counselorId
    ) {
        var findBubblesRequest = counselorDtoMapper.toFindBubblesRequest(counselorId);
        var bubbles = counselorService.findBubbles(findBubblesRequest);
        var response = counselorDtoMapper.toFindBubblesResponse(bubbles);
        return ResponseDtoUtil.okResponse(response, "버블 조회 성공");
    }
}
