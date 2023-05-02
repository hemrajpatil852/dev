package com.String;

public class ConvertUpperCase {

	public static void display(String s) {

	for (int i=0; i<s.length(); i++)
	{
		int a=(-32)+s.charAt(i);
		System.out.println((char)a);
		
	}
	}
	public static void main(String[] args) {

		String s="india beautiful country";
		ConvertUpperCase.display(s);
	}

}
