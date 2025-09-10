package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub
import com.hearlers.com.hearlers.gateway.port.CounselTechniquePort
import org.springframework.stereotype.Component

@Component
class GrpcCounselTechniqueAdapter(
    private val counselPromptServiceBlockingStub: CounselPromptServiceBlockingStub
) : CounselTechniquePort {
    override fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique? {
        return this.counselPromptServiceBlockingStub.findCounselTechniqueById(request).counselTechnique
    }

    override fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique> {
        return this.counselPromptServiceBlockingStub.findCounselTechniques(request).counselTechniquesList
    }

    override fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique {
        return this.counselPromptServiceBlockingStub.createCounselTechnique(request).counselTechnique
    }

    override fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique {
        return this.counselPromptServiceBlockingStub.updateCounselTechnique(request).counselTechnique
    }

    override fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule? {
        return this.counselPromptServiceBlockingStub.findCounselTechniqueTransitionRuleById(request).counselTechniqueTransitionRule
    }

    override fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule> {
        return this.counselPromptServiceBlockingStub.findCounselTechniqueTransitionRules(request).counselTechniqueTransitionRulesList
    }

    override fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.counselPromptServiceBlockingStub.createCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule

    }

    override fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.counselPromptServiceBlockingStub.updateCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule
    }

    override fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean {
        return this.counselPromptServiceBlockingStub.deleteCounselTechniqueTransitionRule(request) != null
    }
}