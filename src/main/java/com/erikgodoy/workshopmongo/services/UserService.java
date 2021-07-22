package com.erikgodoy.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erikgodoy.workshopmongo.domain.User;
import com.erikgodoy.workshopmongo.repository.UserRepository;
import com.erikgodoy.workshopmongo.services.excepction.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.save(obj);
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
}
