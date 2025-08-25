package com.java8.features;

interface Greet{
	void greet();
	
	default void greet2() {
		System.out.println("Good Night");
	}
}

public class DefaultInterface {

	public static void main(String[] args) {
		
		Greet g1 = ()->System.out.println("Good Morning");
		g1.greet();
		g1.greet2();

	}

}
