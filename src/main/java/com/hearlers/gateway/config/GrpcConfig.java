package com.hearlers.gateway.config;


import com.hearlers.gateway.config.security.GrpcTargets;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    private final GrpcTargets grpcTargets;

    public GrpcConfig(GrpcTargets grpcTargets) {
        this.grpcTargets = grpcTargets;
    }

    @Bean
    public ManagedChannel nestManagedChannel() {
        return buildChannel(grpcTargets.getNest());
    }

//    @Bean
//    public ManagedChannel springManagedChannel() {
//        return buildChannel(grpcTargets.getSpring());
//    }

    private ManagedChannel buildChannel(String target) {
        ManagedChannelBuilder<?> builder = ManagedChannelBuilder.forTarget(target);

        if (isLocalhost(target)) {
            builder.usePlaintext(); // TLS 미사용
        } else {
            builder.useTransportSecurity(); // TLS 사용
        }

        return builder.build();
    }

    private boolean isLocalhost(String target) {
        return target.startsWith("localhost") || target.startsWith("127.0.0.1");
    }
}