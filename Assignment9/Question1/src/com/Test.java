package com;

/*1. Write a generic static method to ﬁnd minimum from an array of "Number".
 * */
public class Test {

	public static void main(String[] args) 
	{
		Integer arr[]=new Integer[5];
		arr[0]=12;
		arr[1]=4;
		arr[2]=15;
		arr[3]=6;
		arr[4]=18;
		//arr[0]=1;
		
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = Generic.findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = Generic.findMin(arr2);
		Integer min =Generic.findMin(arr);
        System.out.println("The min elemrt is :"+min);
        System.out.println("The min elemrt is :"+min1);
        System.out.println("The min elemrt is :"+min2);
	}

}
