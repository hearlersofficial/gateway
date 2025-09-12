package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest
import com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest
import com.hearlers.api.proto.v1.service.FindActiveVersionRequest
import com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest
import com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest
import com.hearlers.api.proto.v1.service.FindPromptVersionsRequest
import com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest
import com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest
import com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest
import com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest
import com.hearlers.com.hearlers.gateway.port.PromptVersionPort
import org.springframework.stereotype.Service

@Service
class PromptVersionService 
(
    private val promptVersionPort: PromptVersionPort
) : PromptVersionUseCase {
    override suspend fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion? {
        return promptVersionPort.findPromptVersionById(request);
    }

    override suspend fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion> {
        return promptVersionPort.findPromptVersions(request);
    }

    override suspend fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion {
        return promptVersionPort.findActiveVersion(request);
    }

    override suspend fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion {
        return promptVersionPort.findTemporaryVersion(request);
    }

    override suspend fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion {
        return promptVersionPort.loadExistingPromptVersion(request);
    }

    override suspend fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory> {
        return promptVersionPort.findPromptActivateHistories(request);
    }

    override suspend fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion {
        return promptVersionPort.saveTemporaryVersion(request);
    }

    override suspend fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion {
        return promptVersionPort.activatePromptVersion(request);
    }

    override suspend fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion {
        return promptVersionPort.updatePromptVersion(request);
    }

    override suspend fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean {
        return promptVersionPort.deletePromptVersion(request);
    }
}