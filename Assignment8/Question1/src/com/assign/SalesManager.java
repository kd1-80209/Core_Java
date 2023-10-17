package com.assign;
import java.util.Scanner;

public class SalesManager extends Salesman {
	private double base_salary;

	public SalesManager() {
		super();
		this.base_salary = 0;
	}

	public SalesManager(String first_name, String last_name, long ssn, int gross_sales, double comm_rate,
			double base_salary) {
		super(first_name, last_name, ssn, gross_sales, comm_rate);
		this.base_salary = base_salary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Base Salary = ");
		this.base_salary = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Base Salary = " + this.base_salary);
	}

	@Override
	public String toString() {
		return "SalesManager [base_salary=" + base_salary + " => " + super.toString() + "]";
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	public double calcTotalSalary() {
		double totalsalary = (this.getComm_rate()*this.getGross_sales())+this.base_salary;
		System.out.println("Total Salary = "+ totalsalary);
		return totalsalary;
	}
}

