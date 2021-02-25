package com.capgemini.day7;

class Message<T>{
	T text;
	
	public Message(T text) {
		super();
		this.text = text;
	}

	public T getText() {
		return text;
	}

	public void setText(T text) {
		this.text = text;
	}
	
	
}


public class TTypeDemo {

	public static void main(String[] args) {
		Message<String> message = new Message<>("hello");
		
		Message<Integer> newmessage = new Message<>(234);
		System.out.println(message.getText());

	}

}
