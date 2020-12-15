package com.cap.springwebdemo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public User getUser() {
		User user = new User("test@test", "testtest");
		return user;	
		
	}
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userRepo.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") int id) {
		System.out.println("Recieved id on path: "+ id);
		// code here to fetch user by id
		return null;
		
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.register(user);
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello from controller" + LocalDateTime.now();	
		
	}
	
	
	

}
