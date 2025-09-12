package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.*

interface PromptPort {
    suspend fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt
    suspend fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt
    suspend fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt?
    suspend fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt>
    suspend fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt?
    suspend fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt>
}