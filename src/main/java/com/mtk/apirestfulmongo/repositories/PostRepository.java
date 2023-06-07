package com.mtk.apirestfulmongo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mtk.apirestfulmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	// REFERÊNCIA: https://www.mongodb.com/docs/manual/reference/operator/query/regex/
	@Query("{'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	// REFERÊNCIA: https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/ -> (Buscar por Query)
	//             https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{ $and: [ { date: { $gte: ?1 } }, { date: { $lte: ?2 } } , { $or: [ {'title': { $regex: ?0, $options: 'i' } }, {'body': { $regex: ?0, $options: 'i' } }, {'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
