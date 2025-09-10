package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc
import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest
import com.hearlers.api.proto.v1.service.FindPersonaPromptsRequest
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest
import com.hearlers.api.proto.v1.service.FindTonePromptsRequest
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest
import com.hearlers.com.hearlers.gateway.port.PromptPort
import org.springframework.stereotype.Component

@Component
class GrpcPromptPortAdapter(
    private val counselPromptServiceBlockingStub: CounselPromptServiceGrpc.CounselPromptServiceBlockingStub

) : PromptPort {
    override fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt {
        return this.counselPromptServiceBlockingStub.updateTonePrompt(request).tonePrompt
    }

    override fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt {
        return this.counselPromptServiceBlockingStub.updatePersonaPrompt(request).personaPrompt
    }

    override fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt? {
        return this.counselPromptServiceBlockingStub.findTonePromptById(request).tonePrompt
    }

    override fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt> {
        return this.counselPromptServiceBlockingStub.findTonePrompts(request).tonePromptsList
    }

    override fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt? {
        return this.counselPromptServiceBlockingStub.findPersonaPromptById(request).personaPrompt
    }

    override fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt> {
        return this.counselPromptServiceBlockingStub.findPersonaPrompts(request).personaPromptsList
    }
}