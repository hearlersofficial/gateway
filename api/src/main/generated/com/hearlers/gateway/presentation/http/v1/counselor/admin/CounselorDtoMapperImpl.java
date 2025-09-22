package com.hearlers.gateway.presentation.http.v1.counselor.admin;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.EpisodeCutScene;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateBubbleRequest;
import com.hearlers.api.proto.v1.service.CreateCounselorRequest;
import com.hearlers.api.proto.v1.service.CreateEpisodeRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindBubbleByIdRequest;
import com.hearlers.api.proto.v1.service.FindBubblesRequest;
import com.hearlers.api.proto.v1.service.FindCounselorByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest;
import com.hearlers.api.proto.v1.service.FindEpisodesRequest;
import com.hearlers.api.proto.v1.service.FindRandomBubbleRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest;
import com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest;
import com.hearlers.api.proto.v1.service.SaveEpisodeCutSceneRequest;
import com.hearlers.api.proto.v1.service.UpdateBubbleRequest;
import com.hearlers.api.proto.v1.service.UpdateEpisodeRequest;
import com.hearlers.gateway.shared.response.PresignedUrlResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-22T21:21:44+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
public class CounselorDtoMapperImpl implements CounselorDtoMapper {

    @Override
    public CounselorDto.Counselor of(Counselor counselor) {
        if ( counselor == null ) {
            return null;
        }

        CounselorDto.Counselor.CounselorBuilder counselor1 = CounselorDto.Counselor.builder();

        if ( counselor.getId() != null ) {
            counselor1.id( counselor.getId() );
        }
        if ( counselor.getToneId() != null ) {
            counselor1.toneId( counselor.getToneId() );
        }
        if ( counselor.getName() != null ) {
            counselor1.name( counselor.getName() );
        }
        if ( counselor.getDescription() != null ) {
            counselor1.description( counselor.getDescription() );
        }
        if ( counselor.getProfileImage() != null ) {
            counselor1.profileImage( counselor.getProfileImage() );
        }
        if ( counselor.getGender() != null ) {
            counselor1.gender( counselor.getGender() );
        }
        if ( counselor.getCreatedAt() != null ) {
            counselor1.createdAt( counselor.getCreatedAt() );
        }
        if ( counselor.getUpdatedAt() != null ) {
            counselor1.updatedAt( counselor.getUpdatedAt() );
        }
        if ( counselor.hasDeletedAt() ) {
            counselor1.deletedAt( counselor.getDeletedAt() );
        }

        return counselor1.build();
    }

    @Override
    public CounselorDto.Tone of(Tone tone) {
        if ( tone == null ) {
            return null;
        }

        CounselorDto.Tone.ToneBuilder tone1 = CounselorDto.Tone.builder();

        if ( tone.getId() != null ) {
            tone1.id( tone.getId() );
        }
        if ( tone.getName() != null ) {
            tone1.name( tone.getName() );
        }
        if ( tone.getDescription() != null ) {
            tone1.description( tone.getDescription() );
        }
        if ( tone.getCreatedAt() != null ) {
            tone1.createdAt( tone.getCreatedAt() );
        }
        if ( tone.getUpdatedAt() != null ) {
            tone1.updatedAt( tone.getUpdatedAt() );
        }
        if ( tone.hasDeletedAt() ) {
            tone1.deletedAt( tone.getDeletedAt() );
        }

        return tone1.build();
    }

    @Override
    public CounselorDto.Bubble of(Bubble bubble) {
        if ( bubble == null ) {
            return null;
        }

        CounselorDto.Bubble.BubbleBuilder bubble1 = CounselorDto.Bubble.builder();

        if ( bubble.getId() != null ) {
            bubble1.id( bubble.getId() );
        }
        if ( bubble.getQuestion() != null ) {
            bubble1.question( bubble.getQuestion() );
        }
        if ( bubble.getResponseOption1() != null ) {
            bubble1.responseOption1( bubble.getResponseOption1() );
        }
        if ( bubble.getResponseOption2() != null ) {
            bubble1.responseOption2( bubble.getResponseOption2() );
        }
        if ( bubble.getCreatedAt() != null ) {
            bubble1.createdAt( bubble.getCreatedAt() );
        }
        if ( bubble.getUpdatedAt() != null ) {
            bubble1.updatedAt( bubble.getUpdatedAt() );
        }
        if ( bubble.hasDeletedAt() ) {
            bubble1.deletedAt( bubble.getDeletedAt() );
        }

        return bubble1.build();
    }

