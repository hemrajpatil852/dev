package com.collection;

import java.util.Scanner;

public class Patetrn1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr rows");
		int rows=sc.nextInt();
	
		
		for(int i=1;i<=rows;i++)
		{
			
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
					
			
		}
		for(int i=rows-1;i>=1;i--)
		{
			
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
					
			
		}

	}
}
