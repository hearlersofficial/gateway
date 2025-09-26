package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*

interface CounselTechniqueUseCase {
    fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique?
    fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique>
    fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique
    fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique


    fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule?
    fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule>
    fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule
    fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule
    fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean
}