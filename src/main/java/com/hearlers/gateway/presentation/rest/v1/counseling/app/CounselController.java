package com.hearlers.gateway.presentation.rest.v1.counseling.app;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "상담", description = "상담 관련 API")
public class CounselController {

}
