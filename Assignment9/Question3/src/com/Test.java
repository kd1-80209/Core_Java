package com;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Student arr[]=new Student[5];
		
		arr[0]=new Student(112,"Dhanraj","Amaravti",90.06);
		arr[1]=new Student(110,"yashraj","kolhapur",85);
		arr[2]=new Student(114,"vinod","sangli",84);
		arr[3]=new Student(110,"tanay","kolhapur",85);
		arr[4]=new Student(112,"shekhar","nagar",86);

		StudentCompare c1=new StudentCompare();
		
		Arrays.sort(arr,c1);
		
		for(Student s:arr)
			System.out.println(s);
	}

}
