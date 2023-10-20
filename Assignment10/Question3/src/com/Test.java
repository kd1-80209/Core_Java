package com;

import java.util.*;

public class Test {

	public static int menu() {

		int choise;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Add new Employee");
		System.out.println("2. Delete The Employee.");
		System.out.println("3. Find Employee by ID");
		System.out.println("4. Sort by empId.");
		System.out.println("5. Edit the employee");
		choise = sc.nextInt();
		return choise;
	}

	public static void main(String[] args) {

		List<Employee> emplist = new LinkedList<Employee>();
		EmployeeComparator ec=new EmployeeComparator();

		Scanner sc = new Scanner(System.in);
		
		int choise = 1;
		while (0 != (choise = menu())) {
			switch (choise) {
			case 1://1. Add new Employee
			{
			   Employee e=new Employee();
			   e.accept();
			   emplist.add(e);
			   System.out.println("Employee Added successfully");
			}
				break;
			case 2://2. Delete The Employee
			{
				System.out.println("Enter the index on which");
				int index=sc.nextInt();
				emplist.remove(index);
				System.out.println("Employee removed successfully");
				
			}
				break;
			case 3://3. Find Employee by ID
			{
				System.out.println("Enter the EmpId to find employee");
				int empId=sc.nextInt();
				Employee e=new Employee();
				e.setEmpId(empId);
				if(emplist.contains(e))
				{
					int index=emplist.indexOf(e);
					Employee e2=emplist.get(index);
					System.out.println(e2);
				}
				
				
				System.out.println("Employee removed successfully");
				
			}
				break;
			case 4://4. Sort by empId.
			{
				Collections.sort(emplist,ec);
				
				System.out.println("Employee list after sort");
				Iterator<Employee> itr = emplist.iterator();
				while(itr.hasNext())
				{
					Employee e=itr.next();
					System.out.println(e);
				}
			}
				break;
			case 5://5. Edit the employee
			{
				System.out.println("Enter employee ID whose");
				int empId=sc.nextInt();
				Employee e=new Employee();
				e.setEmpId(empId);
				
				if(emplist.contains(e))
				{
				   int index=emplist.indexOf(e);
				   Employee e1=emplist.get(index);
				   System.out.println("Enter updated first name");
				   String fName=sc.next();
				   System.out.println("Enter updated Last name");
				   String lName=sc.next();
				   System.out.println("Enter updated Salary");
				   double salary=sc.nextDouble();
				   e1.setfName(fName);
				   e1.setLastName(lName);
				   e1.setSalary(salary);
				}
				else {
					System.out.println("This EmpId is Not Found");
				}
			}
				break;

			default:
				break;
			}
		}

		
	}

}
