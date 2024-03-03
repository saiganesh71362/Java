package com.array.java;

import java.util.Arrays;

public class TwoArraysMerge
{

	public static void main(String[] args)
	{
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int a1= arr1.length;
        int a2 = arr2.length;
        int c = a1+a2;
        int[] arr3 = new int[c];
        System.out.print("Two Merge Arrays:");
        for(int i=0;i<a1;i+=1)
        {
        	arr3[i] = arr1[i];
        }
        for(int i=0;i<a2;i+=1)
        {
        	arr3[a1+i] = arr2[i];
        }
        for(int i=0;i<c;i=i+=1)
        {
            System.out.print(arr3[i]);

       }
	}

}
