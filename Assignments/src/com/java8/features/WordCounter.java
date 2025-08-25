package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounter {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Banana", "Mango", "Grape", "Nut");
		
		long result = words.stream()
							.filter(name->name.length()>5)
							.count();
		System.out.println("Names longer than 5 characters: " + result);						

	}

}
