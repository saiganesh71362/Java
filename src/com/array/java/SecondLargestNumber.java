package com.array.java;

import java.util.Arrays;

public class SecondLargestNumber 
{

	public static void main(String[] args)
	{
		int[] arr = {10,90,80,60,70,50,40,30,20};
		
		int temp = 0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				System.out.println(Arrays.toString(arr));
				}
			}
			
		}
		System.out.println( "Second largest Number :"+arr[arr.length-2]);   // Second Large number(arr[arr.length-2])
		

	}

}
