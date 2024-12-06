package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.applications.counsel.model.Counsel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "내 상담 리스트 조회 응답 DTO")
public class GetMyAllCounselsResponseDto {
    @Schema(description = "내 상담 리스트", example = "[{\"counselId\": 1, \"userId\": 1, \"lastMessage\": \"안녕하세요\", \"lastChattedAt\": \"2021-08-01\", \"createdAt\": \"2021-08-01\", \"updatedAt\": \"2021-08-01\", \"deletedAt\": null}]")
    private List<Counsel> counsel;
}
