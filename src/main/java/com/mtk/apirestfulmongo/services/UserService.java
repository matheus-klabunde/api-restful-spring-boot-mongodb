package com.mtk.apirestfulmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtk.apirestfulmongo.domain.User;
import com.mtk.apirestfulmongo.repositories.UserRepository;
import com.mtk.apirestfulmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(String id){
		Optional<User> result = userRepository.findById(id);
		return result.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
