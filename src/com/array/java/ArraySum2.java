package com.array.java;

public class ArraySum2 {

	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		              //sum+arr[i]   sum+arr[i]   sum+arr[i], sum+arr[i] 
		 int sum =0 ;//; 10+20=30,sum=30+30=60,sum =60+40=100, 100+50 =150
		 for(int i=0;i<arr.length;i++)   
		 {
			 sum = sum+arr[i]; //0+10+ =150
		 }
		 System.out.println(sum);

	}

}
