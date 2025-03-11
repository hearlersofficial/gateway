package com.hearlers.gateway.presentation.rest.users.dto;

import java.util.List;

import com.hearlers.gateway.application.counsel.model.Counsel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "내 상담 리스트 조회 응답 DTO")
public class GetMyAllCounselsResponseDto {
    @Schema(description = "내 상담 리스트", example = "[{\"counselId\": 1, \"userId\": 1, \"lastMessage\": \"안녕하세요\", \"lastChattedAt\": \"2021-08-01\", \"createdAt\": \"2021-08-01\", \"updatedAt\": \"2021-08-01\", \"deletedAt\": null}]")
    private List<Counsel> counsel;
}
