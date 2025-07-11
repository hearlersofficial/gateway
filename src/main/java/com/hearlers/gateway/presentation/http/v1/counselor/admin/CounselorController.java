package com.hearlers.gateway.presentation.http.v1.counselor.admin;

import com.hearlers.gateway.application.counselor.CounselorService;

import org.mapstruct.factory.Mappers;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController("v1CounselorAdminController")
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "어드민/상담사", description = "상담사 관련 API")
public class CounselorController {

    private final CounselorService counselorService;
    CounselorDtoMapper counselorDtoMapper = Mappers.getMapper(CounselorDtoMapper.class);

    @Operation(summary = "상담사 단건 조회", description = "상담사를 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counselors/{counselor-id}")
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
    @GetMapping("/v1/admin/counselors")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindCounselorsResponse>> getCounselors(@Valid @ParameterObject CounselorDto.FindCounselorsRequest request) {
        var findCounselorsRequest = counselorDtoMapper.toFindCounselorsRequest(request);
        var counselors = counselorService.findCounselors(findCounselorsRequest);
        var response = counselorDtoMapper.toFindCounselorsResponse(counselors);

        return ResponseDtoUtil.okResponse(response, "상담사 조회 성공");
    }

    @Operation(summary = "상담사 생성", description = "새로운 상담사를 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "상담사 생성 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counselors")
    public ResponseEntity<ResponseDto.Success<CounselorDto.CreateCounselorResponse>> createCounselor(
            @Valid @RequestBody CounselorDto.CreateCounselorRequest request) {
        var createCounselorRequest = counselorDtoMapper.toCreateCounselorRequest(request);
        var counselor = counselorService.createCounselor(createCounselorRequest);
        var response = counselorDtoMapper.toCreateCounselorResponse(counselor);

        return ResponseDtoUtil.createdResponse(response, "상담사 생성 성공");
    }

    @Operation(summary = "상담사 업데이트", description = "기존 상담사 정보를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "상담사를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/counselors/{counselor-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.UpdateCounselorResponse>> updateCounselor(
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.UpdateCounselorRequest request) {
        var updateCounselorRequest = counselorDtoMapper.toUpdateCounselorRequest(counselorId, request);
        var counselor = counselorService.updateCounselor(updateCounselorRequest);
        var response = counselorDtoMapper.toUpdateCounselorResponse(counselor);

        return ResponseDtoUtil.okResponse(response, "상담사 업데이트 성공");
    }

    @Operation(summary = "톤 단건 조회", description = "톤을 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 조회 성공"),
            @ApiResponse(responseCode = "400", description = "톤 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/tones/{tone-id}")
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
    @GetMapping("/v1/admin/tones")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindTonesResponse>> getTones(@Valid @ParameterObject CounselorDto.FindTonesRequest request) {
        var findTonesRequest = counselorDtoMapper.toFindTonesRequest(request);
        var tones = counselorService.findTones(findTonesRequest);
        var response = counselorDtoMapper.toFindTonesResponse(tones);
        return ResponseDtoUtil.okResponse(response, "톤 조회 성공");
    }

    @Operation(summary = "톤 생성", description = "새로운 톤을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "톤 생성 성공"),
            @ApiResponse(responseCode = "400", description = "톤 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/tones")
    public ResponseEntity<ResponseDto.Success<CounselorDto.CreateToneResponse>> createTone(
            @Valid @RequestBody CounselorDto.CreateToneRequest request) {
        var createToneRequest = counselorDtoMapper.toCreateToneRequest(request);
        var tone = counselorService.createTone(createToneRequest);
        var response = counselorDtoMapper.toCreateToneResponse(tone);

        return ResponseDtoUtil.createdResponse(response, "톤 생성 성공");
    }

    @Operation(summary = "톤 업데이트", description = "기존 톤 정보를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "톤 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "톤 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "톤을 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/tones/{tone-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.UpdateToneResponse>> updateTone(
            @PathVariable("tone-id") String toneId,
            @Valid @RequestBody CounselorDto.UpdateToneRequest request) {
        var updateToneRequest = counselorDtoMapper.toUpdateToneRequest(toneId, request);
        var tone = counselorService.updateTone(updateToneRequest);
        var response = counselorDtoMapper.toUpdateToneResponse(tone);

        return ResponseDtoUtil.okResponse(response, "톤 업데이트 성공");
    }

    @Operation(summary = "상담사 이미지 URL 생성", description = "상담사 이미지 업로드를 위한 Presigned URL을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "이미지 URL 생성 성공"),
            @ApiResponse(responseCode = "400", description = "이미지 URL 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counselors/{counselor-id}/image-url")
    public ResponseEntity<ResponseDto.Success<CounselorDto.GenerateCounselorImageUrlResponse>> generateCounselorImageUrl(
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.GenerateCounselorImageUrlRequest request) {
        var generateCounselorImageUrlRequest = counselorDtoMapper.toGenerateCounselorImageUrlRequest(request, counselorId);
        var presignedUrl = counselorService.generateCounselorImageUrl(generateCounselorImageUrlRequest);
        var response = counselorDtoMapper.toGenerateCounselorImageUrlResponse(presignedUrl);

        return ResponseDtoUtil.okResponse(response, "상담사 이미지 URL 생성 성공");
    }

    @Operation(summary = "컷신 이미지 URL 생성", description = "컷신 이미지 업로드를 위한 Presigned URL을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "이미지 URL 생성 성공"),
            @ApiResponse(responseCode = "400", description = "이미지 URL 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counselors/{counselor-id}/episodes/{episode-id}/image-url")
    public ResponseEntity<ResponseDto.Success<CounselorDto.GenerateCutSceneImageUrlResponse>> generateCutSceneImageUrl(
            @PathVariable("episode-id") String episodeId,
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.GenerateCutSceneImageUrlRequest request) {
        var generateCutSceneImageUrlRequest = counselorDtoMapper.toGenerateCutSceneImageUrlRequest(request, episodeId);
        var presignedUrl = counselorService.generateCutSceneImageUrl(generateCutSceneImageUrlRequest);
        var response = counselorDtoMapper.toGenerateCutSceneImageUrlResponse(presignedUrl);

        return ResponseDtoUtil.okResponse(response, "컷신 이미지 URL 생성 성공");
    }

    @Operation(summary = "에피소드 단건 조회", description = "에피소드를 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 조회 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counselors/{counselor-id}/episodes/{episode-id}")
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
    @GetMapping("/v1/admin/counselors/{counselor-id}/episodes")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindEpisodesResponse>> getEpisodes(
            @PathVariable("counselor-id") String counselorId
    ) {
        var withTemporary = true;
        var findEpisodesRequest = counselorDtoMapper.toFindEpisodesRequest(counselorId, withTemporary);
        var episodes = counselorService.findEpisodes(findEpisodesRequest);
        var response = counselorDtoMapper.toFindEpisodesResponse(episodes);

        return ResponseDtoUtil.okResponse(response, "에피소드 조회 성공");
    }

    @Operation(summary = "에피소드 생성", description = "새로운 에피소드를 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "에피소드 생성 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counselors/{counselor-id}/episodes")
    public ResponseEntity<ResponseDto.Success<CounselorDto.CreateEpisodeResponse>> createEpisode(
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.CreateEpisodeRequest request) {
        var createEpisodeRequest = counselorDtoMapper.toCreateEpisodeRequest(counselorId, request);
        var episode = counselorService.createEpisode(createEpisodeRequest);
        var response = counselorDtoMapper.toCreateEpisodeResponse(episode);

        return ResponseDtoUtil.createdResponse(response, "에피소드 생성 성공");
    }

    @Operation(
            summary = "에피소드 업데이트",
            description = """
    기존 에피소드 정보를 업데이트합니다. 만약 컷씬을 업데이트하려면, 해당 컷씬의 ID를 포함해야 합니다. ID가 없는 경우, 새로운 컷씬이 생성됩니다.
    만약 기존에 존재하는 컷씬을 포함하지 않으면, 해당 컷씬은 삭제됩니다.
    """)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "에피소드를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/counselors/{counselor-id}/episodes/{episode-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.UpdateEpisodeResponse>> updateEpisode(
            @PathVariable("episode-id") String episodeId,
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.UpdateEpisodeRequest request) {
        var updateEpisodeRequest = counselorDtoMapper.toUpdateEpisodeRequest(episodeId, request);
        var episode = counselorService.updateEpisode(updateEpisodeRequest);
        var response = counselorDtoMapper.toUpdateEpisodeResponse(episode);

        return ResponseDtoUtil.okResponse(response, "에피소드 업데이트 성공");
    }

    @Operation(summary = "버블 생성", description = "새로운 버블을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "버블 생성 성공"),
            @ApiResponse(responseCode = "400", description = "버블 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "상담사를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counselors/{counselor-id}/bubbles")
    public ResponseEntity<ResponseDto.Success<CounselorDto.CreateBubbleResponse>> createBubble(
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.CreateBubbleRequest request) {
        var createBubbleRequest = counselorDtoMapper.toCreateBubbleRequest(counselorId, request);
        var bubble = counselorService.createBubble(createBubbleRequest);
        var response = counselorDtoMapper.toCreateBubbleResponse(bubble);
        return ResponseDtoUtil.createdResponse(response, "버블 생성 성공");
    }

    @Operation(summary = "버블 업데이트", description = "기존 버블 정보를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "버블 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "버블 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "버블을 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/counselors/{counselor-id}/bubbles/{bubble-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.UpdateBubbleResponse>> updateBubble(
            @PathVariable("bubble-id") String bubbleId,
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.UpdateBubbleRequest request) {
        var updateBubbleRequest = counselorDtoMapper.toUpdateBubbleRequest(counselorId, bubbleId, request);
        var bubble = counselorService.updateBubble(updateBubbleRequest);
        var response = counselorDtoMapper.toUpdateBubbleResponse(bubble);
        return ResponseDtoUtil.okResponse(response, "버블 업데이트 성공");
    }


    @Operation(summary = "버블 단건 조회", description = "버블을 단건 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담사 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담사 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counselors/{counselor-id}/bubbles/{bubble-id}")
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
    @GetMapping("/v1/admin/counselors/{counselor-id}/bubbles/random")
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
    @GetMapping("/v1/admin/counselors/{counselor-id}/bubbles")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindBubblesResponse>> getBubbles(
            @PathVariable("counselor-id") String counselorId
    ) {
        var findBubblesRequest = counselorDtoMapper.toFindBubblesRequest(counselorId);
        var bubbles = counselorService.findBubbles(findBubblesRequest);
        var response = counselorDtoMapper.toFindBubblesResponse(bubbles);
        return ResponseDtoUtil.okResponse(response, "버블 조회 성공");
    }



}
