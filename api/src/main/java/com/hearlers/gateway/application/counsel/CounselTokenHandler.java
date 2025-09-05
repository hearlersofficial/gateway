package com.hearlers.gateway.application.counsel;

import com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest;
import com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse;
import com.hearlers.api.proto.v1.service.ReserveTokensRequest;
import com.hearlers.api.proto.v1.service.ReserveTokensResponse;

public interface CounselTokenHandler {
    CheckRemainingTokensResponse checkRemainingTokens(CheckRemainingTokensRequest request);
    ReserveTokensResponse reserveToken(ReserveTokensRequest request);
}