    @Override
    public FindCounselorByIdRequest toFindCounselorRequest(String counselorId) {
        if ( counselorId == null ) {
            return null;
        }

        FindCounselorByIdRequest.Builder findCounselorByIdRequest = FindCounselorByIdRequest.newBuilder();

        if ( counselorId != null ) {
            findCounselorByIdRequest.setCounselorId( counselorId );
        }

        return findCounselorByIdRequest.build();
    }

    @Override
    public CounselorDto.FindCounselorByIdResponse toFindCounselorResponse(Counselor counselor) {
        if ( counselor == null ) {
            return null;
        }

        CounselorDto.FindCounselorByIdResponse.FindCounselorByIdResponseBuilder findCounselorByIdResponse = CounselorDto.FindCounselorByIdResponse.builder();

        if ( counselor != null ) {
            findCounselorByIdResponse.counselor( of( counselor ) );
        }

        return findCounselorByIdResponse.build();
    }

    @Override
    public FindCounselorsRequest toFindCounselorsRequest(CounselorDto.FindCounselorsRequest request) {
        if ( request == null ) {
            return null;
        }

        FindCounselorsRequest.Builder findCounselorsRequest = FindCounselorsRequest.newBuilder();

        if ( request.getToneId() != null ) {
            findCounselorsRequest.setToneId( request.getToneId() );
        }

        return findCounselorsRequest.build();
    }

    @Override
    public CreateCounselorRequest toCreateCounselorRequest(CounselorDto.CreateCounselorRequest request) {
        if ( request == null ) {
            return null;
        }

        CreateCounselorRequest.Builder createCounselorRequest = CreateCounselorRequest.newBuilder();

        if ( request.getGender() != null ) {
            createCounselorRequest.setCounselorGender( request.getGender() );
        }
        if ( request.getToneId() != null ) {
            createCounselorRequest.setToneId( request.getToneId() );
        }
        if ( request.getName() != null ) {
            createCounselorRequest.setName( request.getName() );
        }
        if ( request.getDescription() != null ) {
            createCounselorRequest.setDescription( request.getDescription() );
        }
        if ( request.getProfileImage() != null ) {
            createCounselorRequest.setProfileImage( request.getProfileImage() );
        }

        return createCounselorRequest.build();
    }

    @Override
    public CounselorDto.CreateCounselorResponse toCreateCounselorResponse(Counselor counselor) {
        if ( counselor == null ) {
            return null;
        }

        CounselorDto.CreateCounselorResponse.CreateCounselorResponseBuilder createCounselorResponse = CounselorDto.CreateCounselorResponse.builder();

        if ( counselor != null ) {
            createCounselorResponse.counselor( of( counselor ) );
        }

        return createCounselorResponse.build();
    }

    @Override
    public CounselorDto.UpdateCounselorResponse toUpdateCounselorResponse(Counselor counselor) {
        if ( counselor == null ) {
            return null;
        }

        CounselorDto.UpdateCounselorResponse.UpdateCounselorResponseBuilder updateCounselorResponse = CounselorDto.UpdateCounselorResponse.builder();

        if ( counselor != null ) {
            updateCounselorResponse.counselor( of( counselor ) );
        }

        return updateCounselorResponse.build();
    }

    @Override
    public GenerateCounselorImageUrlRequest toGenerateCounselorImageUrlRequest(CounselorDto.GenerateCounselorImageUrlRequest request, String counselorId) {
        if ( request == null && counselorId == null ) {
            return null;
        }

        GenerateCounselorImageUrlRequest.Builder generateCounselorImageUrlRequest = GenerateCounselorImageUrlRequest.newBuilder();

        if ( request != null ) {
            if ( request.getExtension() != null ) {
                generateCounselorImageUrlRequest.setExtension( request.getExtension() );
            }
        }
        if ( counselorId != null ) {
            generateCounselorImageUrlRequest.setCounselorId( counselorId );
        }

        return generateCounselorImageUrlRequest.build();
    }

