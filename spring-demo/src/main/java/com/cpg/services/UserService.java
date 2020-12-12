package com.cpg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cpg.repos.RoleRepo;
import com.cpg.repos.UserRepo;

@Component
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



	public void register() {

		System.out.println("Register method in service");
		repo.save();
		roleRepo.save();

	}

}
