package com.aloiziojunior.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloiziojunior.workshopmongo.domain.Post;
import com.aloiziojunior.workshopmongo.repository.PostRepository;
import com.aloiziojunior.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> optPost = repo.findById(id);
		if (optPost.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		Post post = optPost.get();
		return post;
	}
	
}
