package com.assign;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {

		IntStream istrm = IntStream.range(1, 10);
		int total = istrm.sum();

		System.out.println("Sum = " + total);

		IntStream istrm1 = IntStream.range(1, 10);
		IntSummaryStatistics iss = istrm1.summaryStatistics();
		System.out.println("Summary Statistics = " + iss);

	}

}
