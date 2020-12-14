package com.cpg.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cpg.entities.User;

@Component
public class UserRepo {
	
	@PersistenceContext
	EntityManager em;
	
	public UserRepo() {
		
	}
	@Transactional
	public void save(User user) {
//		em.getTransaction().begin();
		em.persist(user);
//		em.getTransaction().commit();
		System.out.println("In repo.. saving user");
	}

}