    @Override
    public CounselorDto.GenerateCounselorImageUrlResponse toGenerateCounselorImageUrlResponse(PresignedUrl presignedUrl) {
        if ( presignedUrl == null ) {
            return null;
        }

        CounselorDto.GenerateCounselorImageUrlResponse.GenerateCounselorImageUrlResponseBuilder generateCounselorImageUrlResponse = CounselorDto.GenerateCounselorImageUrlResponse.builder();

        if ( presignedUrl != null ) {
            generateCounselorImageUrlResponse.presignedUrl( presignedUrlToPresignedUrlResponse( presignedUrl ) );
        }

        return generateCounselorImageUrlResponse.build();
    }

    @Override
    public FindToneByIdRequest toFindToneRequest(String toneId) {
        if ( toneId == null ) {
            return null;
        }

        FindToneByIdRequest.Builder findToneByIdRequest = FindToneByIdRequest.newBuilder();

        if ( toneId != null ) {
            findToneByIdRequest.setToneId( toneId );
        }

        return findToneByIdRequest.build();
    }

    @Override
    public CounselorDto.FindToneByIdResponse toFindToneResponse(Tone tone) {
        if ( tone == null ) {
            return null;
        }

        CounselorDto.FindToneByIdResponse.FindToneByIdResponseBuilder findToneByIdResponse = CounselorDto.FindToneByIdResponse.builder();

        if ( tone != null ) {
            findToneByIdResponse.tone( of( tone ) );
        }

        return findToneByIdResponse.build();
    }

    @Override
    public FindTonesRequest toFindTonesRequest(CounselorDto.FindTonesRequest request) {
        if ( request == null ) {
            return null;
        }

        FindTonesRequest.Builder findTonesRequest = FindTonesRequest.newBuilder();

        if ( request.getName() != null ) {
            findTonesRequest.setName( request.getName() );
        }

        return findTonesRequest.build();
    }

    @Override
    public CreateToneRequest toCreateToneRequest(CounselorDto.CreateToneRequest request) {
        if ( request == null ) {
            return null;
        }

        CreateToneRequest.Builder createToneRequest = CreateToneRequest.newBuilder();

        if ( request.getName() != null ) {
            createToneRequest.setName( request.getName() );
        }
        if ( request.getDescription() != null ) {
            createToneRequest.setDescription( request.getDescription() );
        }

        return createToneRequest.build();
    }

    @Override
    public CounselorDto.CreateToneResponse toCreateToneResponse(Tone tone) {
        if ( tone == null ) {
            return null;
        }

        CounselorDto.CreateToneResponse.CreateToneResponseBuilder createToneResponse = CounselorDto.CreateToneResponse.builder();

        if ( tone != null ) {
            createToneResponse.tone( of( tone ) );
        }

        return createToneResponse.build();
    }

    @Override
    public CounselorDto.UpdateToneResponse toUpdateToneResponse(Tone tone) {
        if ( tone == null ) {
            return null;
        }

        CounselorDto.UpdateToneResponse.UpdateToneResponseBuilder updateToneResponse = CounselorDto.UpdateToneResponse.builder();

        if ( tone != null ) {
            updateToneResponse.tone( of( tone ) );
        }

        return updateToneResponse.build();
    }

    @Override
    public GenerateCutSceneImageUrlRequest toGenerateCutSceneImageUrlRequest(CounselorDto.GenerateCutSceneImageUrlRequest request, String episodeId) {
        if ( request == null && episodeId == null ) {
            return null;
        }

        GenerateCutSceneImageUrlRequest.Builder generateCutSceneImageUrlRequest = GenerateCutSceneImageUrlRequest.newBuilder();

        if ( request != null ) {
            if ( request.getExtension() != null ) {
                generateCutSceneImageUrlRequest.setExtension( request.getExtension() );
            }
        }

        return generateCutSceneImageUrlRequest.build();
    }

