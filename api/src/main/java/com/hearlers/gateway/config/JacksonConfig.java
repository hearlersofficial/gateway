package com.hearlers.gateway.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hearlers.gateway.DefaultObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JacksonConfig {

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        return new DefaultObjectMapper();
    }
}