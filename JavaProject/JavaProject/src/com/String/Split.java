package com.String;

public class Split {

	
	static void show(String s)
	{
		String[] arr= s.split("\\+");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		String s="hello+java+language";
		show(s);

	}

}
