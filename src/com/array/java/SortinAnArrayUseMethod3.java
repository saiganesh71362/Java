package com.array.java;

import java.util.Arrays;

public class SortinAnArrayUseMethod3 
{

	public static void main(String[] args)
	{
		int[] arr = {9,8,6,7,4,5,3,1,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
        
	     System.out.println("min number:"+arr[0]);
	     System.out.println("max number :"+arr[8]);
	      
	}
}
