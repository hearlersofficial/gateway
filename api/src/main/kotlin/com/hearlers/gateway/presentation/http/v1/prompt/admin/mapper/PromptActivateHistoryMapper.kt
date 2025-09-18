package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.PromptActivateHistoryDto

class PromptActivateHistoryMapper {
    companion object {
        fun convertProtoToResponseModel(
            history: PromptActivateHistory
        ): PromptActivateHistoryDto.ResponseModel =
            PromptActivateHistoryDto.ResponseModel(
                id = history.id,
                promptVersionId = history.promptVersionId,
                activatedAt = history.activatedAt,
                createdAt = history.createdAt,
                updatedAt = history.updatedAt,
                deletedAt = history.deletedAt,
            )
    }
}


