package com.collection;

public class Patter3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
					
			
		}
		for(int i=5;i>=1;i--)
		{
			
			for(int sp=4;sp>=1;sp--)
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
