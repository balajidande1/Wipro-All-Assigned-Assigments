package com.java8.features;

@FunctionalInterface
interface MyInterface{
	void printer(String message);
}


public class GreetingsPrinter {
	
	static void showMessage(String msg, MyInterface print) {
		print.printer(msg);
	}

	public static void main(String[] args) {
		
		showMessage("Message passed", message->System.out.println(message));
	

	}

}
