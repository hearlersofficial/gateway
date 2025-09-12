package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueTransitionRuleRequest
import com.hearlers.api.proto.v1.service.DeleteCounselTechniqueTransitionRuleRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniqueTransitionRuleByIdRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniqueTransitionRulesRequest
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueTransitionRuleRequest
import com.hearlers.com.hearlers.gateway.port.CounselTechniquePort
import org.springframework.stereotype.Service

@Service
class CounselTechniqueService(
    private val counselTechniquePort: CounselTechniquePort
) : CounselTechniqueUseCase {
    override suspend fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique? {
        return counselTechniquePort.findCounselTechniqueById(request);
    }

    override suspend fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique> {
        return counselTechniquePort.findCounselTechniques(request);
    }

    override suspend fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique {
        return counselTechniquePort.createCounselTechnique(request);
    }

    override suspend fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique {
        return counselTechniquePort.updateCounselTechnique(request);
    }

    override suspend fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule? {
        return counselTechniquePort.findCounselTechniqueTransitionRuleById(request);
    }

    override suspend fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule> {
        return counselTechniquePort.findCounselTechniqueTransitionRules(request);
    }

    override suspend fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return counselTechniquePort.createCounselTechniqueTransitionRule(request);
    }

    override suspend fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return counselTechniquePort.updateCounselTechniqueTransitionRule(request);
    }

    override suspend fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean {
        return counselTechniquePort.deleteCounselTechniqueTransitionRule(request);
    }
}