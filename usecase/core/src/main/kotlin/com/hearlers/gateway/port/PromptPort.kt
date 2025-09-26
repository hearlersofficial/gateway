package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.*

interface PromptPort {
    fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt
    fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt
    fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt?
    fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt>
    fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt?
    fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt>
}