package com.hearlers.gateway;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@OpenAPIDefinition(
        info = @Info(
                title = "Hearlers API",
                version = "v1",
                description = """
        Hearlers 백엔드 API 문서입니다.

        - 관리자 및 사용자 API를 모두 포함합니다.
        - 일부 관리용 API는 관리자 권한이 필요합니다.

        ## 🔐 빠른 로그인

        | 환경 | Swagger 리디렉트 | 어드민 프론트엔드 | 웹 프론트엔드 |
        |------|------------------|--------------------|----------------|
        | 로컬 | [로그인 → Swagger](http://localhost:8080/v1/auth/login/kakao?redirect-url=http://localhost:8080/swagger-ui/index.html) | [로그인 → Admin FE](http://localhost:8080/v1/auth/login/kakao?redirect-url=http://localhost:3000) | [로그인 → Web FE](http://localhost:8080/v1/auth/login/kakao?redirect-url=http://localhost:3000) |
        | 개발 | [로그인 → Swagger](https://api.dev.hearlers.com/v1/auth/login/kakao?redirect-url=https://api.dev.hearlers.com/swagger-ui/index.html) | [로그인 → Admin FE](https://api.dev.hearlers.com/v1/auth/login/kakao?redirect-url=https://admin.dev.hearlers.com) | [로그인 → Web FE](https://api.dev.hearlers.com/v1/auth/login/kakao?redirect-url=https://web.dev.hearlers.com) |
        | 운영 | [로그인 → Swagger](https://api.hearlers.com/v1/auth/login/kakao?redirect-url=https://api.hearlers.com/swagger-ui/index.html) | [로그인 → Admin FE](https://api.hearlers.com/v1/auth/login/kakao?redirect-url=https://admin.hearlers.com) | [로그인 → Web FE](https://api.hearlers.com/v1/auth/login/kakao?redirect-url=https://www.hearlers.com) |
        """
        ),
        servers = {
                @Server(url = "/", description = "ROOT URL"),
        }
)
@SpringBootApplication
@ConfigurationPropertiesScan
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
