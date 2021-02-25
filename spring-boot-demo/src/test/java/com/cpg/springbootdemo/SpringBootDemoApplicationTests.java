package com.cpg.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	UserService service;

	@Test
	public void testRegister() {

		User user = new User("test2@test.com", "testtest");
		service.register(user);
	}

}
