package com.cpg;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUser {
	
	private EntityManager em;

	@Before
	public void setUp() {
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("test");
	
//		Create EntityManager
		em = emf.createEntityManager();
	}

//	@Test
	public void testAddUser() {
		User user = new User("transaction", "ravi@test.com", "testtest", 4.5, false);	
		//em.persist
		em.getTransaction().begin();
		
		
		em.persist(user);
		if(user.active == false) {
			em.getTransaction().rollback();
		}
		
		em.getTransaction().commit();
		
		user.setEmail("t@t.com");
			
	}
	
//	@Test 
	public void findUserById() {		
		User foundUser = em.find(User.class, 6);
		System.out.println(foundUser);
	}
	
//	@Test 
	public void removeUserById() {
		em.getTransaction().begin();
		User foundUser = em.find(User.class, 4);
		em.remove(foundUser);
		em.getTransaction().commit();
//		System.out.println(foundUser);
	}
	
//	@Test
	public void testUpdateUser() {
		em.getTransaction().begin();
		User foundUser = em.find(User.class, 6);
		foundUser.setName("arun");
		em.getTransaction().commit();
		
	}
	
	//JPQL - Java Persistence Query Language
	
//	@Test
	public void testFindUserByName() {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u where u.name=:nameparam", User.class);
		query.setParameter("nameparam", "ravi");
//		User user = query.getSingleResult();
		
		List<User> users = query.getResultList();
		System.out.println(users);
		
	}
//	select count(*) from User;
	
	@Test
	public void testCountUsers() {
		TypedQuery<Long> query = em.createNamedQuery("selectCount", Long.class);
//		TypedQuery<Long> query = em.createQuery("SELECT count(u) FROM User u", Long.class);
		Long count = query.getSingleResult();
		System.out.println(count);
		
	}
	
	
//	@Test
	public void testFindActiveUsers() {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u where u.active=:flag", User.class);
		query.setParameter("flag", true);
//		User user = query.getSingleResult();
		
		List<User> users = query.getResultList();
		System.out.println(users);
		
	}
	
	
	@After
	public void destroy() {
		em.close();
	}

}
