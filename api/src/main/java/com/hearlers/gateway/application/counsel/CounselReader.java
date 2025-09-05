package com.hearlers.gateway.application.counsel;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.CounselMessage;
import com.hearlers.api.proto.v1.model.CounselorUserRelationship;
import com.hearlers.api.proto.v1.service.FindCounselByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest;
import com.hearlers.api.proto.v1.service.FindCounselsRequest;
import com.hearlers.api.proto.v1.service.FindMessagesRequest;

import java.util.List;

public interface CounselReader {
    Counsel findCounselById(FindCounselByIdRequest request);
    List<Counsel> findCounsels(FindCounselsRequest request);
    List<CounselMessage> findMessages(FindMessagesRequest request);
    List<CounselorUserRelationship> findCounselorUserRelationships(FindCounselorUserRelationshipsRequest request);

}
