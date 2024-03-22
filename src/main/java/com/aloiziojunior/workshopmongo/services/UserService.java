package com.aloiziojunior.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloiziojunior.workshopmongo.domain.User;
import com.aloiziojunior.workshopmongo.repository.UserRepository;
import com.aloiziojunior.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> optuUser = repo.findById(id);
		if (optuUser.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		User user = optuUser.get();
		return user;
	}
}
