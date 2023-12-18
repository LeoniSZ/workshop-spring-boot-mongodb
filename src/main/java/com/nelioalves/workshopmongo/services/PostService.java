package com.nelioalves.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.repository.PostRepository;
import com.nelioalves.workshopmongo.services.expection.ObjectNotFoundException;

public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