    @Override
    public CounselorDto.GenerateCutSceneImageUrlResponse toGenerateCutSceneImageUrlResponse(PresignedUrl presignedUrl) {
        if ( presignedUrl == null ) {
            return null;
        }

        CounselorDto.GenerateCutSceneImageUrlResponse.GenerateCutSceneImageUrlResponseBuilder generateCutSceneImageUrlResponse = CounselorDto.GenerateCutSceneImageUrlResponse.builder();

        if ( presignedUrl != null ) {
            generateCutSceneImageUrlResponse.presignedUrl( presignedUrlToPresignedUrlResponse( presignedUrl ) );
        }

        return generateCutSceneImageUrlResponse.build();
    }

    @Override
    public CounselorDto.Episode of(Episode episode) {
        if ( episode == null ) {
            return null;
        }

        CounselorDto.Episode.EpisodeBuilder episode1 = CounselorDto.Episode.builder();

        List<CounselorDto.EpisodeCutScene> list = episodeCutSceneListToEpisodeCutSceneList( episode.getCutScenesList() );
        if ( list != null ) {
            episode1.cutScenes( list );
        }
        if ( episode.getId() != null ) {
            episode1.id( episode.getId() );
        }
        if ( episode.getCounselorId() != null ) {
            episode1.counselorId( episode.getCounselorId() );
        }
        if ( episode.getTitle() != null ) {
            episode1.title( episode.getTitle() );
        }
        episode1.requiredRapportThreshold( episode.getRequiredRapportThreshold() );
        episode1.isTemporary( episode.getIsTemporary() );
        if ( episode.getCreatedAt() != null ) {
            episode1.createdAt( episode.getCreatedAt() );
        }
        if ( episode.getUpdatedAt() != null ) {
            episode1.updatedAt( episode.getUpdatedAt() );
        }
        if ( episode.hasDeletedAt() ) {
            episode1.deletedAt( episode.getDeletedAt() );
        }

        return episode1.build();
    }

    @Override
    public CounselorDto.EpisodeCutScene of(EpisodeCutScene episodeCutScene) {
        if ( episodeCutScene == null ) {
            return null;
        }

        CounselorDto.EpisodeCutScene.EpisodeCutSceneBuilder episodeCutScene1 = CounselorDto.EpisodeCutScene.builder();

        if ( episodeCutScene.getId() != null ) {
            episodeCutScene1.id( episodeCutScene.getId() );
        }
        if ( episodeCutScene.getEpisodeId() != null ) {
            episodeCutScene1.episodeId( episodeCutScene.getEpisodeId() );
        }
        if ( episodeCutScene.getSpeaker() != null ) {
            episodeCutScene1.speaker( episodeCutScene.getSpeaker() );
        }
        if ( episodeCutScene.getContent() != null ) {
            episodeCutScene1.content( episodeCutScene.getContent() );
        }
        episodeCutScene1.orderIndex( episodeCutScene.getOrderIndex() );
        if ( episodeCutScene.getImage() != null ) {
            episodeCutScene1.image( episodeCutScene.getImage() );
        }
        if ( episodeCutScene.getCreatedAt() != null ) {
            episodeCutScene1.createdAt( episodeCutScene.getCreatedAt() );
        }
        if ( episodeCutScene.getUpdatedAt() != null ) {
            episodeCutScene1.updatedAt( episodeCutScene.getUpdatedAt() );
        }
        if ( episodeCutScene.hasDeletedAt() ) {
            episodeCutScene1.deletedAt( episodeCutScene.getDeletedAt() );
        }

        return episodeCutScene1.build();
    }

    @Override
    public FindEpisodeByIdRequest toFindEpisodeByIdRequest(String episodeId, Boolean withTemporary) {
        if ( episodeId == null && withTemporary == null ) {
            return null;
        }

        FindEpisodeByIdRequest.Builder findEpisodeByIdRequest = FindEpisodeByIdRequest.newBuilder();

        if ( episodeId != null ) {
            findEpisodeByIdRequest.setEpisodeId( episodeId );
        }
        if ( withTemporary != null ) {
            findEpisodeByIdRequest.setWithTemporary( withTemporary );
        }

        return findEpisodeByIdRequest.build();
    }

