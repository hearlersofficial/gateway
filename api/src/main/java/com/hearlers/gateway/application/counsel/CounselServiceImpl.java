package com.hearlers.gateway.application.counsel;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.shared.exception.HttpException;
import com.hearlers.gateway.shared.exception.HttpResultCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CounselServiceImpl implements CounselService {
    private final CounselReader counselReader;
    private final CounselStore counselStore;
    private final CounselTokenHandler counselTokenHandler;

    // Counsel 관련 메서드
    @Override
    public CreateCounselResponse createCounsel(CreateCounselRequest request) {
        return counselStore.createCounsel(request);
    }

    @Override
    public Counsel findCounselById(FindCounselByIdRequest request) {
        return counselReader.findCounselById(request);
    }

    @Override
    public List<Counsel> findCounsels(FindCounselsRequest request) {
        return counselReader.findCounsels(request);
    }
    
    // CounselMessage 관련 메서드
    @Override
    public CreateMessageResponse createMessage(CreateMessageRequest request, String userId) {
        try {
            this.counselTokenHandler.reserveToken(ReserveTokensRequest.newBuilder().setUserId(userId).build());
        } catch (Exception e) {
            throw new HttpException(HttpResultCode.NO_REMAINING_TOKENS);
        }
        return counselStore.createMessage(request);
    }

    @Override
    public List<CounselMessage> findMessages(FindMessagesRequest request) {
        return counselReader.findMessages(request);
    }

    @Override
    public CounselMessage reactMessage(ReactMessageRequest request) {
        return counselStore.reactMessage(request);
    }
    
    // CounselorUserRelationship 관련 메서드
    @Override
    public List<CounselorUserRelationship> findCounselorUserRelationships(FindCounselorUserRelationshipsRequest request) {
        return counselReader.findCounselorUserRelationships(request);
    }
}
