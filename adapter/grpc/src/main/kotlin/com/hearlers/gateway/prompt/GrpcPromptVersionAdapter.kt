package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.PromptVersionPort
import org.springframework.stereotype.Component

@Component
class GrpcPromptVersionAdapter(
    private val stub: CounselPromptServiceGrpc.CounselPromptServiceBlockingStub
) : PromptVersionPort {
    override fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion? {
        return this.stub.findPromptVersionById(request).promptVersion
    }

    override fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion> {
        return this.stub.findPromptVersions(request).promptVersionsList
    }

    override fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion {
        return this.stub.findActiveVersion(request).promptVersion
    }

    override fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion {
        return this.stub.findTemporaryVersion(request).promptVersion
    }

    override fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion {
        return this.stub.loadExistingPromptVersion(request).promptVersion
    }

    override fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory> {
        return this.stub.findPromptActivateHistories(request).promptActivateHistoriesList
    }

    override fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion {
        return this.stub.saveTemporaryVersion(request).promptVersion
    }

    override fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion {
        return this.stub.activatePromptVersion(request).promptVersion
    }

    override fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion {
        return this.stub.updatePromptVersion(request).promptVersion
    }

    override fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean {
        return this.stub.deletePromptVersions(request) != null
    }
}