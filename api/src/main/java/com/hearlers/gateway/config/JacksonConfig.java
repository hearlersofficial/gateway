package com.hearlers.gateway.config;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder -> builder.postConfigurer(objectMapper -> {
            objectMapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.DEFAULT));
        });
    }
}