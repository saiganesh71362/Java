package com.array.java;

import java.util.Arrays;

public class SmallestNumberArray {

	public static void main(String[] args)
	{
	  int[] arr = {8,7,9,5,6,4,1,3,2};
	  
	  Arrays.sort(arr); //1,2,3,4,5,,6,7,8,9
	  System.out.println("Ater Sorting Array :"+Arrays.toString(arr));
	  System.out.println("Smalest Number An Array :"+arr[0]);
	  
	   int smalestNumber = arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]<smalestNumber)
		   {
			   smalestNumber = arr[i];
		   }
	   }
	   System.out.println("Smlest Number An After Condition Check :"+smalestNumber);

	}

}
