package com.collectios;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Hyd");
		cities.add("Bng");
		cities.add("Chennai");
		
		for(String s : cities) {
			System.out.println(s);
		}
		cities.get(2);
		
		cities.set(1, "Nellore");
		cities.remove("Chennai");
		cities.addFirst("Vinjmr");
	}

}
