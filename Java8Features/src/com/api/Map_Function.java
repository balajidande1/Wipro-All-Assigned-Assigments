package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Map_Function {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,4,7,1,0,6);
		
		//Stream<Integer> mappedValues = nums.stream().map(n->n*5);
		//mappedValues.forEach(n->System.out.println(n));
		
		//3 stream
		// creating stream
		/*nums.stream()
				.filter(n->n%2==1)
				.sorted()
				.map(n->n*4)
				.forEach(n->System.out.println(n));*/
		int result = nums.stream()
						.filter(n->n%2==1)
						.sorted()
						.map(n->n*4)
						.reduce(0, (x,y)->x+y);
		System.out.println(result);
		Optional<String> name = Optional.of("Balaji");
		name.ifPresent(n->System.out.println("Hello"+n));
		// parallel streams
		// Java will create threads for us
	}

}
