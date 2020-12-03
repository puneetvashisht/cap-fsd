package com.cpg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cpg.compose.Address;
import com.cpg.compose.Employee;


public class TestComposition {
	
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
	public void testAddEmployees() {
		Address add = new Address(32, "Jangpura", "Delhi");
		Address add1 = new Address(2, "Malsi", "Dehradun");
		Address add2 = new Address(21, "Magarpattam", "Pune");
		List<Address> addresses = new ArrayList<>();
		addresses.add(add);addresses.add(add1);addresses.add(add2);
		
		Employee e = new Employee("Priya", "Negi", 20000.00, addresses);
		
//		e.setAddress(add);
		
		
		//em.persist
		em.getTransaction().begin();
		
		em.persist(e);
	
		em.getTransaction().commit();
		
			
	}
	
	@Test
	public void testFindEmployees() {
		
		Employee emp = em.find(Employee.class, 27);
		System.out.println(emp);
		System.out.println(emp.getAddresses());
		
			
	}
	

	@After
	public void destroy() {
		em.close();
	}

}
