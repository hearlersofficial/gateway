package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.CounselTechnique
import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*

interface CounselTechniquePort {

    suspend fun findCounselTechniqueById(request: FindCounselTechniqueByIdRequest): CounselTechnique?
    suspend fun findCounselTechniques(request: FindCounselTechniquesRequest): List<CounselTechnique>
    suspend fun createCounselTechnique(request: CreateCounselTechniqueRequest): CounselTechnique
    suspend fun updateCounselTechnique(request: UpdateCounselTechniqueRequest): CounselTechnique


    suspend fun findCounselTechniqueTransitionRuleById(request: FindCounselTechniqueTransitionRuleByIdRequest): CounselTechniqueTransitionRule?
    suspend fun findCounselTechniqueTransitionRules(request: FindCounselTechniqueTransitionRulesRequest): List<CounselTechniqueTransitionRule>
    suspend fun createCounselTechniqueTransitionRule(request: CreateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule
    suspend fun updateCounselTechniqueTransitionRule(request: UpdateCounselTechniqueTransitionRuleRequest): CounselTechniqueTransitionRule
    suspend fun deleteCounselTechniqueTransitionRule(request: DeleteCounselTechniqueTransitionRuleRequest): Boolean
}