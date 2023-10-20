package com.assign;

import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		Stream <Integer> strm = Stream.iterate(1, x -> x+1)
				.limit(5);
		
		Integer fact = strm.reduce(1, (x,y)-> x*y);
		
		System.out.println("Factorial = " + fact);

	}

}
