package com.assign;

public class Clerk implements Emp{
	private double sal;
	
	

	public Clerk(double sal) {

		this.sal = sal;
	}



	@Override
	public double getSal() {
		
		return sal;
	}

}
