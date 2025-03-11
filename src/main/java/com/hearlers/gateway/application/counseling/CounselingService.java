package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;

public interface CounselingService {
    Context createContext(CreateContextRequest request);
    Context updateContext(UpdateContextRequest request);
    Context findContextById(FindContextByIdRequest request);
    List<Context> findContexts(FindContextsRequest request);
}
