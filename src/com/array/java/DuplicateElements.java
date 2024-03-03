package com.array.java;


public class DuplicateElements
{

	public static void main(String[] args)
	{
		int dup=0;
		int[] arr = {2,2,6,5,10,11,15,23,18,6,10};
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++) 
        	 {
        		 if(arr[i]==arr[j])
        		 {
        			 dup=arr[i];
        			 
        		 }
              }
        }  
         System.out.print(dup);

     
         
	}

}

