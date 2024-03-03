package com.array.java;

public class CumulativeSum 
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};   // ORIGINAL ARRAY
        int[] cumulativeSum = new int[numbers.length]; // CUMULATIVE ARRAY

        int sum = 0;   // TEMPARAY VARIABLE 
        for (int i = 0; i < numbers.length; i++)
        {        //0+1=1, 1+2 = 3, 3+3=6,6+4=10,10+5=15
            sum = sum+numbers[i]; 
                       //cumulativeSum[0],[1],[2],[3],[4]
            cumulativeSum[i] = sum; // 1,  3,  6,  10, 15
        }
        System.out.print("Original array: ");
        for (int ogarr =0;ogarr<numbers.length;ogarr++)
         {
            System.out.print(numbers[ogarr] + " ");
        }
           System.out.println();
        System.out.print("Cumulative sum array: ");
        for (int cumSum =0;cumSum<cumulativeSum.length;cumSum++) 
        {
            System.out.print(cumulativeSum[cumSum] + " ");
        }
    }
}
