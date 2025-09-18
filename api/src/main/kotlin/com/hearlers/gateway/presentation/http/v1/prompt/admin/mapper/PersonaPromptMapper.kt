package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.PersonaPrompt
import com.hearlers.api.proto.v1.service.FindPersonaPromptsRequest
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest
import com.hearlers.api.proto.v1.service.findPersonaPromptsRequest
import com.hearlers.api.proto.v1.service.updatePersonaPromptRequest
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PersonaPromptDto

class PersonaPromptMapper {
    companion object {
        fun convertProtoToResponseModel(personaPrompt: PersonaPrompt): PersonaPromptDto.ResponseModel =
            PersonaPromptDto.ResponseModel(
                id = personaPrompt.id,
                promptVersionId = personaPrompt.promptVersionId,
                body = personaPrompt.body,
                counselorId = personaPrompt.counselorId,
                createdAt = personaPrompt.createdAt,
                updatedAt = personaPrompt.updatedAt,
                deletedAt = personaPrompt.deletedAt,
            )

        fun convertFindRequestToProto(request: PersonaPromptDto.FindRequest): FindPersonaPromptsRequest =
            findPersonaPromptsRequest {
                promptVersionId = request.promptVersionId
                counselorId = request.counselorId
            }

        fun convertUpdateRequestToProto(request: PersonaPromptDto.UpdateRequest): UpdatePersonaPromptRequest =
            updatePersonaPromptRequest {
                counselorId = request.counselorId
                body = request.body
            }
    }
}


