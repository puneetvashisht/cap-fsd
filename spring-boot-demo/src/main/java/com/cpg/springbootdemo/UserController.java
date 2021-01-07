package com.cpg.springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
	
	
	@Autowired
	UserService userService;

	@GetMapping("/")
	public List<User> fetchAllEmployees(){
		return userService.findAllUsers();
	}
	
	
	@PostMapping("/")
	public void add(@RequestBody User user) {
		userService.register(user);
	}

}
