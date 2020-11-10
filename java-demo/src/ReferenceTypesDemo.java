
class Employee{
	int id;
	String name;
	double salary;
}

public class ReferenceTypesDemo {
	
	Employee emp;

	public static void main(String[] args) {
		
		// Reference Type 2 bytes
		String str = new String("test");
		
		// String literal
		String str1 = "hazzy day here!!";
		
		Employee emp = new Employee();
		
		// null literal
		emp = null;
		
		// primitive literal
		int x = 34;
		
		
		
		System.out.println(emp);

		System.out.println(str);
	}

}
