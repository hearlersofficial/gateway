package com.hearlers.gateway.presentations.rest.auth.dto;

import com.hearlers.gateway.presentations.rest.auth.enums.Gender;
import com.hearlers.gateway.presentations.rest.auth.enums.Mbti;
import java.time.Instant;

public class UserProfile {
    private String profile_image;
    private String phone_number;
    private Gender gender;
    private Instant birthday;
    private String introduction;
    private Mbti mbti;
    private Instant created_at;
    private Instant updated_at;
    private Instant deleted_at;
}
