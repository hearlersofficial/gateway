package com.hearlers.gateway.presentation.rest.counselors.dto;

import java.util.List;

import com.hearlers.gateway.application.counsel.model.Counsel;
import com.hearlers.gateway.application.counsel.model.CounselMessage;

import lombok.Getter;

@Getter
public class CreateCounselResponseDto {
    private Counsel counsel;
    private List<CounselMessage> counselMessages;
}