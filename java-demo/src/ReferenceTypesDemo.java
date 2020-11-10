
class Employee{
	int id;
	String name;
	double salary;
}

public class ReferenceTypesDemo {

	public static void main(String[] args) {
		
		// Reference Type 2 bytes
		String str = new String("test");
		
		Employee emp = new Employee();
		emp = null;
		
		System.out.println(emp);

		System.out.println(str);
	}

}
