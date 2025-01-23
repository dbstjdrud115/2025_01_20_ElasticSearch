package com.ll.elk.domain.post.postDoc.controller;

import com.ll.elk.domain.post.postDoc.document.PostDoc;
import com.ll.elk.domain.post.postDoc.service.PostDocService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/postDocs")
@Validated
public class ApiV1Controller {

    private final PostDocService postDocService;

    //6강~10강.  Kibana설치 전에는 조회는 ElasticSearch. 등록은 Backend를 호출하여 실행했는데,
    //둘이 분리되어있었다.
    @GetMapping("/write")
    public PostDoc write(@NotBlank String title
                        ,@NotBlank String content) {
        return postDocService.write(title, content);
    }

    @PostMapping("/write")
    public void writeAsKibana( String title,  String content) {
        postDocService.write(title, content);
    }
}
