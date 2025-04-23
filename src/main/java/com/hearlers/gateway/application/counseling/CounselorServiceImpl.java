package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CounselorServiceImpl implements CounselorService {
    private final CounselorReader counselorReader;

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorReader.findCounselors(request);
    }

}
