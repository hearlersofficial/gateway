package com.hearlers.gateway.infrastructure.grpc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hearlers.api.proto.v1.service.CounselServiceGrpc;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;

import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class GrpcClientConfig {

    private final ManagedChannel managedChannel;

    // 일단은 blocking stub으로 설정
    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub() {
        return UserServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselServiceGrpc.CounselServiceBlockingStub counselServiceBlockingStub() {
        return CounselServiceGrpc.newBlockingStub(managedChannel);
    }
}
