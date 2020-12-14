package com.cpg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cpg.entities.User;
import com.cpg.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestUserService1 {
	
	@Autowired
	UserService service;

	@Test
	public void testRegister() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		UserService service = context.getBean(UserService.class);
		User user = new User("test1@test.com", "testtest");
		
		
		service.register(user);
	}

}
