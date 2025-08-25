package com.java8.features;

import java.util.Arrays;
import java.util.List;

public class SimpleNameSorter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("rahul", "madhan", "abhi", "jaya", "krishna");
		
		list.sort((n1,n2)->n1.compareTo(n2));
		System.out.println("Sorted Names: ");
		list.forEach(name->System.out.println(name));
	}

}
