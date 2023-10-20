package com;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student>
{
	
	int rollNo;
	String name;
	float percentage;
	int age;
	
	

	
	public Student() 
	{
		
	}

	public Student(int rollNo, String name, float percentage, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public float getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public int compareTo(Student s) {
		
		int dff=this.rollNo-s.getRollNo();
		return dff;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Roll No");
		this.rollNo=sc.nextInt();
		System.out.println("Enter the Name");
		this.name=sc.next();
		System.out.println("Enter the Percentage");
		this.percentage=sc.nextInt();
		System.out.println("Enter the Age");
		this.age=sc.nextInt();
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", age=" + age + "]";
	}
	
	

}
