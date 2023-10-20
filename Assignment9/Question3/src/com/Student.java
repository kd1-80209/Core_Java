package com;

import java.util.Comparator;

/*
 * 3. Use Arrays.sort() to sort array of Students using Comparator.
 *  The 1st level sorting should be on city (desc), 
 *  2nd level sorting should be on marks (desc),
 *  3rd level sorting should be on name (asc).
 * */
public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMarks() {
		//Double d1= this.marks;
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	

}

class StudentCompare implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) 
	{
		
		int dff=-s1.getCity().compareToIgnoreCase(s2.getCity());
		if(dff==0)
			dff=-s1.getMarks().compareTo(s2.getMarks());
		if(dff==0)
			dff=s1.getName().compareToIgnoreCase(s2.getName());
		return dff;	
	}
	
	
}
	
	






















