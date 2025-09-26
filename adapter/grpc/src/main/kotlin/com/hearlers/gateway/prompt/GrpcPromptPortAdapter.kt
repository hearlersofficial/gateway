package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.PromptPort
import org.springframework.stereotype.Component

@Component
class GrpcPromptPortAdapter(
    private val stub: CounselPromptServiceGrpc.CounselPromptServiceBlockingStub

) : PromptPort {
    override fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt {
        return this.stub.updateTonePrompt(request).tonePrompt
    }

    override fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt {
        return this.stub.updatePersonaPrompt(request).personaPrompt
    }

    override fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt? {
        return this.stub.findTonePromptById(request).tonePrompt
    }

    override fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt> {
        return this.stub.findTonePrompts(request).tonePromptsList
    }

    override fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt? {
        return this.stub.findPersonaPromptById(request).personaPrompt
    }

    override fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt> {
        return this.stub.findPersonaPrompts(request).personaPromptsList
    }
}