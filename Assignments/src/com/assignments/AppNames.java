package com.assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class AppNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Apps names");
		LinkedList<String> list = new LinkedList<>();
		
		for(int i=0;i<5;i++) {
			String apps = sc.nextLine();
			if(list.contains(apps)) {
				list.remove(apps);
			}
			list.addFirst(apps);
		}
		System.out.println("The output is :");
		for(String apps : list) {
			System.out.println(apps);
		}
		
		

	}

}
