package com.mtk.apirestfulmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtk.apirestfulmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
