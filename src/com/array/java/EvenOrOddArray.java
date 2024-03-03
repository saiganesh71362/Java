package com.array.java;

// pen
public class EvenOrOddArray
{

	public static void main(String[] args) 
	{
		 int[] a = {2,5,6,9,10};
         for(int i=0;i<a.length;i++)
         {
      	   if(a[i]%2==0)
      	   {
    		   System.out.println("Even Numbers:"+a[i]+" ");

      	   }
         }  

        System.out.println(" "); 
        
         for(int i=0;i<a.length;i++)
         {
      	   if(a[i]%2!=0)
      	   {
      		   System.out.println("Odd Numbers:"+a[i]+" ");
      	   }
         }    

	}

}
