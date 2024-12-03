package com.hearlers.gateway.presentations.rest.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.AuthChannel;
import java.time.Instant;
import java.util.List;
import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateUserResponseDto {
    private int id;
    private String nickname;
    private AuthChannel authChannel;
    private UserProfile userProfile;
    private List<UserProgress> userProgresses;
    private Instant createdAt; // google.protobuf.Timestamp -> Instant
    private Instant updatedAt;
    private Instant deletedAt;
}
