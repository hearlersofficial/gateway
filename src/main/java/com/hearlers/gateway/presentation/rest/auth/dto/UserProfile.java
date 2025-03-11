package com.hearlers.gateway.presentation.rest.auth.dto;

import java.time.Instant;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.Gender;
import com.hearlers.gateway.shared.enums.Mbti;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserProfile {
    private String profileImage;
    private String phoneNumber;
    private Gender gender;
    private Instant birthday;
    private String introduction;
    private Mbti mbti;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
