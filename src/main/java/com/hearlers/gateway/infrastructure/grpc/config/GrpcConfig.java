package com.hearlers.gateway.infrastructure.grpc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcConfig {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forTarget("dev.rpc.hearlers.com")
                .useTransportSecurity() // TLS 사용
                .build();
    }
}