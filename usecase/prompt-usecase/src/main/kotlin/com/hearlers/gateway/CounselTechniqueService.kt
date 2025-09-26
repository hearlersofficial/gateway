package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.CounselTechniquePort
import org.springframework.stereotype.Service

@Service
class CounselTechniqueService(
    private val counselTechniquePort: CounselTechniquePort
) : CounselTechniqueUseCase {
    override fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique? {
        return counselTechniquePort.findCounselTechniqueById(request);
    }

    override fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique> {
        return counselTechniquePort.findCounselTechniques(request);
    }

    override fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique {
        return counselTechniquePort.createCounselTechnique(request);
    }

    override fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique {
        return counselTechniquePort.updateCounselTechnique(request);
    }

    override fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule? {
        return counselTechniquePort.findCounselTechniqueTransitionRuleById(request);
    }

    override fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule> {
        return counselTechniquePort.findCounselTechniqueTransitionRules(request);
    }

    override fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return counselTechniquePort.createCounselTechniqueTransitionRule(request);
    }

    override fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return counselTechniquePort.updateCounselTechniqueTransitionRule(request);
    }

    override fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean {
        return counselTechniquePort.deleteCounselTechniqueTransitionRule(request);
    }
}