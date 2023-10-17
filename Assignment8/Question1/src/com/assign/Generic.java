package com.assign;

class Box<T extends Employee> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public double getTotalSalary() {
		return data.calcTotalSalary();
	}

}

public class Generic {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.acceptData();
		m1.displayData();
//		
//		Box <Manager>b1 = new Box<>();
//		b1.setData(m1);
//		System.out.println("Manager Total Salary = "+ b1.getTotalSalary());
		
//		Salesman s1 = new Salesman();
//		s1.acceptData();
//		s1.displayData();
		
//		Box<Salesman> b2 = new Box<>();
//		b2.setData(s1);
//		System.out.println("Salesman Total Salary = "+ b2.getTotalSalary());
		
		Box<Employee> b3 = new Box();
		b3.setData(m1);
		b3.getTotalSalary();

	}

}
