package com.mtk.apirestfulmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mtk.apirestfulmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	// REFERÊNCIA: https://www.mongodb.com/docs/manual/reference/operator/query/regex/
	// "?0" -> serve para aproveitar o PRIMEIRO parâmetro obtido pelo método. (?x)
	@Query("{'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	// REFERÊNCIA: https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/ -> (Buscar por Query)
	//             https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
	List<Post> findByTitleContainingIgnoreCase(String text);
}
