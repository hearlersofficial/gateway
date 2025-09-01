package com.hearlers.gateway.config;

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class GrpcConfig {

    @ConfigurationProperties(prefix = "grpc.targets")
    @Getter
    @Setter
    public static class GrpcTargets {
        private String nest;
        private String spring;
    }

    private final GrpcTargets grpcTargets;

    public GrpcConfig(GrpcTargets grpcTargets) {
        this.grpcTargets = grpcTargets;
    }

    @Bean
    public ManagedChannel nestManagedChannel() {
        return buildChannel(grpcTargets.getNest());
    }

    private ManagedChannel buildChannel(String target) {
        URI uri;
        try {
            uri = new URI(target);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid gRPC target URI: " + target, e);
        }

        String host = uri.getHost();
        int port = uri.getPort();

        if (host == null || port == -1) {
            throw new IllegalArgumentException("Host or port is missing in gRPC target URI: " + target);
        }

        ManagedChannelBuilder<?> builder = ManagedChannelBuilder.forAddress(host, port);

        String scheme = uri.getScheme();
        if ("https".equalsIgnoreCase(scheme)) {
            builder.useTransportSecurity();
        } else {
            builder.usePlaintext();
        }

        return builder.build();
    }

    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub(ManagedChannel managedChannel) {
        return UserServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselServiceGrpc.CounselServiceBlockingStub counselServiceBlockingStub(ManagedChannel managedChannel) {
        return CounselServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselPromptServiceGrpc.CounselPromptServiceBlockingStub counselPromptServiceBlockingStub(ManagedChannel managedChannel) {
        return CounselPromptServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CounselorServiceGrpc.CounselorServiceBlockingStub counselorServiceBlockingStub(ManagedChannel managedChannel) {
        return CounselorServiceGrpc.newBlockingStub(managedChannel);
    }
}