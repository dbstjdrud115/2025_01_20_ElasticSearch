package com.ll.elk.domain.post.postDoc.controller;

import com.ll.elk.domain.post.postDoc.document.PostDoc;
import com.ll.elk.domain.post.postDoc.service.PostDocService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
@Validated
public class ApiV1Controller {

    private final PostDocService postDocService;

    @GetMapping("/write")
    public PostDoc write(@NotBlank String title
                        ,@NotBlank String content) {
        postDocService.write(title, content);
    }
}
