package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpcKt
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
    private val counselPromptServiceCoroutineStub: CounselPromptServiceGrpcKt.CounselPromptServiceCoroutineStub

) : PromptPort {
    override suspend fun updateTonePrompt(request: UpdateTonePromptRequest): TonePrompt {
        return this.counselPromptServiceCoroutineStub.updateTonePrompt(request).tonePrompt
    }

    override suspend fun updatePersonaPrompt(request: UpdatePersonaPromptRequest): PersonaPrompt {
        return this.counselPromptServiceCoroutineStub.updatePersonaPrompt(request).personaPrompt
    }

    override suspend fun findTonePromptById(request: FindTonePromptByIdRequest): TonePrompt? {
        return this.counselPromptServiceCoroutineStub.findTonePromptById(request).tonePrompt
    }

    override suspend fun findTonePrompts(request: FindTonePromptsRequest): List<TonePrompt> {
        return this.counselPromptServiceCoroutineStub.findTonePrompts(request).tonePromptsList
    }

    override suspend fun findPersonaPromptById(request: FindPersonaPromptByIdRequest): PersonaPrompt? {
        return this.counselPromptServiceCoroutineStub.findPersonaPromptById(request).personaPrompt
    }

    override suspend fun findPersonaPrompts(request: FindPersonaPromptsRequest): List<PersonaPrompt> {
        return this.counselPromptServiceCoroutineStub.findPersonaPrompts(request).personaPromptsList
    }
}