    @Override
    public CounselorDto.FindEpisodeByIdResponse toFindEpisodeByIdResponse(Episode episode) {
        if ( episode == null ) {
            return null;
        }

        CounselorDto.FindEpisodeByIdResponse.FindEpisodeByIdResponseBuilder findEpisodeByIdResponse = CounselorDto.FindEpisodeByIdResponse.builder();

        if ( episode != null ) {
            findEpisodeByIdResponse.episode( of( episode ) );
        }

        return findEpisodeByIdResponse.build();
    }

    @Override
    public FindEpisodesRequest toFindEpisodesRequest(String counselorId, Boolean withTemporary) {
        if ( counselorId == null && withTemporary == null ) {
            return null;
        }

        FindEpisodesRequest.Builder findEpisodesRequest = FindEpisodesRequest.newBuilder();

        if ( counselorId != null ) {
            findEpisodesRequest.setCounselorId( counselorId );
        }
        if ( withTemporary != null ) {
            findEpisodesRequest.setWithTemporary( withTemporary );
        }

        return findEpisodesRequest.build();
    }

    @Override
    public CreateEpisodeRequest toPartialCreateEpisodeRequest(String counselorId, CounselorDto.CreateEpisodeRequest request) {
        if ( counselorId == null && request == null ) {
            return null;
        }

        CreateEpisodeRequest.Builder createEpisodeRequest = CreateEpisodeRequest.newBuilder();

        if ( request != null ) {
            if ( request.getTitle() != null ) {
                createEpisodeRequest.setTitle( request.getTitle() );
            }
            if ( request.getRequiredRapportThreshold() != null ) {
                createEpisodeRequest.setRequiredRapportThreshold( request.getRequiredRapportThreshold() );
            }
            if ( request.getIsTemporary() != null ) {
                createEpisodeRequest.setIsTemporary( request.getIsTemporary() );
            }
        }
        if ( counselorId != null ) {
            createEpisodeRequest.setCounselorId( counselorId );
        }

        return createEpisodeRequest.build();
    }

    @Override
    public UpdateEpisodeRequest toPartialUpdateEpisodeRequest(String episodeId, CounselorDto.UpdateEpisodeRequest request) {
        if ( episodeId == null && request == null ) {
            return null;
        }

        UpdateEpisodeRequest.Builder updateEpisodeRequest = UpdateEpisodeRequest.newBuilder();

        if ( request != null ) {
            if ( request.getTitle() != null ) {
                updateEpisodeRequest.setTitle( request.getTitle() );
            }
            if ( request.getRequiredRapportThreshold() != null ) {
                updateEpisodeRequest.setRequiredRapportThreshold( request.getRequiredRapportThreshold() );
            }
            if ( request.getIsTemporary() != null ) {
                updateEpisodeRequest.setIsTemporary( request.getIsTemporary() );
            }
        }
        if ( episodeId != null ) {
            updateEpisodeRequest.setEpisodeId( episodeId );
        }

        return updateEpisodeRequest.build();
    }

    @Override
    public CounselorDto.UpdateEpisodeResponse toUpdateEpisodeResponse(Episode episode) {
        if ( episode == null ) {
            return null;
        }

        CounselorDto.UpdateEpisodeResponse.UpdateEpisodeResponseBuilder updateEpisodeResponse = CounselorDto.UpdateEpisodeResponse.builder();

        if ( episode != null ) {
            updateEpisodeResponse.episode( of( episode ) );
        }

        return updateEpisodeResponse.build();
    }

