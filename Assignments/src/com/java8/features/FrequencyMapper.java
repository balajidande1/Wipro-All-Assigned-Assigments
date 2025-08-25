package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMapper {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple", "Ball", "Bat", "Apple", "Ball");
		
		Map<String, Long> result = names.stream()
			.collect(Collectors.groupingBy(name->name, Collectors.counting()));
		result.forEach((name, count)->System.out.println(name+ " "+ count));
			//.map(n->n);

	}

}
