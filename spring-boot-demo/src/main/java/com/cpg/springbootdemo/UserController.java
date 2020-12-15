package com.cpg.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class UserController {
	
	@GetMapping("/user")
	public String getUser() {
//		User user = new User("test@test", "testtest");
		return "successtest";
		
		
	}

}
