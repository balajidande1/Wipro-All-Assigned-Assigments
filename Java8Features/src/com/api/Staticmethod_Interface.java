package com.api;
@FunctionalInterface
interface add2Number{
	int add(int a, int b);
}

/*interface add2Number{
	static int add(int a, int b) {
		return a+b;
	}
}*/

public class Staticmethod_Interface {
	public static void main(String[] args) {
		//int result = add2Number.add(2, 7);
		//System.out.println(result);
		
		add2Number a1 = (a, b) -> a+b;
		int result = a1.add(2, 7);
		System.out.println(result);
	}

}
