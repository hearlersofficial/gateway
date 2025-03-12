package com.hearlers.gateway.infrastructure.mapping;

import com.hearlers.api.proto.v1.model.CounselTechniqueStage;
import com.hearlers.gateway.shared.enums.CounselTechniqueStageType;

/**
 * Proto 모델과 도메인 모델 간의 enum 변환을 위한 매퍼 클래스
 */
public class EnumMapper {

    /**
     * Proto CounselTechniqueStage를 도메인 CounselTechniqueStageType으로 변환
     *
     * @param protoEnum Proto 모델의 CounselTechniqueStage enum
     * @return 도메인 모델의 CounselTechniqueStageType enum
     */
    public static CounselTechniqueStageType toDomainStageType(CounselTechniqueStage protoEnum) {
        if (protoEnum == null) {
            return CounselTechniqueStageType.UNSPECIFIED;
        }
        
        switch (protoEnum) {
            case COUNSEL_TECHNIQUE_STAGE_INITIAL:
                return CounselTechniqueStageType.INITIAL;
            case COUNSEL_TECHNIQUE_STAGE_MIDDLE:
                return CounselTechniqueStageType.MIDDLE;
            case COUNSEL_TECHNIQUE_STAGE_UNSPECIFIED:
            default:
                return CounselTechniqueStageType.UNSPECIFIED;
        }
    }

    /**
     * 도메인 CounselTechniqueStageType을 Proto CounselTechniqueStage로 변환
     *
     * @param domainEnum 도메인 모델의 CounselTechniqueStageType enum
     * @return Proto 모델의 CounselTechniqueStage enum
     */
    public static CounselTechniqueStage toProtoStage(CounselTechniqueStageType domainEnum) {
        if (domainEnum == null) {
            return CounselTechniqueStage.COUNSEL_TECHNIQUE_STAGE_UNSPECIFIED;
        }
        
        switch (domainEnum) {
            case INITIAL:
                return CounselTechniqueStage.COUNSEL_TECHNIQUE_STAGE_INITIAL;
            case MIDDLE:
                return CounselTechniqueStage.COUNSEL_TECHNIQUE_STAGE_MIDDLE;
            case UNSPECIFIED:
            default:
                return CounselTechniqueStage.COUNSEL_TECHNIQUE_STAGE_UNSPECIFIED;
        }
    }
    
}