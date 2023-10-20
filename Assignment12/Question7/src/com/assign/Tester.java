package com.assign;

import java.util.Random;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {

		Random r = new Random();

		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100)).limit(10);

		Integer sum = strm.reduce(0, (a, e) -> a + e);

		System.out.println("Sum of 10 Random Intergers upto 100 = " + sum);

	}

}
