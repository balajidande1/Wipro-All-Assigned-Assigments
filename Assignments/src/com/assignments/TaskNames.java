package com.assignments;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class TaskNames {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Store 4 tasks");
		
		LinkedList<String> list = new LinkedList<>();
		
		for(int i=0;i<4;i++) {
			String tasks = sc.nextLine();
			
			if(tasks.endsWith("!")) {
				list.addFirst(tasks);
			}
			else {
				list.addLast(tasks);
			}
		}
		System.out.println("Tasks in reverse order: ");
		
		ListIterator<String> iterator = list.listIterator(list.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}

}
