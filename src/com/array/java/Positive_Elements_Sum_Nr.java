package com.array.java;

public class Positive_Elements_Sum_Nr
{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,-4,-5};
		int sum = 0;
		 int sum1 = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				sum = sum+i;
			}
			if(arr[i]<0)
			{
				sum1 = sum1+i;
			}

		}
		System.out.println(sum);
		System.out.println(sum1);



	}

}
