package com.hearlers.gateway.presentations.rest.counselors.dto;

import com.hearlers.gateway.applications.counsel.model.Counsel;
import com.hearlers.gateway.applications.counsel.model.CounselMessage;
import java.util.List;
import lombok.Getter;

@Getter
public class CreateCounselMessageResponseDto {
    private Counsel counsel;
    private List<CounselMessage> counselMessages;
}
