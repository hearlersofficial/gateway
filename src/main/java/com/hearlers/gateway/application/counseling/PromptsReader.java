package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;

public interface PromptsReader {
    Context findContextById(FindContextByIdRequest request);
    List<Context> findContexts(FindContextsRequest request);
}
