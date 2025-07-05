package com.hearlers.gateway.presentation.http.v1.users.dto;

import java.util.Map;

import com.hearlers.gateway.shared.enums.ActivityType;
import com.hearlers.gateway.shared.enums.DevicePlatform;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Schema(description = "사용자 활동 생성 요청 DTO")
public class CreateUserActivityRequestDto {
    @NotNull(message = "활동 타입은 필수 입력 항목입니다.")
    @Schema(description = "활동 타입", example = "ACTIVITY_TYPE_SET_CONVERSATION_PREFERENCE")
    private ActivityType activityType;

    @NotNull(message = "활동 데이터는 필수 입력 항목입니다.")
    @Schema(description = "활동 데이터", example = "{\"conversationPreference\": \"아무일 없다는 듯 가벼운 일상적 대화\"}")
    private Map<String, Object> activityData;

    @NotNull(message = "접속 플랫폼은 필수 입력 항목입니다.")
    @Schema(description = "접속 플랫폼", example = "ANDROID")
    private DevicePlatform platform;

    @Schema(description = "활동 지속 시간(초)", example = "10", nullable = true)
    private Integer durationSeconds;
}
