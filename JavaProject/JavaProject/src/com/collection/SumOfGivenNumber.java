package com.collection;

public class SumOfGivenNumber {
	
	
	

	public static void main(String[] args) {
		int num=10;
		
		int arr[]= {1,2,5,4,5,6,8};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num)
				{
					System.out.println(arr[i]+"+"+arr[j]+num);
				}
			}
		}
	}

}
