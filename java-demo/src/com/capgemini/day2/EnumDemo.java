package com.capgemini.day2;

//class Week{
//	final static String MONDAY = "monday";
//
//}
//enum Week{ MON("monday"), TUES("tuesday"); 
//	String day;
//	
//	Week(String day){
//	this.day = day;
//	}
//}
enum Week {MONDAY, TUESDAY}

public class EnumDemo {
	
	

	public static void main(String[] args) {
		
		
		System.out.println(Week.MONDAY);

		System.out.println(Week.MONDAY.equals(Week.MONDAY));

	}

}
