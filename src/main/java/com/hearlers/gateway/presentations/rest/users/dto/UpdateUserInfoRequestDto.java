package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.shared.enums.Gender;
import com.hearlers.gateway.shared.enums.Mbti;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class UpdateUserInfoRequestDto {
    private String nickname;
    private Mbti mbti;
    private Gender gender;
}
