package com.hearlers.gateway.applications.counsel.model;

import java.time.LocalDate;

public class CounselMessage {
    private int id;
    private int counselId;
    private String message;
    private boolean isUserMessage;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
}
