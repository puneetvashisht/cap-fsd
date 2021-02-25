package com.capgemini.day9;

interface PaymentType{
	void pay();
}
class LocalPaymentType implements PaymentType{
	@Override
	public void pay() {
		System.out.println("Local payment in INR");
		
	}
}


public class TestLamdas {
	
	public static void performPayment(PaymentType paymentType) {
		paymentType.pay();
	}

	public static void main(String[] args) {
		// PAyment type for INR
		PaymentType localPayment = new LocalPaymentType();
		performPayment(localPayment);
		
		// Payment type for USD
		PaymentType usdPayment = new PaymentType() {
			@Override
			public void pay() {
				System.out.println("International payment in USD");
			}	
		};
		performPayment(usdPayment);
		// lamdas
//		() -> {}
		// not create any special classes
		// funtional aspect
		PaymentType jpyPayment = ()-> {System.out.println("International payment in JPY");};
		performPayment(jpyPayment);
		
		
//		Runnable runnable = );
		Thread t = new Thread(()-> System.out.println("Running in a thread: " + Thread.currentThread().getName()));
		t.start();
		
		
	}

}
