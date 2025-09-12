package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest
import com.hearlers.api.proto.v1.service.FindPersonaPromptsRequest
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest
import com.hearlers.api.proto.v1.service.FindTonePromptsRequest
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest
import com.hearlers.com.hearlers.gateway.port.PromptPort
import org.springframework.stereotype.Service

@Service
class PromptService(
    private val promptPort: PromptPort
) : PromptUseCase {
    override suspend fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt {
        return promptPort.updateTonePrompt(request);
    }

    override suspend fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt {
        return promptPort.updatePersonaPrompt(request);
    }

    override suspend fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt? {
        return promptPort.findTonePromptById(request);
    }

    override suspend fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt> {
        return promptPort.findTonePrompts(request);
    }

    override suspend fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt? {
        return promptPort.findPersonaPromptById(request);
    }

    override suspend fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt> {
        return promptPort.findPersonaPrompts(request);
    }
}