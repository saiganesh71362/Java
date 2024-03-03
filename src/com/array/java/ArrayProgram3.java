package com.array.java;

public class ArrayProgram3
{

	public static void main(String[] args)
	{
       int arr[] = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {// for(int i :arr)
    	   System.out.print(arr[i]+" ");  //  ==> length 5 (total-i)
        }
        System.out.println(" ");
        System.out.print(arr[0]+" ");
	}

}
