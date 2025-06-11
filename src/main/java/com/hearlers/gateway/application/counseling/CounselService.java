package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;

import java.util.List;

public interface CounselService {
    // Counsel
    CreateCounselResponse createCounsel(CreateCounselRequest request);
    Counsel findCounselById(FindCounselByIdRequest request);
    List<Counsel> findCounsels(FindCounselsRequest request);
    
    // CounselMessage
    CreateMessageResponse createMessage(CreateMessageRequest request);
    List<CounselMessage> findMessages(FindMessagesRequest request);
    CounselMessage reactMessage(ReactMessageRequest request);
    
    // CounselorUserRelationship
    List<CounselorUserRelationship> findCounselorUserRelationships(FindCounselorUserRelationshipsRequest request);
}
