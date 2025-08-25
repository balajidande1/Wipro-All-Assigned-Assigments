package com.api;

@FunctionalInterface
interface Greeting1{
	void greet();
	//void may();
}

public class Functional_Interface {
	public static void main(String[] args) {
		Greeting1 g = ()->System.out.println("Good Mrg");
		g.greet();
	}

}
