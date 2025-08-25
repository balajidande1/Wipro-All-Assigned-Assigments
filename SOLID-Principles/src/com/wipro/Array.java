package com.wipro;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter some values");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Values are: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
