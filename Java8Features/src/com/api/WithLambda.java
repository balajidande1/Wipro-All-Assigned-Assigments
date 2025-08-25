package com.api;

import java.util.ArrayList;

interface Good{
	void greet();
}

public class WithLambda {

	public static void main(String[] args) {
		Good g = ()->System.out.println("Good Morning");
		g.greet();
	
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("mango");
	arrayList.add("rk");
	arrayList.add("rk1");
	arrayList.add("rk2");
	
	for(String n : arrayList) {
		System.out.println(n);
	}
	// With Lambda Expression
	arrayList.forEach(n->System.out.println(n));
	}
}
