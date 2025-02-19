package com.hearlers.gateway.applications.counsel.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Counsel {
    private String counselId;
    private String userId;
    private String lastMessage;
    private LocalDate lastChattedAt;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
}
