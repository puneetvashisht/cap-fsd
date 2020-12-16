package com.cap.springwebdemo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userRepo.findAll();
		
	}
	
//	@GetMapping("/users/{id}")
	@RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) throws Exception {
		ResponseEntity<User>  re = null;
		if(true)
		throw new Exception("deliberate exception");
		
		System.out.println("Recieved id on path: "+ id);
		// code here to fetch user by id
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			User userFound = user.get();
			re = new ResponseEntity<>(userFound, HttpStatus.OK);
		}
		else {
			re = new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	
	@GetMapping("/user")
	public ResponseEntity<User> getUserByName(@RequestParam("name") String name) {
		ResponseEntity<User>  re = null;
		System.out.println(name);
		User existingUser = userRepo.findByEmail(name);
		if(existingUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(existingUser, HttpStatus.OK);

		
	}
	
	@PostMapping("/users")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		
		User existingUser = userRepo.findByEmail(user.getEmail());
		if(existingUser != null) {
			return new ResponseEntity<String>("User already exists!!", HttpStatus.CONFLICT);
		}
		
		userService.register(user);
		
		ResponseEntity<String> re = new ResponseEntity<>("successfully registered user!!", HttpStatus.CREATED);
		return re;
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello from controller" + LocalDateTime.now();	
		
	}
	
	
	

}