    @Override
    public SaveEpisodeCutSceneRequest toSaveEpisodeCutSceneRequest(CounselorDto.SaveEpisodeCutSceneRequest request) {
        if ( request == null ) {
            return null;
        }

        SaveEpisodeCutSceneRequest.Builder saveEpisodeCutSceneRequest = SaveEpisodeCutSceneRequest.newBuilder();

        if ( request.getId() != null ) {
            saveEpisodeCutSceneRequest.setId( request.getId() );
        }
        if ( request.getSpeaker() != null ) {
            saveEpisodeCutSceneRequest.setSpeaker( request.getSpeaker() );
        }
        if ( request.getContent() != null ) {
            saveEpisodeCutSceneRequest.setContent( request.getContent() );
        }
        if ( request.getOrderIndex() != null ) {
            saveEpisodeCutSceneRequest.setOrderIndex( request.getOrderIndex() );
        }
        if ( request.getImage() != null ) {
            saveEpisodeCutSceneRequest.setImage( request.getImage() );
        }

        return saveEpisodeCutSceneRequest.build();
    }

    @Override
    public SaveEpisodeCutSceneRequest toSaveEpisodeCutSceneRequest(CounselorDto.SaveNewEpisodeCutSceneRequest request) {
        if ( request == null ) {
            return null;
        }

        SaveEpisodeCutSceneRequest.Builder saveEpisodeCutSceneRequest = SaveEpisodeCutSceneRequest.newBuilder();

        if ( request.getSpeaker() != null ) {
            saveEpisodeCutSceneRequest.setSpeaker( request.getSpeaker() );
        }
        if ( request.getContent() != null ) {
            saveEpisodeCutSceneRequest.setContent( request.getContent() );
        }
        if ( request.getOrderIndex() != null ) {
            saveEpisodeCutSceneRequest.setOrderIndex( request.getOrderIndex() );
        }
        if ( request.getImage() != null ) {
            saveEpisodeCutSceneRequest.setImage( request.getImage() );
        }

        return saveEpisodeCutSceneRequest.build();
    }

    @Override
    public CreateBubbleRequest toCreateBubbleRequest(String counselorId, CounselorDto.CreateBubbleRequest request) {
        if ( counselorId == null && request == null ) {
            return null;
        }

        CreateBubbleRequest.Builder createBubbleRequest = CreateBubbleRequest.newBuilder();

        if ( request != null ) {
            if ( request.getQuestion() != null ) {
                createBubbleRequest.setQuestion( request.getQuestion() );
            }
            if ( request.getResponseOption1() != null ) {
                createBubbleRequest.setResponseOption1( request.getResponseOption1() );
            }
            if ( request.getResponseOption2() != null ) {
                createBubbleRequest.setResponseOption2( request.getResponseOption2() );
            }
        }
        if ( counselorId != null ) {
            createBubbleRequest.setCounselorId( counselorId );
        }

        return createBubbleRequest.build();
    }

    @Override
    public CounselorDto.CreateBubbleResponse toCreateBubbleResponse(Bubble bubble) {
        if ( bubble == null ) {
            return null;
        }

        CounselorDto.CreateBubbleResponse.CreateBubbleResponseBuilder createBubbleResponse = CounselorDto.CreateBubbleResponse.builder();

        if ( bubble != null ) {
            createBubbleResponse.bubble( of( bubble ) );
        }

        return createBubbleResponse.build();
    }

    @Override
    public UpdateBubbleRequest toUpdateBubbleRequest(String counselorId, String bubbleId, CounselorDto.UpdateBubbleRequest request) {
        if ( counselorId == null && bubbleId == null && request == null ) {
            return null;
        }

        UpdateBubbleRequest.Builder updateBubbleRequest = UpdateBubbleRequest.newBuilder();

        if ( request != null ) {
            if ( request.getQuestion() != null ) {
                updateBubbleRequest.setQuestion( request.getQuestion() );
            }
            if ( request.getResponseOption1() != null ) {
                updateBubbleRequest.setResponseOption1( request.getResponseOption1() );
            }
            if ( request.getResponseOption2() != null ) {
                updateBubbleRequest.setResponseOption2( request.getResponseOption2() );
            }
        }
        if ( counselorId != null ) {
            updateBubbleRequest.setCounselorId( counselorId );
        }
        if ( bubbleId != null ) {
            updateBubbleRequest.setBubbleId( bubbleId );
        }

        return updateBubbleRequest.build();
    }

