package com.cap.springwebdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>{
	
//	"select u from User u where u.email:email"
	
	public User findByEmail(String email);
	
//	@Query
//	b

}
