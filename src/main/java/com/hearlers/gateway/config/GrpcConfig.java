package com.hearlers.gateway.config;

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forTarget("rpc.dev.hearlers.com")
                .useTransportSecurity() // TLS 사용
                .build();
    }
}