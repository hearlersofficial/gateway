package com.hearlers.gateway.application.counsel;

import com.hearlers.api.proto.v1.model.CounselMessage;
import com.hearlers.api.proto.v1.service.*;

public interface CounselStore {
    CreateCounselResponse createCounsel(CreateCounselRequest request);
    CreateMessageResponse createMessage(CreateMessageRequest request);
    CounselMessage reactMessage(ReactMessageRequest request);

}
