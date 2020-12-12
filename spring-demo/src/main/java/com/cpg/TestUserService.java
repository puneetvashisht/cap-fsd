package com.cpg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpg.services.UserService;

public class TestUserService {
	
	//1. Get core, context dependencies
	//2. No objects using new keyword
	//3. config file -- beans.xml to contain dependencies
	//4. Create an ApplicationContext and get service object it.

	public static void main(String[] args) {
//		UserService service = new UserService();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = context.getBean(UserService.class);
		
		service.register();

	}

}
