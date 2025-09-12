package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.PromptActivateHistory
import com.hearlers.api.proto.v1.model.PromptVersion
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpcKt
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
    private val counselPromptServiceCoroutineStub: CounselPromptServiceGrpcKt.CounselPromptServiceCoroutineStub
) : PromptVersionPort {
    override suspend fun findPromptVersionById(request: FindPromptVersionByIdRequest): PromptVersion? {
        return this.counselPromptServiceCoroutineStub.findPromptVersionById(request).promptVersion
    }

    override suspend fun findPromptVersions(request: FindPromptVersionsRequest): List<PromptVersion> {
        return this.counselPromptServiceCoroutineStub.findPromptVersions(request).promptVersionsList
    }

    override suspend fun findActiveVersion(request: FindActiveVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.findActiveVersion(request).promptVersion
    }

    override suspend fun findTemporaryVersion(request: FindTemporaryVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.findTemporaryVersion(request).promptVersion
    }

    override suspend fun loadExistingPromptVersion(request: LoadExistingPromptVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.loadExistingPromptVersion(request).promptVersion
    }

    override suspend fun findPromptActivateHistories(request: FindPromptActivateHistoriesRequest): List<PromptActivateHistory> {
        return this.counselPromptServiceCoroutineStub.findPromptActivateHistories(request).promptActivateHistoriesList
    }

    override suspend fun saveTemporaryVersion(request: SaveTemporaryVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.saveTemporaryVersion(request).promptVersion
    }

    override suspend fun activatePromptVersion(request: ActivatePromptVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.activatePromptVersion(request).promptVersion
    }

    override suspend fun updatePromptVersion(request: UpdatePromptVersionRequest): PromptVersion {
        return this.counselPromptServiceCoroutineStub.updatePromptVersion(request).promptVersion
    }

    override suspend fun deletePromptVersion(request: DeletePromptVersionsRequest): Boolean {
        return this.counselPromptServiceCoroutineStub.deletePromptVersions(request) != null
    }
}