package com;

public class Generic
{
	public static <T extends Number> T findMin(T[] arr) 
  {
	T min=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i].doubleValue()<min.doubleValue())
		{
		   min=arr[i];	
		}
	}
		
	return  min;
		
	
  }
}
