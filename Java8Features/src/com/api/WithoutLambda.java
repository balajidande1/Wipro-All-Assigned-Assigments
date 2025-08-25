package com.api;

interface Greeting{
	void greet();
}
class SayHello implements Greeting{
	public void greet() {
		System.out.println("Ohayo gozaimas");
	}
}

public class WithoutLambda {
	public static void main(String[] args) {
		SayHello s1 = new SayHello();
		
		s1.greet();
	}

}
