package com.array.java;

public class ArrayReverse {

	public static void main(String[] args) 
	{
	   //int temp =0;
       int[] arr = {70,60,50,40,30,20,10};
       for(int i=arr.length-1;i>=0;i--)   // reverse order 
       {
    	   System.out.print(arr[i]+",");
       }
       System.out.println();
       for(int i=0;i<arr.length;i++)    // normal order
       {
    	   System.out.print(arr[i]+",");
       }
	}

}
