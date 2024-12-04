package com.hearlers.gateway.applications.counsel.model;

import java.time.LocalDate;

public abstract class Counsel {
    private int counselId;
    private int userId;
    private String lastMessage;
    private LocalDate lastChattedAt;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
}
