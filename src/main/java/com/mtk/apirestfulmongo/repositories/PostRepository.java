package com.mtk.apirestfulmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtk.apirestfulmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
