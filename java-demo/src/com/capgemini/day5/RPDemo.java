package com.capgemini.day5;

class Discount{
	int rate;

	public Discount(int rate) {
		super();
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Discount [rate=" + rate + "]";
	}
	
}
class SpecialDiscount extends Discount{
	int rate;
	double basePriceDeduction;

	public SpecialDiscount(int rate, double basePriceDeduction) {
		super(rate);
		this.basePriceDeduction = basePriceDeduction;
	}

	@Override
	public String toString() {
		return "SpecialDiscount [rate=" + rate + ", basePriceDeduction=" + basePriceDeduction + "]";
	}

	
	
}


public class RPDemo {

	public static void main(String[] args) {
		// 
		String customerType = "normal";
		
//		int i;
		Discount discount = null;
		
		System.out.println(discount);
		
		// decision 
		if(customerType.equals("prime")) {
			discount = new SpecialDiscount(5, 5000);
		}
		else {
			discount = new Discount(5);
		}
		
		 
		System.out.println(discount.toString());
		
		

	}

}
