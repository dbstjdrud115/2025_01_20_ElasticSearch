package com.ll.elk.domain.post.postDoc.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//Jpa의 Entity는 ElasticSearch에서 Document에 해당한다.
@Document(indexName = "app1_posts")
@Getter
@Setter
@Builder
public class PostDoc {
     @Id
     private String id;
     @Field(type = FieldType.Text)
     private String title;
     @Field(type = FieldType.Text)
     private String content;
}
