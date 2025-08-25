package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelSquarePrinter {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(2,4,5,7,8);
		
		num.parallelStream()
			.forEach(n->System.out.println("Square of "+ n + " = "+(n*n)));
		
		// parrallelStream() runs in multiple threads, the order of output 
		// is not guaranteed
	}

}
