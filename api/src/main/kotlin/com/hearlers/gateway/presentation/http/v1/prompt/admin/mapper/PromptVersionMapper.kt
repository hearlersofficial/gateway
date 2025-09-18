package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.FindPromptVersionsRequest
import com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest
import com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest
import com.hearlers.api.proto.v1.service.findPromptVersionsRequest
import com.hearlers.api.proto.v1.service.saveTemporaryVersionRequest
import com.hearlers.api.proto.v1.service.updatePromptVersionRequest
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PromptVersionDto

class PromptVersionMapper {
    companion object {
        fun convertProtoToResponseModel(promptVersion: PromptVersion): PromptVersionDto.ResponseModel =
            PromptVersionDto.ResponseModel(
                id = promptVersion.id,
                name = promptVersion.name,
                description = promptVersion.description,
                isActive = promptVersion.isActive,
                isTemporary = promptVersion.isTemporary,
                isBookmarked = promptVersion.isBookmarked,
                aiModel = promptVersion.aiModel,
                createdAt = promptVersion.createdAt,
                updatedAt = promptVersion.updatedAt,
                deletedAt = promptVersion.deletedAt,
            )

        fun convertFindRequestToProto(request: PromptVersionDto.FindRequest): FindPromptVersionsRequest =
            findPromptVersionsRequest {
                name = request.name
            }

        fun convertUpdateRequestToProto(
            promptVersionId: String,
            request: PromptVersionDto.UpdateRequest
        ): UpdatePromptVersionRequest = updatePromptVersionRequest {
            name = request.name
            description = request.description
            isBookmarked = request.isBookmarked
            aiModel = request.aiModel
            this.promptVersionId = promptVersionId
        }

        fun convertSaveTemporaryVersionRequestToProto(
            request: PromptVersionDto.SaveTemporaryVersionRequest
        ): SaveTemporaryVersionRequest = saveTemporaryVersionRequest {
            name = request.name
            description = request.description
            isBookmarked = request.isBookmarked
            aiModel = request.aiModel
        }
    }
}


