package com.hearlers.gateway.presentation.http.v1.counselor.app;

import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.EpisodeCutScene;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.FindBubbleByIdRequest;
import com.hearlers.api.proto.v1.service.FindBubblesRequest;
import com.hearlers.api.proto.v1.service.FindCounselorByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest;
import com.hearlers.api.proto.v1.service.FindEpisodesRequest;
import com.hearlers.api.proto.v1.service.FindRandomBubbleRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-22T21:21:52+0900",
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
