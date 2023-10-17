package com.assign;

import java.util.Scanner;

public class Manager extends Employee {

	private double weekly_salary;

	public Manager() {
		super();
		this.weekly_salary = 0;
	}

	public Manager(String first_name, String last_name, long ssn, double weekly_salary) {
		super(first_name, last_name, ssn);
		this.weekly_salary = weekly_salary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Weekly Salary = ");
		this.weekly_salary = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Weekly Salary is = " + this.weekly_salary);
	}

	@Override
	public String toString() {
		return "Manager [weekly_salary=" + weekly_salary + " => " + super.toString() + "]";
	}

	public double getWeekly_salary() {
		return weekly_salary;
	}

	public void setWeekly_salary(double weekly_salary) {
		this.weekly_salary = weekly_salary;
	}

	@Override
	public double calcTotalSalary() {
		//System.out.println("Total Salary = " + this.weekly_salary);
		return weekly_salary*4;

	}

}
