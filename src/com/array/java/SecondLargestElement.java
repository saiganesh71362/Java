package com.array.java;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) 
	{
		int[] arr = {9,8,7,5,6,4,3,2,};  // CREATE ARRAY DIRECT INITILIZATION ARRAY ELEMENTS
		System.out.println("Elements Before Sorting :"+Arrays.toString(arr)); // toString METHOD RETURNS STRING TYPE VALUES FORMAT
		Arrays.sort(arr); // sort  this METHOD USING SEQUENCE ORDER OF ELEMENTS
		System.out.println("Elements After Sorting :"+Arrays.toString(arr));
		System.out.print("Second LargFet Element :"+arr[arr.length-2]+ "First Largest number : "+arr[arr.length-1]);

	}

}
