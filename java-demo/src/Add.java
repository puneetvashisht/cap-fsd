
public class Add {

	public static void main(String[] args) {
		System.out.println("Add two numbers");
		
		double oper1 = Double.valueOf(args[0]); 
		int oper2 = Integer.valueOf(args[1]);
		
		System.out.println(oper1 + oper2);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		// 1 byte = 8 bits = 2^7 to (2^7 - 1) = -128 to 127
		
//		int for = 45;
//		byte age = (byte)129.34;
		
		byte age = 127;
		System.out.println(age >> 2);
		
//		1111111 = 127
//		0111111	= 63
//		0011111 = 31
		int total = 0;
//		total = (total + age) * 5 ;
		
		float f = (float)24.34;
		
		boolean flag = false;
		char startingLetter = 'P';
		
//		System.out.println(age);
		

	}

}
