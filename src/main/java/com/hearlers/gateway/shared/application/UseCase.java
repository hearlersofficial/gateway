package com.hearlers.gateway.shared.application;

public interface UseCase<IRequest, IResponse> {
    IResponse execute(IRequest request);
}
