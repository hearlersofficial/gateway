package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.TonePrompt
import com.hearlers.api.proto.v1.service.FindTonePromptsRequest
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest
import com.hearlers.api.proto.v1.service.findTonePromptsRequest
import com.hearlers.api.proto.v1.service.updateTonePromptRequest
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.TonePromptDto

class TonePromptMapper {
    companion object {
        fun convertProtoToResponseModel(tonePrompt: TonePrompt): TonePromptDto.ResponseModel =
            TonePromptDto.ResponseModel(
                id = tonePrompt.id,
                promptVersionId = tonePrompt.promptVersionId,
                body = tonePrompt.body,
                toneId = tonePrompt.toneId,
                createdAt = tonePrompt.createdAt,
                updatedAt = tonePrompt.updatedAt,
                deletedAt = tonePrompt.deletedAt,
            )

        fun convertFindRequestToProto(request: TonePromptDto.FindRequest): FindTonePromptsRequest =
            findTonePromptsRequest {
                promptVersionId = request.promptVersionId
                toneId = request.toneId
            }

        fun convertUpdateRequestToProto(request: TonePromptDto.UpdateRequest): UpdateTonePromptRequest =
            updateTonePromptRequest {
                toneId = request.toneId
                body = request.body
            }
    }
}


