package com.hearlers.gateway.presentation.rest.counseling;

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
        var response = counselingPromptDtoMapper.of(contexts);
        
        return ResponseDtoUtil.okResponse(response, "Context 목록 조회 성공");
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
        
        return ResponseDtoUtil.okResponse(
                counselingPromptDtoMapper.ofSingle(context),
                "Context 조회 성공");
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
        
        return ResponseDtoUtil.createdResponse(
                counselingPromptDtoMapper.of(createdContext, true),
                "Context 생성 성공");
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
        var response = counselingPromptDtoMapper.ofUpdate(updatedContext);

        return ResponseDtoUtil.okResponse(response, "Context 업데이트 성공");
    }

    @SecurityRequirements
    @Operation(summary = "Tone 목록 조회", description = "Tone 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/tones")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetTonesResponseDto>> getTones(
            @Valid CounselingPromptDto.GetTonesRequestDto request) {
        var findTonesRequest = counselingPromptDtoMapper.ofTones(request);
        var tones = counselingService.findTones(findTonesRequest);
        var response = counselingPromptDtoMapper.ofTones(tones);
        
        return ResponseDtoUtil.okResponse(response, "Tone 목록 조회 성공");
    }

    @SecurityRequirements
    @Operation(summary = "Tone 조회", description = "ID로 Tone을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Tone을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/tones/{toneId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetToneByIdResponseDto>> getTone(
            @PathVariable String toneId) {
        var findToneByIdRequest = counselingPromptDtoMapper.ofTone(toneId);
        var tone = counselingService.findToneById(findToneByIdRequest);
        var response = counselingPromptDtoMapper.ofToneSingle(tone);
        
        return ResponseDtoUtil.okResponse(response, "Tone 조회 성공");
    }

    @SecurityRequirements
    @Operation(summary = "Tone 생성", description = "새로운 Tone을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Tone 생성 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/tones")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.CreateToneResponseDto>> createTone(
            @Valid @RequestBody CounselingPromptDto.CreateToneRequestDto request) {
        var createToneRequest = counselingPromptDtoMapper.of(request);
        var createdTone = counselingService.createTone(createToneRequest);
        var response = counselingPromptDtoMapper.ofCreate(createdTone);
        
        return ResponseDtoUtil.createdResponse(response, "Tone 생성 성공");
    }

    @SecurityRequirements
    @Operation(summary = "Tone 업데이트", description = "기존 Tone을 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Tone을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/tones/{toneId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.UpdateToneResponseDto>> updateTone(
            @PathVariable String toneId,
            @Valid @RequestBody CounselingPromptDto.UpdateToneRequestDto request) {
        
        var updateToneRequest = counselingPromptDtoMapper.of(request, toneId);
        var updatedTone = counselingService.updateTone(updateToneRequest);
        var response = counselingPromptDtoMapper.ofToneUpdate(updatedTone);
        
        return ResponseDtoUtil.okResponse(response, "Tone 업데이트 성공");
    }

    @SecurityRequirements
    @Operation(summary = "InstructionItem 목록 조회", description = "InstructionItem 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "InstructionItem 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "InstructionItem 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/instruction-items")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetInstructionItemsResponseDto>> getInstructionItems(
            @Valid CounselingPromptDto.GetInstructionItemsRequestDto request) {
        var findInstructionItemsRequest = counselingPromptDtoMapper.ofInstructions(request);
        var instructionItems = counselingService.findInstructionItems(findInstructionItemsRequest);
        var response = counselingPromptDtoMapper.ofInstructions(instructionItems);
        
        return ResponseDtoUtil.okResponse(response, "InstructionItem 목록 조회 성공");
    }

    @SecurityRequirements
    @Operation(summary = "InstructionItem 조회", description = "ID로 InstructionItem을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "InstructionItem 조회 성공"),
            @ApiResponse(responseCode = "400", description = "InstructionItem 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "InstructionItem을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/instruction-items/{instructionItemId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetInstructionItemByIdResponseDto>> getInstructionItem(
            @PathVariable String instructionItemId) {
        var findInstructionItemByIdRequest = counselingPromptDtoMapper.ofInstruction(instructionItemId);
        var instructionItem = counselingService.findInstructionItemById(findInstructionItemByIdRequest);
        var response = counselingPromptDtoMapper.ofInstructionSingle(instructionItem);
        
        return ResponseDtoUtil.okResponse(response, "InstructionItem 조회 성공");
    }

    @SecurityRequirements
    @Operation(summary = "InstructionItem 생성", description = "새로운 InstructionItem을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "InstructionItem 생성 성공"),
            @ApiResponse(responseCode = "400", description = "InstructionItem 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/instruction-items")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.CreateInstructionItemResponseDto>> createInstructionItem(
            @Valid @RequestBody CounselingPromptDto.CreateInstructionItemRequestDto request) {
        var createInstructionItemRequest = counselingPromptDtoMapper.ofInstruction(request);
        var createdInstructionItem = counselingService.createInstructionItem(createInstructionItemRequest);
        var response = counselingPromptDtoMapper.ofInstructionCreate(createdInstructionItem);
        
        return ResponseDtoUtil.createdResponse(response, "InstructionItem 생성 성공");
    }

    @SecurityRequirements
    @Operation(summary = "InstructionItem 업데이트", description = "기존 InstructionItem을 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "InstructionItem 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "InstructionItem 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "InstructionItem을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/instruction-items/{instructionItemId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.UpdateInstructionItemResponseDto>> updateInstructionItem(
            @PathVariable String instructionItemId,
            @Valid @RequestBody CounselingPromptDto.UpdateInstructionItemRequestDto request) {
        
        var updateInstructionItemRequest = counselingPromptDtoMapper.ofInstructionUpdate(request, instructionItemId);
        var updatedInstructionItem = counselingService.updateInstructionItem(updateInstructionItemRequest);
        var response = counselingPromptDtoMapper.ofInstructionUpdate(updatedInstructionItem);
        
        return ResponseDtoUtil.okResponse(response, "InstructionItem 업데이트 성공");
    }
}
