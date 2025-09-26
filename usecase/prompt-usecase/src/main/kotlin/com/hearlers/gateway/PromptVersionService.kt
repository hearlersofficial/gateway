package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.PromptVersionPort
import org.springframework.stereotype.Service

@Service
class PromptVersionService 
(
    private val promptVersionPort: PromptVersionPort
) : PromptVersionUseCase {
    override fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion? {
        return promptVersionPort.findPromptVersionById(request);
    }

    override fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion> {
        return promptVersionPort.findPromptVersions(request);
    }

    override fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion {
        return promptVersionPort.findActiveVersion(request);
    }

    override fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion {
        return promptVersionPort.findTemporaryVersion(request);
    }

    override fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion {
        return promptVersionPort.loadExistingPromptVersion(request);
    }

    override fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory> {
        return promptVersionPort.findPromptActivateHistories(request);
    }

    override fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion {
        return promptVersionPort.saveTemporaryVersion(request);
    }

    override fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion {
        return promptVersionPort.activatePromptVersion(request);
    }

    override fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion {
        return promptVersionPort.updatePromptVersion(request);
    }

    override fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean {
        return promptVersionPort.deletePromptVersion(request);
    }
}