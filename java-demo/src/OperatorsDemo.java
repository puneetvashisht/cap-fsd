
public class OperatorsDemo {

	public static void main(String[] args) {

		int age = 34;
		
		if(age != 20 && age > 18) {
			System.out.println("life starts sucking..");
		}
		
		int a=10;
		int b= 20;
		
		int value1 = (a<b) ? a : b;
		int value2 = (a>b) ? a : b;

		
		System.out.println(value1);
		System.out.println(value2);
		

	}

}
