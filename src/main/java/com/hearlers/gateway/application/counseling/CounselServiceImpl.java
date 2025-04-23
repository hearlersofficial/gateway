package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CounselServiceImpl implements CounselService {

    // Counsel 관련 메서드
    @Override
    public Counsel createCounsel(CreateCounselRequest request) {
        // TODO: CounselService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }

    @Override
    public Counsel findCounselById(FindCounselByIdRequest request) {
        // TODO: CounselService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }

    @Override
    public List<Counsel> findCounsels(FindCounselsRequest request) {
        // TODO: CounselService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }
    
    // CounselMessage 관련 메서드
    @Override
    public CounselMessage createMessage(CreateMessageRequest request) {
        // TODO: MessageService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }

    @Override
    public List<CounselMessage> findMessages(FindMessagesRequest request) {
        // TODO: MessageService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }

    @Override
    public CounselMessage reactMessage(ReactMessageRequest request) {
        // TODO: MessageService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }
    
    // CounselorUserRelationship 관련 메서드
    @Override
    public List<CounselorUserRelationship> findCounselorUserRelationships(FindCounselorUserRelationshipsRequest request) {
        // TODO: RelationshipService 구현 필요
        throw new UnsupportedOperationException("아직 구현되지 않았습니다.");
    }
}
