package com.hearlers.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedHeaders("*")
                .allowCredentials(true)
                .allowedOrigins("http://localhost:8080",
                        "http://localhost:3000",
                        "http://localhost:5173",
                        "http://localhost:4173",
                        "https://api.dev.hearlers.com",
                        "https://admin.dev.hearlers.com",
                        "https://dev.hearlers.com"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS");
    }
}
