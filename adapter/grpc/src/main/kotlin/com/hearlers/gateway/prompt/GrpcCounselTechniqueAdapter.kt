package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.CounselTechniquePort
import org.springframework.stereotype.Component

@Component
class GrpcCounselTechniqueAdapter(
    private val stub: CounselPromptServiceGrpc.CounselPromptServiceBlockingStub
) : CounselTechniquePort {
    override fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique? {
        return this.stub.findCounselTechniqueById(request).counselTechnique
    }

    override fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique> {
        return this.stub.findCounselTechniques(request).counselTechniquesList
    }

    override fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique {
        return this.stub.createCounselTechnique(request).counselTechnique
    }

    override fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique {
        return this.stub.updateCounselTechnique(request).counselTechnique
    }

    override fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule? {
        return this.stub.findCounselTechniqueTransitionRuleById(request).counselTechniqueTransitionRule
    }

    override fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule> {
        return this.stub.findCounselTechniqueTransitionRules(request).counselTechniqueTransitionRulesList
    }

    override fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.stub.createCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule

    }

    override fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.stub.updateCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule
    }

    override fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean {
        return try {
            this.stub.deleteCounselTechniqueTransitionRule(request)
            true
        }  catch (e: Exception) {
            false
        }
    }
}