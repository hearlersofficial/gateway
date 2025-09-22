package com.hearlers.gateway.presentation.http.v1.prompt.admin.mapper

import com.hearlers.api.proto.v1.model.CounselTechniqueTransitionRule
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.presentation.http.v1.prompt.admin.dto.CounselTechniqueTransitionRuleDto

class CounselTechniqueTransitionRuleMapper {
    companion object {
        fun convertProtoToResponseModel(
            rule: CounselTechniqueTransitionRule
        ): CounselTechniqueTransitionRuleDto.ResponseModel =
            CounselTechniqueTransitionRuleDto.ResponseModel(
                id = rule.id,
                promptVersionId = rule.promptVersionId,
                fromCounselTechniqueId = rule.fromCounselTechniqueId,
                toCounselTechniqueId = rule.toCounselTechniqueId,
                priority = rule.priority,
                minCurrentTechniqueMessageCount = rule.minCurrentTechniqueMessageCount,
                maxCurrentTechniqueMessageCount = rule.maxCurrentTechniqueMessageCount,
                requiredImpactDomains = rule.requiredImpactDomainsList,
                requiredTimeframes = rule.requiredTimeframesList,
                requiredEmotionPrimaries = rule.requiredEmotionPrimariesList,
                requiredValences = rule.requiredValencesList,
                requiredArousalLevels = rule.requiredArousalLevelsList,
                minEmotionIntensity = rule.minEmotionIntensity,
                maxEmotionIntensity = rule.maxEmotionIntensity,
                requiredPerceivedControls = rule.requiredPerceivedControlsList,
                requiredMotivationStages = rule.requiredMotivationStagesList,
                minSelfEfficacy = rule.minSelfEfficacy,
                maxSelfEfficacy = rule.maxSelfEfficacy,
                requiredSocialSupportLevels = rule.requiredSocialSupportLevelsList,
                requiredRiskKinds = rule.requiredRiskKindsList,
                minRiskSeverity = rule.minRiskSeverity,
                maxRiskSeverity = rule.maxRiskSeverity,
                requiredSleepQualities = rule.requiredSleepQualitiesList,
                requiredPhysicalSymptomsPresent = rule.requiredPhysicalSymptomsPresent,
                requiredCognitiveLoads = rule.requiredCognitiveLoadsList,
                requiredAllianceStrengths = rule.requiredAllianceStrengthsList,
                requiredConsentToDepth = rule.requiredConsentToDepth,
                createdAt = rule.createdAt,
                updatedAt = rule.updatedAt,
                deletedAt = rule.deletedAt,
            )

        fun convertCreateRequestToProto(
            request: CounselTechniqueTransitionRuleDto.CreateRequest
        ): CreateCounselTechniqueTransitionRuleRequest = createCounselTechniqueTransitionRuleRequest {
            fromCounselTechniqueId = request.fromCounselTechniqueId
            toCounselTechniqueId = request.toCounselTechniqueId
            priority = request.priority
            request.minCurrentTechniqueMessageCount?.let {
                minCurrentTechniqueMessageCount = request.minCurrentTechniqueMessageCount
            }
            request.maxCurrentTechniqueMessageCount?.let {
                maxCurrentTechniqueMessageCount = request.maxCurrentTechniqueMessageCount
            }
            requiredImpactDomains += request.requiredImpactDomains
            requiredTimeframes += request.requiredTimeframes
            requiredEmotionPrimaries += request.requiredEmotionPrimaries
            requiredValences += request.requiredValences
            requiredArousalLevels += request.requiredArousalLevels
            request.minEmotionIntensity?.let {
                minEmotionIntensity = request.minEmotionIntensity
            }
            request.maxEmotionIntensity?.let {
                maxEmotionIntensity = request.maxEmotionIntensity
            }
            requiredPerceivedControls += request.requiredPerceivedControls
            requiredMotivationStages += request.requiredMotivationStages
            request.minSelfEfficacy?.let {
                minSelfEfficacy = request.minSelfEfficacy
            }
            request.maxSelfEfficacy?.let {
                maxSelfEfficacy = request.maxSelfEfficacy
            }
            requiredSocialSupportLevels += request.requiredSocialSupportLevels
            requiredRiskKinds += request.requiredRiskKinds
            request.minRiskSeverity?.let {
                minRiskSeverity = request.minRiskSeverity
            }
            request.maxRiskSeverity?.let {
                maxRiskSeverity = request.maxRiskSeverity
            }
            requiredSleepQualities += request.requiredSleepQualities
            requiredPhysicalSymptomsPresent = request.requiredPhysicalSymptomsPresent
            requiredCognitiveLoads += request.requiredCognitiveLoads
            requiredAllianceStrengths += request.requiredAllianceStrengths
            request.requiredConsentToDepth?.let {
                requiredConsentToDepth = request.requiredConsentToDepth
            }
        }

        fun convertUpdateRequestToProto(
            ruleId: String,
            request: CounselTechniqueTransitionRuleDto.UpdateRequest
        ): UpdateCounselTechniqueTransitionRuleRequest = updateCounselTechniqueTransitionRuleRequest {
            counselTechniqueTransitionRuleId = ruleId
             priority = request.priority
            request.minCurrentTechniqueMessageCount?.let {
                minCurrentTechniqueMessageCount = request.minCurrentTechniqueMessageCount
            }
            request.maxCurrentTechniqueMessageCount?.let {
                maxCurrentTechniqueMessageCount = request.maxCurrentTechniqueMessageCount
            }
            requiredImpactDomains += request.requiredImpactDomains
            requiredTimeframes += request.requiredTimeframes
            requiredEmotionPrimaries += request.requiredEmotionPrimaries
            requiredValences += request.requiredValences
            requiredArousalLevels += request.requiredArousalLevels
            request.minEmotionIntensity?.let {
                minEmotionIntensity = request.minEmotionIntensity
            }
            request.maxEmotionIntensity?.let {
                maxEmotionIntensity = request.maxEmotionIntensity
            }
            requiredPerceivedControls += request.requiredPerceivedControls
            requiredMotivationStages += request.requiredMotivationStages
            request.minSelfEfficacy?.let {
                minSelfEfficacy = request.minSelfEfficacy
            }
            request.maxSelfEfficacy?.let {
                maxSelfEfficacy = request.maxSelfEfficacy
            }
            requiredSocialSupportLevels += request.requiredSocialSupportLevels
            requiredRiskKinds += request.requiredRiskKinds
            request.minRiskSeverity?.let {
                minRiskSeverity = request.minRiskSeverity
            }
            request.maxRiskSeverity?.let {
                maxRiskSeverity = request.maxRiskSeverity
            }
            requiredSleepQualities += request.requiredSleepQualities
            request.requiredPhysicalSymptomsPresent?.let {
                requiredPhysicalSymptomsPresent = request.requiredPhysicalSymptomsPresent
            }
            requiredCognitiveLoads += request.requiredCognitiveLoads
            requiredAllianceStrengths += request.requiredAllianceStrengths
            request.requiredConsentToDepth?.let {
                requiredConsentToDepth = request.requiredConsentToDepth
            }
        }

        fun convertFindRequestToProto(
            request: CounselTechniqueTransitionRuleDto.FindRequest
        ): FindCounselTechniqueTransitionRulesRequest = findCounselTechniqueTransitionRulesRequest {
            request.fromCounselTechniqueId?.let {
                fromCounselTechniqueId = request.fromCounselTechniqueId
            }
            request.toCounselTechniqueId?.let {
                toCounselTechniqueId = request.toCounselTechniqueId
            }
            request.promptVersionId?.let {
                promptVersionId = request.promptVersionId
            }
        }
    }
}


