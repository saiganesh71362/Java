package com.array.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SmallestArraySecondNumber {

	public static void main(String[] args) throws IOException 
	{
		int[] arr = {8,7,5,4,3,2,6};
		int temp =0;
        for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				System.out.println(Arrays.toString(arr));

				}
			}
			
		}
			System.out.println("Array Second Smalest Number :: "+arr[arr.length-2]);
		

	}

}
