package com.cpg;


 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class Test {
 
	public static void main(String[] args) {
 
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("test");
 
		
		
		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();
		
//		Employee employee = em.find(Employee.class, 6);
//		System.out.println(employee);
 
		
		/* Create and populate Entity */
		Employee emp = new Employee("Priya", "Negi", 44343.33);
		
		/* Persist entity */
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
 
		
 
	}
}