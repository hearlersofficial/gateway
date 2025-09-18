package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest
import com.hearlers.api.proto.v1.service.createCounselTechniqueRequest
import com.hearlers.api.proto.v1.service.findCounselTechniquesRequest
import com.hearlers.api.proto.v1.service.updateCounselTechniqueRequest
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.CounselTechniqueDto

class CounselTechniqueMapper {
    companion object {
        fun convertProtoToResponseModel(counselTechnique: CounselTechnique): CounselTechniqueDto.ResponseModel =
            CounselTechniqueDto.ResponseModel(
                id = counselTechnique.id,
                promptVersionId = counselTechnique.promptVersionId,
                name = counselTechnique.name,
                toneId = counselTechnique.toneId,
                context = counselTechnique.context,
                instruction = counselTechnique.instruction,
                isStartTechnique = counselTechnique.isStartTechnique,
                temperature = counselTechnique.temperature,
                createdAt = counselTechnique.createdAt,
                updatedAt = counselTechnique.updatedAt,
                deletedAt = counselTechnique.deletedAt
            )

        fun convertCreateRequestToProto(request: CounselTechniqueDto.CreateRequest): CreateCounselTechniqueRequest =
            createCounselTechniqueRequest {
                this.name = request.name
                this.toneId = request.toneId
                this.context = request.context
                this.instruction = request.instruction
                this.isStartTechnique = request.isStartTechnique
                this.temperature = request.temperature
            }

        fun convertUpdateRequestToProto(
            counselTechniqueId: String,
            request: CounselTechniqueDto.UpdateRequest
        ): UpdateCounselTechniqueRequest = updateCounselTechniqueRequest {
            this.counselTechniqueId = counselTechniqueId
            this.name = request.name
            this.context = request.context
            this.instruction = request.instruction
            this.isStartTechnique = request.isStartTechnique
            this.temperature = request.temperature
        }

        fun convertFindRequestToProto(request: CounselTechniqueDto.FindRequest): FindCounselTechniquesRequest =
            findCounselTechniquesRequest {
                request.promptVersionId?.let {
                    this.promptVersionId = request.promptVersionId
                }
                request.toneId?. let {
                    this.toneId = request.toneId
                }
            }
    }
}


