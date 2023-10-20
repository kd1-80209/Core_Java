package com;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> 
{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		int dff=e1.getEmpId()-e2.getEmpId();
		return dff;
	}

}
