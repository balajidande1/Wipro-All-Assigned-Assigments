package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumberCollector {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> result = numbers.stream()
						.filter(n->n%2==0)
						.collect(Collectors.toList());
		System.out.println("Even Numbers: "+ result);
	}

}