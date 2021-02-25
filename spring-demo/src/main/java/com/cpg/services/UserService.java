package com.cpg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.entities.User;
import com.cpg.repos.RoleRepo;
import com.cpg.repos.UserRepo;

@Service
public class UserService {

//	UserRepo repo = new UserRepo();

	@Autowired
	UserRepo repo;
	
	RoleRepo roleRepo;
	
	

	public RoleRepo getRoleRepo() {
		return roleRepo;
	}

	@Autowired
	public void setRoleRepo(RoleRepo roleRepo) {
		this.roleRepo = roleRepo;
	}

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
		roleRepo.save();

	}

}
