package com.hearlers.gateway.presentation.rest.counseling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.gateway.application.counseling.CounselingService;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "상담 프롬프트", description = "상담 프롬프트 관련 API")
public class CounselingPromptsController {
    private final CounselingService counselingService;
    private final CounselingPromptDtoMapper counselingPromptDtoMapper;

    @SecurityRequirements
    @Operation(summary = "Context 목록 조회", description = "Context 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Context 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Context 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/contexts")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetContextsResponseDto>> getContexts(
            @Valid @RequestBody CounselingPromptDto.GetContextsRequestDto request) {
        var findContextsRequest = counselingPromptDtoMapper.of(request);
        var contexts = counselingService.findContexts(findContextsRequest);
        
        return ResponseEntity.ok(ResponseDtoUtil.success(
                counselingPromptDtoMapper.of(contexts),
                "Context 목록 조회 성공"));
    }

    @SecurityRequirements
    @Operation(summary = "Context 조회", description = "ID로 Context를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Context 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Context 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Context를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/contexts/{contextId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetContextByIdResponseDto>> getContext(
            @PathVariable String contextId) {
        var findContextByIdRequest = counselingPromptDtoMapper.of(contextId);
        var context = counselingService.findContextById(findContextByIdRequest);
        
        return ResponseEntity.ok(ResponseDtoUtil.success(
                counselingPromptDtoMapper.ofSingle(context),
                "Context 조회 성공"));
    }
    
    @SecurityRequirements
    @Operation(summary = "Context 생성", description = "새로운 Context를 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Context 생성 성공"),
            @ApiResponse(responseCode = "400", description = "Context 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/contexts")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.CreateContextResponseDto>> createContext(
            @Valid @RequestBody CounselingPromptDto.CreateContextRequestDto request) {
        var createContextRequest = counselingPromptDtoMapper.of(request);
        var createdContext = counselingService.createContext(createContextRequest);
        
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ResponseDtoUtil.success(
                        counselingPromptDtoMapper.of(createdContext, true),
                        "Context 생성 성공"));
    }
    
    @SecurityRequirements
    @Operation(summary = "Context 업데이트", description = "기존 Context를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Context 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "Context 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Context를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/contexts/{contextId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.UpdateContextResponseDto>> updateContext(
            @PathVariable String contextId,
            @Valid @RequestBody CounselingPromptDto.UpdateContextRequestDto request) {
        
        var updateContextRequest = counselingPromptDtoMapper.of(request, contextId);
        var updatedContext = counselingService.updateContext(updateContextRequest);
        
        return ResponseEntity.ok(ResponseDtoUtil.success(
                counselingPromptDtoMapper.ofUpdate(updatedContext),
                "Context 업데이트 성공"));
    }
}
