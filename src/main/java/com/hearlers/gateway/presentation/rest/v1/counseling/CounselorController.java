package com.hearlers.gateway.presentation.rest.v1.counseling;

import com.hearlers.gateway.application.counseling.CounselorService;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.gateway.application.counseling.CounselPromptService;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
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

    private final CounselorService counselorService;
    private final CounselorDtoMapper counselorDtoMapper;


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
        var findEpisodeByIdRequest = counselorDtoMapper.toFindEpisodeByIdRequest(episodeId);
        var episode = counselorService.findEpisodeById(findEpisodeByIdRequest);
        var response = counselorDtoMapper.toFindEpisodeByIdResponse(episode);

        return ResponseDtoUtil.okResponse(response, "에피소드 조회 성공");
    }

    @Operation(summary = "에피소드 복수 조회", description = "에피소드를 복수 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 조회 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counselors/{counselor-id}/admin/episodes")
    public ResponseEntity<ResponseDto.Success<CounselorDto.FindEpisodesResponse>> getEpisodes(
            @PathVariable("counselor-id") String counselorId
    ) {
        var findEpisodesRequest = counselorDtoMapper.toFindEpisodesRequest(counselorId);
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
        var createEpisodeRequest = counselorDtoMapper.toCreateEpisodeRequest(request, counselorId);
        var episode = counselorService.createEpisode(createEpisodeRequest);
        var response = counselorDtoMapper.toCreateEpisodeResponse(episode);

        return ResponseDtoUtil.createdResponse(response, "에피소드 생성 성공");
    }

    @Operation(summary = "에피소드 업데이트", description = "기존 에피소드 정보를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "에피소드 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "에피소드 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "에피소드를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/counselors/{counselor-id}/admin/episodes/{episode-id}")
    public ResponseEntity<ResponseDto.Success<CounselorDto.UpdateEpisodeResponse>> updateEpisode(
            @PathVariable("episode-id") String episodeId,
            @PathVariable("counselor-id") String counselorId,
            @Valid @RequestBody CounselorDto.UpdateEpisodeRequest request) {
        var updateEpisodeRequest = counselorDtoMapper.toUpdateEpisodeRequest(episodeId, request);
        var episode = counselorService.updateEpisode(updateEpisodeRequest);
        var response = counselorDtoMapper.toUpdateEpisodeResponse(episode);

        return ResponseDtoUtil.okResponse(response, "에피소드 업데이트 성공");
    }
}
