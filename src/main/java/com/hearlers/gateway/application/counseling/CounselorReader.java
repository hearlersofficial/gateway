package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;

public interface CounselorReader {
    List<Counselor> findCounselors(FindCounselorsRequest request);
}
