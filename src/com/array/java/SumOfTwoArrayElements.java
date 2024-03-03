package com.array.java;


import java.util.Arrays;

public class SumOfTwoArrayElements 
{

	public static void main(String[] args) 
	{
		//  I TOOK TWO ELEMENT ARRAYS BOTH SAME LENGTH , TWO ARRAYS ADDITION
		int[] arr1 = { 1, 5, 6, 15, 8, 9, 10 };
		int[] arr2 = { 5, 9, 16, 21, 17, 2 ,3};
		int[] arr3 =new int[arr1.length]; // THIS ARRAY WORKS ABOVE TWO ARRAYS CALUCULATION  REFERENCES ARRAY 
		for(int i=0;i<arr1.length;i++)  
		{ // arr3[0]=arr1[0]+arr2[0] = 1+5=6===>arr3[0]=6.....length.
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println(Arrays.toString(arr3)); // RETURN STRING 
	

	}

} 

