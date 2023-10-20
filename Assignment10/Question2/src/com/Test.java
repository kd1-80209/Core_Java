package com;
import java.util.*;
public class Test {
	
	/*2. Create a list of strings. 
	 * Find the string with highest length using Collections.max().
	 * */
	public static void main(String[] args) {
		
	NameLengthCompare n=new NameLengthCompare();
	List<String>strList=new ArrayList<String>();
	strList.add("Dhanraj");
	strList.add("Pranay");
	strList.add("Krishna");
	strList.add("Tanay");
	strList.add("Vinod");
	strList.add("Pratik");	
	
	String temp=Collections.max(strList);
	System.out.println(temp);
	
    temp=Collections.max(strList,n);
	System.out.println(temp);
	
	}
}
