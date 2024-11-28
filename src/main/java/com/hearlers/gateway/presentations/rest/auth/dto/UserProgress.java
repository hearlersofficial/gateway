package com.hearlers.gateway.presentations.rest.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.presentations.rest.auth.enums.ProgressStatus;
import com.hearlers.gateway.presentations.rest.auth.enums.ProgressType;
import java.time.Instant;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserProgress {
    private ProgressType progressType;
    private ProgressStatus progressStatus;
    private Instant lastUpdated;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
