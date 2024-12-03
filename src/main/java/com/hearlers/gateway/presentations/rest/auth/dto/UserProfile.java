package com.hearlers.gateway.presentations.rest.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.Gender;
import com.hearlers.gateway.shared.enums.Mbti;
import java.time.Instant;

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
