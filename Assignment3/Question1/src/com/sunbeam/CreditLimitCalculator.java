package com.sunbeam;

import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		int accNumb;
		int beginingBal;
		int charges;
		int credits;
		int creditLimit;
		int newBal;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number = ");
		accNumb=sc.nextInt();
		System.out.println("Enter Begining Balance = ");
		beginingBal=sc.nextInt();
		System.out.println("Enter Charges = ");
		charges=sc.nextInt();
		System.out.println("Enter Credits = ");
		credits=sc.nextInt();
		System.out.println("Enter Credit Limit = ");
		creditLimit=sc.nextInt();		
		
		newBal = beginingBal + charges - credits;
		System.out.println("New Balance = "+ newBal);
		
		if (newBal > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
	}

}
