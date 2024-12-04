package com.hearlers.gateway.presentations.rest.counselors;

import com.hearlers.gateway.presentations.rest.counselors.dto.CreateCounselMessageRequestDto;
import com.hearlers.gateway.presentations.rest.counselors.dto.CreateCounselRequestDto;
import com.hearlers.gateway.presentations.rest.counselors.dto.GetCounselorsResponseDto;
import com.hearlers.gateway.shared.enums.CounselorName;
import com.hearlers.gateway.shared.enums.CounselorType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counselors")
public class CounselorsController {

    @PostMapping("/{counselorId}/counsels")
    public void createCounsel(
            @PathVariable("counselorId") int counselorId,
            @RequestBody(required = false) CreateCounselRequestDto request) {
        // TODO : 내부 서버와 통신하여 최초 상담 시작
        // CounselorId를 바탕으로 조회

        // TODO return 타입 변경 -> ResponseEntity<List<InitiateCounselResponseDto>>

    }

    @GetMapping("/{counselorId}/counsels/{counselId}")
    public void getCounsel(
            @PathVariable("counselorId") int counselorId,
            @PathVariable("counselId") int counselId) {
        // TODO : 내부 서버와 통신하여 상담 재개 (counselorId와 counselId로 조회해서)
        // TODO return 타입 변경 -> ResponseEntity<List<ResumeCounselResponseDto>>
    }

    @PostMapping("/{counselorId}/counsels/{counselId}")
    public void createCounselMessage(
            @PathVariable("counselorId") int counselorId,
            @PathVariable("counselId") int counselId,
            @RequestBody CreateCounselMessageRequestDto request) {
        // TODO : 내부 서버와 통신하여 상담 메시지 전송
        // TODO return 타입 변경 -> ResponseEntity<List<CreateCounselMessageResponseDto>>
        // 상담 제한 도달 시 403 Forbidden 에러 반환해주기
    }

    @GetMapping
    public ResponseEntity<List<GetCounselorsResponseDto>> getCounselors() {
        // TODO : 내부 서버와 통신하여 모든 상담사 정보 조회

        List<GetCounselorsResponseDto> counselors = new ArrayList<>();
        counselors.add(
                new GetCounselorsResponseDto(1, CounselorType.DEPRESSION, CounselorName.DAHYE, "Experienced counselor",
                        "Hello, I'm John",
                        "Option1", "Option2"));
        counselors.add(
                new GetCounselorsResponseDto(2, CounselorType.ANXIETY, CounselorName.JIHWAN, "Experienced counselor",
                        "Hello, I'm Jane",
                        "Option1", "Option2"));

        return ResponseEntity.ok(counselors);
    }

    @PostMapping("/{counselorId}/counsels/{counselId}/messages/{messageId}/like")
    public void likeCounselMessage(
            @PathVariable("counselorId") int counselorId,
            @PathVariable("counselId") int counselId,
            @PathVariable("messageId") int messageId) {
        // TODO : 내부 서버와 통신하여 상담 메시지 좋아요
    }

    @PostMapping("/{counselorId}/counsels/{counselId}/messages/{messageId}/dislike")
    public void dislikeCounselMessage(
            @PathVariable("counselorId") int counselorId,
            @PathVariable("counselId") int counselId,
            @PathVariable("messageId") int messageId) {
        // TODO : 내부 서버와 통신하여 상담 메시지 싫어요
    }
}
