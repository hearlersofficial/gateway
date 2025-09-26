package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.*

interface PromptVersionUseCase {
    fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion?
    fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion>

    fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion
    fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion

    fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion
    fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory>

    fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion
    fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion
    fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion
    fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean
}