package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameFinder {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram","Krishna", "Arjun", "Anil");
		
		List<String> result = list.stream()
									.filter(name->name.startsWith("A"))
									.collect(Collectors.toList());
		System.out.println(result);
	}

}
