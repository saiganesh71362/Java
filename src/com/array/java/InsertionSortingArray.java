package com.array.java;

import java.util.Arrays;

public class InsertionSortingArray 
{

	public static void main(String[] args)
	{
       int[] arr = {7,6,4,5,3,2,8,};
       System.out.println("Before Insrtino Sort :");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]);
       }
       
       Arrays.sort(arr);
       System.out.println();
       System.out.println("After Insertion Sort :");

       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]);
       }

	}


}
