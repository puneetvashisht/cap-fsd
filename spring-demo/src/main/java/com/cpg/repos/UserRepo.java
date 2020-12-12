package com.cpg.repos;

import org.springframework.stereotype.Component;

@Component
public class UserRepo {
	
	public void save() {
		System.out.println("In repo.. saving user");
	}

}
