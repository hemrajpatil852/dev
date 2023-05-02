package com.collection;

import java.util.Scanner;

public class Arrays1 {

	void add(int arr[])
	{
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=arr[i]+arr[arr.length-1-i];
			System.out.println(sum);
			
			
		}
	}

	public static void main(String[] args) {
		//int arr[]= {1,5,6,4,2,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		Arrays1 a=new Arrays1();
		a.add(arr);
		
		

	}

}
