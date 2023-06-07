package com.mtk.apirestfulmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtk.apirestfulmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	// REFERÊNCIA: https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/ -> (Buscar por Query)
	//             https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
	List<Post> findByTitleContainingIgnoreCase(String text);
}
