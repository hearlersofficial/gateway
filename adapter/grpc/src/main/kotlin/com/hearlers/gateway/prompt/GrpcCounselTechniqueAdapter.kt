package com.hearlers.gateway.prompt

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.CounselTechniquePort
import org.springframework.stereotype.Component

@Component
class GrpcCounselTechniqueAdapter(
    private val counselPromptServiceCoroutineStub: CounselPromptServiceGrpcKt.CounselPromptServiceCoroutineStub
) : CounselTechniquePort {
    override suspend fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique? {
        return this.counselPromptServiceCoroutineStub.findCounselTechniqueById(request).counselTechnique
    }

    override suspend fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique> {
        return this.counselPromptServiceCoroutineStub.findCounselTechniques(request).counselTechniquesList
    }

    override suspend fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique {
        return this.counselPromptServiceCoroutineStub.createCounselTechnique(request).counselTechnique
    }

    override suspend fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique {
        return this.counselPromptServiceCoroutineStub.updateCounselTechnique(request).counselTechnique
    }

    override suspend fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule? {
        return this.counselPromptServiceCoroutineStub.findCounselTechniqueTransitionRuleById(request).counselTechniqueTransitionRule
    }

    override suspend fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule> {
        return this.counselPromptServiceCoroutineStub.findCounselTechniqueTransitionRules(request).counselTechniqueTransitionRulesList
    }

    override suspend fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.counselPromptServiceCoroutineStub.createCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule

    }

    override suspend fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule {
        return this.counselPromptServiceCoroutineStub.updateCounselTechniqueTransitionRule(request).counselTechniqueTransitionRule
    }

    override suspend fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean {
        return try {
            this.counselPromptServiceCoroutineStub.deleteCounselTechniqueTransitionRule(request)
            true
        }  catch (e: Exception) {
            false
        }
    }
}