package com.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
     int x;
     
     Scanner sc= new Scanner (System.in);
     System.out.println("Enter a number");
     x=sc.nextInt();
     int count=0;
     
     for (int i=1;i<=x; i++)
     {
    	 if (i%x==0) {
    		 count++;
    	 }
    	 
     }
     if (count==2)
     {
    	 System.out.println("This is Prime Number");
     }
     System.out.println("This is  not prime number");
	}
}