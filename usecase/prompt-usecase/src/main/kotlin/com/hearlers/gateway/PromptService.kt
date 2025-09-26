package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.PromptPort
import org.springframework.stereotype.Service

@Service
class PromptService(
    private val promptPort: PromptPort
) : PromptUseCase {
    override fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt {
        return promptPort.updateTonePrompt(request);
    }

    override fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt {
        return promptPort.updatePersonaPrompt(request);
    }

    override fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt? {
        return promptPort.findTonePromptById(request);
    }

    override fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt> {
        return promptPort.findTonePrompts(request);
    }

    override fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt? {
        return promptPort.findPersonaPromptById(request);
    }

    override fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt> {
        return promptPort.findPersonaPrompts(request);
    }
}