package com.assign;

public interface Emp {

	public abstract double getSal();

	public default double calcIncentives() {
		return 0.0;
	}

	static double clacTotalIncome(Emp arr[]) {
		double total = 0.0;

		for (Emp e : arr) {
			double totalincome = e.getSal() + e.calcIncentives();
			total = total + totalincome;
		}
		return total;

	}
}
