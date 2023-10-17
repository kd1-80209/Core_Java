/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/
package com.sunbeaminfo.invoice;

import java.util.Scanner;

public class Invoice {
	String partno;
	String partdesc;
	int quantity;
	double price;
	
	public Invoice()
	{	
	}
	
	public Invoice(String partno, String partdesc, int quantity, double price) {
		this.partno = partno;
		this.partdesc = partdesc;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartdesc() {
		return partdesc;
	}

	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void acceptData() {
Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter part number = ");
		partno=sc.next();
		
		System.out.println("Enter part description = ");
		partdesc=sc.next();
		
		System.out.println("Enter quantity = ");
		if(sc.hasNextInt())
			quantity=sc.nextInt();
		if(quantity>0)
			this.quantity=quantity;
		else
			this.quantity=0;
		
		
		System.out.println("Enter price =  ");
		if(sc.hasNextDouble())	
			price=sc.nextDouble();
		if(price>0)
			this.price=price;
		else
			this.price=0.0;
	}
	public void displayData() {
		System.out.println("part number is = "+partno);
    	System.out.println("part description = "+partdesc);
    	System.out.println("quantity = "+quantity);
    	System.out.println("price = "+price);
	}
	public void calculateBill() {
		System.out.println("Your total bill is = "+price*quantity);
	}
	

}
