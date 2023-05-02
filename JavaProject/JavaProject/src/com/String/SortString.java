package com.String;

import java.util.Arrays;

public class SortString {

	
	public void Disply(String[] str)
	{
		String sx[]= str;
		for (int i=0; i<sx.length; i++)
		{
			for (int j=1+1; j<sx.length; j++)
			{
				if (sx[i].compareTo(sx[j]) >0)
				{
					String temp= sx[i];
					sx[i]=sx[j];
					sx[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(sx));
	}
	
	
	public static void main(String[] args) {

		
		String str[]= {"pune"," mumbai","Banglore","Hydrabad"};
		
		SortString obj=new SortString ();
		obj.Disply(str);
		
	}

	
}
