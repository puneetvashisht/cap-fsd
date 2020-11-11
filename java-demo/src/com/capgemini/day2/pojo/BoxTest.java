package com.capgemini.day2.pojo;

public class BoxTest {

 

    
    static void fun(Nameage ob1)
    {
        Nameage t1= new Nameage("XYZ", 21);
     // t1 eligible for garbage collection
    }
    
    public static void main(String[] args) {
        Nameage ob1=new Nameage("Kritika", 23);
        System.out.println(ob1);
        ob1 = null;
        
        
        Nameage ob2 = ob1;
      
        
        
        
        fun(ob2);
      //ob1 eligible for garbage collection
 

    }

 

}
 

//
//public class BoxTest {
//
//	public static void main(String[] args) {
//		Box box = new Box(10.0, 15.0, 20.0, "orange");
//		System.out.println(box );
//		box.doubleHeight();
//		System.out.println(box);
//		box.getHeight();
//		
////		System.out.println(Box.count);
//	}
//
//}
