package com;
import java.util.*;

public class Test {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	     	}
		}
		}

	public static void main(String[] args) {
			
		Double arr[]=new Double [5];
		
		arr[0]=17.0;
		arr[1]=98.0;
		arr[2]=15.0;
		arr[3]=21.0;
		arr[4]=12.0;
		
		
		class DoubleComparator implements Comparator<Double>
		{
			@Override
			public int compare(Double d1, Double d2) {
				int diff= d1.compareTo(d2);
				return diff;
			} 
		}
		  DoubleComparator d1= new DoubleComparator();
		  selectionSort(arr,d1);
		  for(Double e:arr)
			   System.out.println(e);
		
		}
	
}
