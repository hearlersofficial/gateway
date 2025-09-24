package com.hearlers.gateway

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule

open class DefaultObjectMapper : ObjectMapper() {
        init {
            val kotlinModule = KotlinModule.Builder()
            .build()
            registerModule(JavaTimeModule())
            registerModule(kotlinModule)
        }
}