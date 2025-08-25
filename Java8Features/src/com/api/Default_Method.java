package com.api;

interface Hello{
	void greet();
	default void hello() {
		System.out.println("Heloo");
	}
}

public class Default_Method {
	public static void main(String[] args) {
		
		Hello h1 = ()->System.out.println("Good mrg");
		h1.greet();
		h1.hello();
	}

}
