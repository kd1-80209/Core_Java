package com;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	
	int empId;
	String fName;
	String lastName;
	double salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String fName, String lastName, double salary) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, fName, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empId");
		this.empId=sc.nextInt();
		System.out.println("Enter the First Name");
		this.fName=sc.next();
		System.out.println("Enter the Last Name");
		this.lastName=sc.next();
		System.out.println("Enter the Salary");
		this.salary=sc.nextDouble();
		
	}

	
}
