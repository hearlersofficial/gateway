package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.FindCounselorByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;

public interface CounselorService {
    // Counselor
    Counselor findCounselorById(FindCounselorByIdRequest request);
    List<Counselor> findCounselors(FindCounselorsRequest request);

    // Tone
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);
}
