package com.assign;

import java.util.Scanner;

abstract public class Employee {
	private String first_name;
	private String last_name;
	private long ssn;

	public Employee() {
		this.first_name = " ";
		this.last_name = " ";
		this.ssn = 0;
	}

	public Employee(String first_name, String last_name, long ssn) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.ssn = ssn;
	}

	abstract public double calcTotalSalary();

	public void acceptData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name = ");
		this.first_name = scan.next();
		System.out.print("Enter Last Name = ");
		this.last_name = scan.next();
		System.out.print("Enter Social Security Number (SSN) = ");
		this.ssn = scan.nextLong();
	}

	public void displayData() {
		System.out.println("First Name = " + this.first_name);
		System.out.println("Last Name = " + this.last_name);
		System.out.println("SSN = " + this.ssn);
	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", ssn=" + ssn + "]";
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

}
