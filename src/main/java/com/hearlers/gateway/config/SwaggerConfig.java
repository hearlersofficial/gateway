package com.hearlers.gateway.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Hearlers-gateway-API")
                .description("Hearlers-gateway-API 명세")
                .version("1.0.0");

        String cookieAuthName = "accessToken"; // JWT 토큰이 담기는 쿠키 이름으로 설정
        SecurityRequirement securityRequirement = new SecurityRequirement().addList(cookieAuthName);
        Components components = new Components()
                .addSecuritySchemes(cookieAuthName, new SecurityScheme()
                        .name(cookieAuthName)
                        .type(SecurityScheme.Type.APIKEY)
                        .in(SecurityScheme.In.COOKIE));

        return new OpenAPI()
                .info(info)
                .addSecurityItem(securityRequirement)
                .components(components);
    }
}
