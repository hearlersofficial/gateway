package com.hearlers.gateway.presentation.rest.auth.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.AuthChannel;

import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateUserResponseDto {
    private String id;
    private String nickname;
    private AuthChannel authChannel;
    private UserProfile userProfile;
    private List<UserProgress> userProgresses;
    private Instant createdAt; // google.protobuf.Timestamp -> Instant
    private Instant updatedAt;
    private Instant deletedAt;
}
