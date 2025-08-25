package com.api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,6,1,0,7);
		//creating stream
		
		Stream<Integer> data = nums.stream();
		// sorting
		Stream<Integer> sortedStream = data.sorted();
		sortedStream.forEach(n->System.out.print(n));
		
	}

}
