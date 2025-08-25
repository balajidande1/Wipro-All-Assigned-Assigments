package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrettyJoiner {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple", "Bat", "Cat", "Dog");
		
		String result = names.stream()
							.collect(Collectors.joining(","));
		
		System.out.println(result);

	}

}
