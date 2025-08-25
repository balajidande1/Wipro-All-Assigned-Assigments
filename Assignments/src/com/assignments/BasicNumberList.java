package com.assignments;

import java.util.Scanner;

public class BasicNumberList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]<10) {
				arr[i] = arr[i]*2;
			}
			sum = sum + arr[i];
		}
		
		double average = sum/5.0;
		System.out.println("Updated numbers");
		for(int num : arr) {
			System.out.println(num + " ");
		}
		
		System.out.println("Average: " + average);
	}
	

}
