package com.cpg.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//	UserRepo repo = new UserRepo();

	@Autowired
	UserRepo repo;
	


//	@Autowired
//	public UserService(UserRepo repo) {
//		super();
//		this.repo = repo;
//	}

	public UserRepo getRepo() {
		return repo;
	}



	public void setRepo(UserRepo repo) {
		this.repo = repo;
	}



	public void register(User user) {

		System.out.println("Register method in service");
		repo.save(user);
		
//		repo.dele
	

	}

}
