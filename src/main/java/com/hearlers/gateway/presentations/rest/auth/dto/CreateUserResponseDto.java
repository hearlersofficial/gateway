package com.hearlers.gateway.presentations.rest.auth.dto;

import com.hearlers.gateway.presentations.rest.auth.enums.AuthChannel;
import java.time.Instant;
import java.util.List;
import lombok.Getter;

@Getter
public class CreateUserResponseDto {
    private int id;
    private String nickname;
    private AuthChannel auth_channel;
    private UserProfile user_profile;
    private List<UserProgress> user_progresses;
    private Instant created_at; // google.protobuf.Timestamp -> Instant
    private Instant updated_at;
    private Instant deleted_at;
}
