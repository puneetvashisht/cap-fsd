


//intance from static -  X not allowed

public class VariablesDemo {
	// static variable
	static int z = 34;
	
	// Instance Variable
	 int y = 4;
	
	public void m1() {
		int x = 34;
		VariablesDemo vd = new VariablesDemo();
		System.out.println(vd.y);
		System.out.println(z);
		Math.ceil(2.3);
	}
	

	public static void main(String[] args) {
		//Local variable
		
		VariablesDemo vd = new VariablesDemo();
		
		
		int x = 0;
		vd.m1();
		System.out.println(x);
		System.out.println(vd.y);
		System.out.println(VariablesDemo.z);
	}

}
