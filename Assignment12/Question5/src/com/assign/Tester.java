package com.assign;

import java.util.Scanner;

public class Tester {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T ele : arr)

			if (c.compare(ele, key))
				count++;

		return count;
	}

	public static void main(String[] args) {

		Double[] arr = { 12.25, 54.33, 85.25, 98.12, 12.25, 85.25, 45.31, 38.12, 85.25 };

		for (Double d : arr)
			System.out.print(d + ",");
		System.out.println();

		System.out.print("Enter Number to Find the Duplicate = ");
		double key = new Scanner(System.in).nextDouble();

		int cnt = countIf(arr, key, (x, y) -> x.equals(y));
		System.out.println("Count = " + cnt);

	}

}
