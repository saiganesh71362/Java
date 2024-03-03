package com.array.java;

public class ArrayProgram2
{  
      
	public static void main(String[] args) 
	{
        int[]  num= new int[5];  // ARRAY DECLARE   // Array create use new key word
        num[0] =10; // VALUES INTILIZATION 
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        
        for(int i=0; i<num.length;i++) // i=0 and j=0 ===> i<j ==> 0<0=10 ...1==>4
        { 
          
        System.out.println(num[i]);
        }
	}

}

