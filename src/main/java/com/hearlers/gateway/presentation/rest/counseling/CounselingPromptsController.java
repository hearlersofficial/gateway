package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.gateway.application.counseling.CounselingService;
import com.hearlers.gateway.presentation.rest.dto.ResponseDto;

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
@RequestMapping("counseling")
@RequiredArgsConstructor
@Tag(name = "CounselingPromptsController", description = "상담 관련 API, 추후 gRPC 서버에서 데이터 받아온 것 return 값으로 변경")
public class CounselingPromptsController {
    private final CounselingService counselingService;
    private final CounselingPromptDtoMapper counselingPromptDtoMapper;

    // @SecurityRequirements
    @Operation(summary = "상담 프롬프트 조회", description = "상담 프롬프트를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "상담 프롬프트 조회 성공"),
            @ApiResponse(responseCode = "400", description = "상담 프롬프트 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/prompts")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetContextsResponseDto>> getContexts(@Valid @RequestBody CounselingPromptDto.GetContextsRequestDto request) {
        FindContextsRequest findContextsRequest = counselingPromptDtoMapper.of(request);
        List<Context> contexts = counselingService.findContexts(findContextsRequest);
        List<CounselingPromptDto.ContextResponseDto> contextResponseDtos = contexts.stream()
                .map(counselingPromptDtoMapper::of)
                .collect(Collectors.toList());
        CounselingPromptDto.GetContextsResponseDto response = new CounselingPromptDto.GetContextsResponseDto();
        response.setContexts(contextResponseDtos);
        ResponseDto.Success<CounselingPromptDto.GetContextsResponseDto> responseDto = ResponseDto.Success.<CounselingPromptDto.GetContextsResponseDto>builder()
                .message("상담 프롬프트 조회 성공")
                .data(response)
                .build();
        return ResponseEntity.ok(responseDto);
    }

}
