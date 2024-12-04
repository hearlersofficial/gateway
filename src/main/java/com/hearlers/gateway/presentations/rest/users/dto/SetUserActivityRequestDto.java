package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.shared.enums.ActivityType;
import com.hearlers.gateway.shared.enums.DevicePlatform;
import java.util.Map;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class SetUserActivityRequestDto {
    private ActivityType activityType;
    private Map<String, Object> activityData;
    private DevicePlatform platform;
    private int durationSeconds;
}