    @Override
    public CounselorDto.UpdateBubbleResponse toUpdateBubbleResponse(Bubble bubble) {
        if ( bubble == null ) {
            return null;
        }

        CounselorDto.UpdateBubbleResponse.UpdateBubbleResponseBuilder updateBubbleResponse = CounselorDto.UpdateBubbleResponse.builder();

        if ( bubble != null ) {
            updateBubbleResponse.bubble( of( bubble ) );
        }

        return updateBubbleResponse.build();
    }

    @Override
    public FindBubbleByIdRequest toFindBubbleByIdRequest(String counselorId, String bubbleId) {
        if ( counselorId == null && bubbleId == null ) {
            return null;
        }

        FindBubbleByIdRequest.Builder findBubbleByIdRequest = FindBubbleByIdRequest.newBuilder();

        if ( counselorId != null ) {
            findBubbleByIdRequest.setCounselorId( counselorId );
        }
        if ( bubbleId != null ) {
            findBubbleByIdRequest.setBubbleId( bubbleId );
        }

        return findBubbleByIdRequest.build();
    }

    @Override
    public CounselorDto.FindBubbleByIdResponse toFindBubbleByIdResponse(Bubble bubble) {
        if ( bubble == null ) {
            return null;
        }

        CounselorDto.FindBubbleByIdResponse.FindBubbleByIdResponseBuilder findBubbleByIdResponse = CounselorDto.FindBubbleByIdResponse.builder();

        if ( bubble != null ) {
            findBubbleByIdResponse.bubble( of( bubble ) );
        }

        return findBubbleByIdResponse.build();
    }

    @Override
    public FindBubblesRequest toFindBubblesRequest(String counselorId) {
        if ( counselorId == null ) {
            return null;
        }

        FindBubblesRequest.Builder findBubblesRequest = FindBubblesRequest.newBuilder();

        if ( counselorId != null ) {
            findBubblesRequest.setCounselorId( counselorId );
        }

        return findBubblesRequest.build();
    }

    @Override
    public FindRandomBubbleRequest toFindRandomBubbleRequest(String counselorId) {
        if ( counselorId == null ) {
            return null;
        }

        FindRandomBubbleRequest.Builder findRandomBubbleRequest = FindRandomBubbleRequest.newBuilder();

        if ( counselorId != null ) {
            findRandomBubbleRequest.setCounselorId( counselorId );
        }

        return findRandomBubbleRequest.build();
    }

    @Override
    public CounselorDto.FindRandomBubbleResponse toFindRandomBubbleResponse(Bubble bubble) {
        if ( bubble == null ) {
            return null;
        }

        CounselorDto.FindRandomBubbleResponse.FindRandomBubbleResponseBuilder findRandomBubbleResponse = CounselorDto.FindRandomBubbleResponse.builder();

        if ( bubble != null ) {
            findRandomBubbleResponse.bubble( of( bubble ) );
        }

        return findRandomBubbleResponse.build();
    }

    protected PresignedUrlResponse presignedUrlToPresignedUrlResponse(PresignedUrl presignedUrl) {
        if ( presignedUrl == null ) {
            return null;
        }

        PresignedUrlResponse.PresignedUrlResponseBuilder presignedUrlResponse = PresignedUrlResponse.builder();

        if ( presignedUrl.getUploadUrl() != null ) {
            presignedUrlResponse.uploadUrl( presignedUrl.getUploadUrl() );
        }
        if ( presignedUrl.getPublicUrl() != null ) {
            presignedUrlResponse.publicUrl( presignedUrl.getPublicUrl() );
        }
        if ( presignedUrl.getExpiresAt() != null ) {
            presignedUrlResponse.expiresAt( presignedUrl.getExpiresAt() );
        }

        return presignedUrlResponse.build();
    }

    protected List<CounselorDto.EpisodeCutScene> episodeCutSceneListToEpisodeCutSceneList(List<EpisodeCutScene> list) {
        if ( list == null ) {
            return null;
        }

        List<CounselorDto.EpisodeCutScene> list1 = new ArrayList<CounselorDto.EpisodeCutScene>( list.size() );
        for ( EpisodeCutScene episodeCutScene : list ) {
            list1.add( of( episodeCutScene ) );
        }

        return list1;
    }
}
