package com.ll.elk.domain.post.postDoc.repository;

import com.ll.elk.domain.post.postDoc.document.PostDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDocRepository extends ElasticsearchRepository<PostDoc, String> {

}
