package com.hearlers.gateway;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class DefaultObjectMapper extends ObjectMapper {

    public DefaultObjectMapper() {
        super();

        this.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));
        registerModule(new JavaTimeModule());

    }
}
