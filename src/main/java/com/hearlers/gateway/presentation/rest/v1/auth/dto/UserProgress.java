package com.hearlers.gateway.presentation.rest.v1.auth.dto;

import java.time.Instant;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.ProgressStatus;
import com.hearlers.gateway.shared.enums.ProgressType;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserProgress {
    private ProgressType progressType;
    private ProgressStatus progressStatus;
    private Instant lastUpdated;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
