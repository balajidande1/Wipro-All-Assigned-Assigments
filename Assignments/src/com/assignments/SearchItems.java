package com.assignments;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SearchItems {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter serach items: ");
		
		ArrayDeque<String> dqueue = new ArrayDeque<>();
		
		//String items = sc.nextLine();
		
		for(int i=0;i<5;i++) {
			String items = sc.nextLine();
			if(dqueue.size() == 3) {
				dqueue.pollFirst();
			}
			dqueue.addLast(items);
		}
		//dqueue.addLast(items);
		
		System.out.println("Last 3 searched items: ");
		
		for(String search : dqueue) {
			System.out.println(search);
		}
		

	}

}
