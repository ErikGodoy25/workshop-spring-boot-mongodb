package com.erikgodoy.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erikgodoy.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = new ArrayList<>();
		User maria = new User("1", "Maria Brow", "maria@gmail.com");
		User alex = new User("1", "Alex Green", "alex@gmail.com");
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
		
	}
}
