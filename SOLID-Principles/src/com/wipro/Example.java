package com.wipro;

import java.util.Scanner;

public class Example {
	
	public static int myMethod(int x, int y, int z) {
		
		return x+y+z;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(myMethod(a,b,c));
		

	}

}
