package com.assign;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double hourly_wage;
	private int hours_worked;

	public HourlyEmployee() {
		super();
		this.hourly_wage = 0;
		this.hours_worked = 0;
	}

	public HourlyEmployee(String first_name, String last_name, long ssn, double hourly_wage, int hours_worked) {
		super(first_name, last_name, ssn);
		this.hourly_wage = hourly_wage;
		this.hours_worked = hours_worked;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Hourly Wage = ");
		this.hourly_wage = new Scanner(System.in).nextDouble();
		System.out.print("Enter Hours Worked = ");
		this.hours_worked = new Scanner(System.in).nextInt();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Houly Wage is = " + this.hourly_wage);
		System.out.println("Hours Worked are = " + this.hours_worked);
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourly_wage=" + hourly_wage + ", hours_worked=" + hours_worked + " => "
				+ super.toString() + "]";
	}

	public double getHourly_wage() {
		return hourly_wage;
	}

	public void setHourly_wage(double hourly_wage) {
		this.hourly_wage = hourly_wage;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	@Override
	public double calcTotalSalary() {
		double totalsal;
		 if (hours_worked > 40) {
			totalsal = (40 * this.hourly_wage + (this.hours_worked - 40) * (this.hourly_wage * 1.5));
			System.out.println("Total Salary = " + totalsal);	
		}
		 else {
				totalsal = (this.hourly_wage * this.hours_worked);
				System.out.println("Total Salary = " + totalsal);
			} 
		
		return totalsal;

	}

}
