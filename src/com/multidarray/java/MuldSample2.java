package com.multidarray.java;

public class MuldSample2 {

	public static void main(String[] args)
	{
		int a[][]={{1,3,4},{3,4,5}};  
		int b[][]={{1,3,4},{3,4,5}}; 
		int c[][]=new int[2][3];  
		for(int i=0;i<=a.length;i++)
		{  
			for(int j=0;j<=b.length;j++)
			{  
			c[i][j]=a[i][j]+b[i][j];  
			System.out.print(c[i][j]+" ");  
			}  
			System.out.println();//new line  
			}  
			  



	}

}
