package com.array.java;

import java.util.Arrays;

public class FindOutMinAndMaxValuesAnArray {

	public static void main(String[] args)
	{
		int[] arr = {10,15,13,11,17,16,18,14,12};
		
		int min = arr[0];
		int max = arr[0];
	
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];   // max value assigned index 0th value 
				                //write for loop check array length 
                                // check if condition i values i values big or not compare max values 
			}                   // 
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);


	}

}
