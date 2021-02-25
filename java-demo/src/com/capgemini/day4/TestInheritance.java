package com.capgemini.day4;

public class TestInheritance {

	public static void main(String[] args) {
		
		Employee e = new Employee(13, "Priya", 24433.34);
		Manager m = new Manager(23, "Ravi", 34433.34, 10);
//		Upcasting
//		Employee o = m;
		
//		Employee employees[] = {e, m};
		Employee employees[] = new Employee[2];
		employees[0]= m;
		employees[1]= e;
		
		for(Employee emp : employees) {
			System.out.println(emp);
			
//			emp.incrementSalary(5000);
			emp.incrementSalary();
			if(emp  instanceof Manager) {
				Manager manager = (Manager) emp;
				manager.approveLeaves();
			}
			
			
			System.out.println(emp);
		}
		
		
		
		
//		System.out.println(e.getId());

	}

}
