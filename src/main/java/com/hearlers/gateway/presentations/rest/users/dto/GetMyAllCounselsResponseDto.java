package com.hearlers.gateway.presentations.rest.users.dto;

import com.hearlers.gateway.applications.counsel.model.Counsel;
import java.util.List;
import lombok.Getter;

@Getter
public class GetMyAllCounselsResponseDto {
    private List<Counsel> counsel;
}
