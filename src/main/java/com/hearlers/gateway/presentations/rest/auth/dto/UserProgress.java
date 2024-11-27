package com.hearlers.gateway.presentations.rest.auth.dto;

import com.hearlers.gateway.presentations.rest.auth.enums.ProgressStatus;
import com.hearlers.gateway.presentations.rest.auth.enums.ProgressType;
import java.time.Instant;

public class UserProgress {
    private ProgressType progress_type;
    private ProgressStatus progress_status;
    private Instant last_updated;
    private Instant created_at;
    private Instant updated_at;
    private Instant deleted_at;
}
