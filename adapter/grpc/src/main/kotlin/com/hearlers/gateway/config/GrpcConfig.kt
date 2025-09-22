package com.hearlers.gateway.config

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpcKt.CounselPromptServiceCoroutineStub
import com.hearlers.api.proto.v1.service.CounselServiceGrpcKt.CounselServiceCoroutineStub
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub
import com.hearlers.api.proto.v1.service.UserServiceGrpc
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub
import com.hearlers.api.proto.v1.service.UserServiceGrpcKt.UserServiceCoroutineStub
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
            throw IllegalArgumentException("Invalid gRPC target URI: " + target, e)
        }

        val host = uri.getHost()
        val port = uri.getPort()

        require(!(host == null || port == -1)) { "Host or port is missing in gRPC target URI: " + target }

        val builder = ManagedChannelBuilder.forAddress(host, port)

        val scheme = uri.getScheme()
        if ("https".equals(scheme, ignoreCase = true)) {
            builder.useTransportSecurity()
        } else {
            builder.usePlaintext()
        }

        return builder.build()
    }

    @Bean
    fun userServiceBlockingStub(managedChannel: ManagedChannel?): UserServiceBlockingStub? {
        return UserServiceGrpc.newBlockingStub(managedChannel)
    }


    @Bean
    fun counselorServiceBlockingStub(managedChannel: ManagedChannel?): CounselorServiceBlockingStub? {
        return CounselorServiceGrpc.newBlockingStub(managedChannel)
    }

    @Bean
    fun counselorServiceCoroutineStub(managedChannel: ManagedChannel): CounselPromptServiceCoroutineStub {
        return CounselPromptServiceCoroutineStub(managedChannel)
    }

    @Bean
    fun counselServiceCoroutineStub(managedChannel: ManagedChannel): CounselServiceCoroutineStub {
        return CounselServiceCoroutineStub(managedChannel)
    }

    @Bean
    fun userServiceCoroutineStub(managedChannel: ManagedChannel): UserServiceCoroutineStub {
        return UserServiceCoroutineStub(managedChannel)
    }
}