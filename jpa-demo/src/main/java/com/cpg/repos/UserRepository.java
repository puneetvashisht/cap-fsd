package com.cpg.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cpg.User;

public class UserRepository {
	
	
	private EntityManager em;
	
	{
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("test");
	
//		Create EntityManager
		em = emf.createEntityManager();
	}
	
	public void add(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
	
	public User findById(int id) {
		User foundUser = em.find(User.class, id);
		System.out.println(foundUser);
		return foundUser;
	}

}
