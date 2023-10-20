package com.assign;

public class Manager implements Emp {
	private double basic_sal;
	private double dearance_allow;

	
	public Manager(double basic_sal, double dearance_allow) {
		this.basic_sal = basic_sal;
		this.dearance_allow = dearance_allow;
	}

	@Override
	public double getSal() {
		double Salary = basic_sal + dearance_allow;

		return Salary;
	}

	@Override
	public double calcIncentives() {
		double incentives = basic_sal * 0.2;

		return incentives;
	}

}
