package com.assign;

import java.util.Scanner;

public class Salesman extends Employee {
	private int gross_sales;
	private double comm_rate;

	public Salesman() {
		super();
		this.gross_sales = 0;
		this.comm_rate = 0;
	}

	public Salesman(String first_name, String last_name, long ssn, int gross_sales, double comm_rate) {
		super(first_name, last_name, ssn);
		this.gross_sales = gross_sales;
		this.comm_rate = comm_rate;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Gross Sales = ");
		this.gross_sales = new Scanner(System.in).nextInt();
		System.out.print("Enter Commission Rate = ");
		this.comm_rate = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Gross Sales = " + this.gross_sales);
		System.out.println("Commission Rate = " + this.comm_rate);
	}

	@Override
	public String toString() {
		return "Salesman [gross_sales=" + gross_sales + ", comm_rate=" + comm_rate + " => " + super.toString() + "]";
	}

	public int getGross_sales() {
		return gross_sales;
	}

	public void setGross_sales(int gross_sales) {
		this.gross_sales = gross_sales;
	}

	public double getComm_rate() {
		return comm_rate;
	}

	public void setComm_rate(double comm_rate) {
		this.comm_rate = comm_rate;
	}

	@Override
	public double calcTotalSalary() {
		double totalsalary = (this.gross_sales*this.comm_rate);
		System.out.println("Total Salary = "+ totalsalary);
		return totalsalary;
		
	}

}
