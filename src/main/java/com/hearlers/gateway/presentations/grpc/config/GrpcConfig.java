package com.hearlers.gateway.presentations.grpc.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forTarget("dev.rpc.hearlers.com")
                .useTransportSecurity() // TLS 사용
                .build();
    }
}