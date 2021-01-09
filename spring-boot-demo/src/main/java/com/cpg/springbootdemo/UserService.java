package com.cpg.springbootdemo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
	
	public List<User> findAllUsers(){
		return repo.findAll();
	}



	public void register(User user) {

		System.out.println("Register method in service");
		repo.save(user);
		
//		repo.dele
	

	}


//	@Transactional
	public User fetchEmployeeById(int id) {
		Optional<User> user = repo.findById(id);
//		user.setRole(user.getRole());
		return user.get(); 
	}

}
