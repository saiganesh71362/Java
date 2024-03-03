package com.array.java;

import java.util.Arrays;

public class TwoArraysCompare
{
    public static void main(String[] args)
    { // I TOOK TWO EQUAL ARRAYS
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5,};
        
        boolean areEqual = Arrays.equals(array1, array2);// [0][0][0][1]
        
        if (areEqual)
        {
            System.out.println("Arrays are equal.");
        } else 
        {
            System.out.println("Arrays are not equal.");
        }
    }
}