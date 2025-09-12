package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.*

interface PromptVersionPort {
    suspend fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion?
    suspend fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion>

    suspend fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion
    suspend fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion

    suspend fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion
    suspend fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory>

    suspend fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion
    suspend fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion
    suspend fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion
    suspend fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean

}