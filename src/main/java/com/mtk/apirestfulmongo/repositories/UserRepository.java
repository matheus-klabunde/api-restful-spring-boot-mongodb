package com.mtk.apirestfulmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtk.apirestfulmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
