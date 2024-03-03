package com.array.java;


import java.util.Arrays;

public class SortingAnArrayUseMethod 
{

	public static void main(String[] args)
	{
      int[] arr= {13,15,18,31,21,17};   
      System.out.println("Before Sorting:"+Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("After Sorting:"+Arrays.toString(arr));
      //after sorting 13,15,17,18,21,31
	}

}

