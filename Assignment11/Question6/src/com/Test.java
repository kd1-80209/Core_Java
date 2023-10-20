package com;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test {

	
	public static int menu()
	{
		Scanner sc=new Scanner(System.in);
		int choise=0;
		System.out.println("0.EXIT");
		System.out.println("1.Add New Student");
		System.out.println("2.Get Student Details by Roll No");
		choise=sc.nextInt();
		return choise;
	}

	/*6. Store Students in LinkedHashMap<> so that, for given roll, 
	 *   Student can be searched in fastest possible time. Do we need to write equals() and
     *   hashCode() in Student class? Follow menu-driven approach. Hint:
	 * */
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<Integer,Student>stuList=new LinkedHashMap<>();
		
		int choise;
		while(((choise=menu())!=0))
		{
			switch (choise) 
		  {
			case 1://add new student in list
			{
				Student student=new Student();
				student.accept();
				stuList.put(student.getRollNo(), student);
				System.out.println();
			}
				break;
			case 2:// get student search by roll no
			{
				System.out.println("Enter the Roll no of student");
				int rollNo=sc.nextInt();
				Student s=stuList.get(rollNo);
				if(s!=null)
				{
				  System.out.println(s);
				}
				else {
					System.out.println("Student Not found :Pls Enter Valid Roll No ");
				}
			}
				break;

			default:
				break;
		  }
		}

	}

}
