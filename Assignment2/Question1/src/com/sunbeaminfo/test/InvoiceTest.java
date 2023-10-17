package com.sunbeaminfo.test;

import com.sunbeaminfo.invoice.*;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice a=new Invoice();
		a.acceptData();
		a.displayData();
		a.calculateBill();

	}

}
