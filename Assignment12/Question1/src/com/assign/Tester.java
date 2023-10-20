package com.assign;

public class Tester {

	public static void main(String[] args) {

		Emp[] arr = new Emp[6];

		arr[0] = new Manager(5000, 100);
		arr[1] = new Labour(350, 15);
		arr[2] = new Clerk(8000);
		arr[3] = new Manager(8900, 510);
		arr[4] = new Labour(500, 50);
		arr[5] = new Clerk(9500);

		double total = Emp.clacTotalIncome(arr);
		System.out.println("Total Income Of Employees = " + total);

	}

}
