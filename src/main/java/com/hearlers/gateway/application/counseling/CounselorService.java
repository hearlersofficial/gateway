package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;

import java.util.List;

public interface CounselorService {
    // Counselor
    List<Counselor> findCounselors(FindCounselorsRequest request);
}
