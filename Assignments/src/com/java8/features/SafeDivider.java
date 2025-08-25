package com.java8.features;

import java.util.Optional;
import java.util.Scanner;



public class SafeDivider {
	
	public static Optional<Integer> divide(int a, int b){
		if(b == 0) {
			return Optional.empty();
		}
		else {
			return Optional.of(a/b);
		}
	}

	public static void main(String[] args) {
		
		//int num1 = 10;
		//int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		Optional<Integer> result = divide(num1,num2);
		
		if(result.isPresent()) {
			System.out.println("Result: "+ result.get());
		}
		else {
			System.out.println("Not allowed");
		}
		

	}

}
