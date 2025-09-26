package com.hearlers.gateway.config

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc
import com.hearlers.api.proto.v1.service.CounselServiceGrpc
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc
import com.hearlers.api.proto.v1.service.UserServiceGrpc
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.URI
import java.net.URISyntaxException

@ConfigurationProperties(prefix = "grpc.targets")
data class GrpcTargets(
    val nest: String,
//    val spring: String
)

@Configuration
class GrpcConfig(private val grpcTargets: GrpcTargets) {

    @Bean
    fun nestManagedChannel(): ManagedChannel? {
        return buildChannel(grpcTargets.nest)
    }

    private fun buildChannel(target: String): ManagedChannel? {
        val uri: URI?
        try {
            uri = URI(target)
        } catch (e: URISyntaxException) {
            throw IllegalArgumentException("Invalid gRPC target URI:  $target" , e)
        }

        val host = uri.host
        val port = uri.port

        require(!(host == null || port == -1)) { "Host or port is missing in gRPC target URI: $target" }

        val builder = ManagedChannelBuilder.forAddress(host, port)

        val scheme = uri.scheme
        if ("https".equals(scheme, ignoreCase = true)) {
            builder.useTransportSecurity()
        } else {
            builder.usePlaintext()
        }

        return builder.build()
    }

    @Bean
    fun userServiceBlockingStub(managedChannel: ManagedChannel): UserServiceGrpc.UserServiceBlockingStub {
        return UserServiceGrpc.newBlockingStub(managedChannel)
    }

    @Bean
    fun counselorServiceBlockingStub(managedChannel: ManagedChannel): CounselorServiceGrpc.CounselorServiceBlockingStub {
        return CounselorServiceGrpc.newBlockingStub(managedChannel)
    }

    @Bean
    fun counselServiceBlockingStub(managedChannel: ManagedChannel): CounselServiceBlockingStub {
        return CounselServiceGrpc.newBlockingStub(managedChannel)
    }

    @Bean
    fun counselPromptServiceBlockingStub(managedChannel: ManagedChannel): CounselPromptServiceGrpc.CounselPromptServiceBlockingStub {
        return CounselPromptServiceGrpc.newBlockingStub(managedChannel)
    }
}