package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub
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
import org.springframework.stereotype.Component

@Component
class GrpcPromptVersionAdapter(
    private val counselPromptServiceBlockingStub: CounselPromptServiceBlockingStub
) : PromptVersionPort {
    override fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion? {
        return this.counselPromptServiceBlockingStub.findPromptVersionById(request).promptVersion
    }

    override fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion> {
        return this.counselPromptServiceBlockingStub.findPromptVersions(request).promptVersionsList
    }

    override fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.findActiveVersion(request).promptVersion
    }

    override fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.findTemporaryVersion(request).promptVersion
    }

    override fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.loadExistingPromptVersion(request).promptVersion
    }

    override fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory> {
        return this.counselPromptServiceBlockingStub.findPromptActivateHistories(request).promptActivateHistoriesList
    }

    override fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.saveTemporaryVersion(request).promptVersion
    }

    override fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.activatePromptVersion(request).promptVersion
    }

    override fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion {
        return this.counselPromptServiceBlockingStub.updatePromptVersion(request).promptVersion
    }

    override fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean {
        return this.counselPromptServiceBlockingStub.deletePromptVersions(request) != null
    }
}