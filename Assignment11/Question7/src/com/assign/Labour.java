package com.assign;

public class Labour implements Emp {
	private int hours;
	private double rate;

	
	public Labour(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		double sal = hours * rate;

		return sal;
	}

	@Override
	public double calcIncentives() {
		double incent;
		if (hours > 300)
			incent = 0.05 * (hours * rate);
		else 
			incent = 0.0;
		return incent;
	}
	

			
	}

