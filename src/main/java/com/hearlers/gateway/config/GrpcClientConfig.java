package com.hearlers.gateway.config;

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class GrpcClientConfig {
    private final ManagedChannel managedChannel;

    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub() {
        return UserServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselServiceGrpc.CounselServiceBlockingStub counselServiceBlockingStub() {
        return CounselServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselPromptServiceGrpc.CounselPromptServiceBlockingStub counselPromptServiceBlockingStub() {
        return CounselPromptServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselorServiceGrpc.CounselorServiceBlockingStub counselorServiceBlockingStub() {
        return CounselorServiceGrpc.newBlockingStub(managedChannel);
    }
}

