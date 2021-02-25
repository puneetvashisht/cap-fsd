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
		
		// after execution -- all objects ready
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("/Users/puneet/work/trainings/cagemini-fsd/spring-demo/src/main/resources/beans.xml");
		String beanNames[] = context.getBeanDefinitionNames();
		
		for(String beanName: beanNames) {
			System.out.println(beanName);
		}
		
//		UserRepo userRepo = context.getBean(UserRepo.class);
		
		UserService service = context.getBean(UserService.class);
		UserService service1 = context.getBean(UserService.class);
		UserService service2 = context.getBean(UserService.class);
		
		if(service1 == service2) {
			System.out.println("Single object");
		}
		
//		service.register();

	}

}
