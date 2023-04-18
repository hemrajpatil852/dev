package com.String;

public class StringPalindrome {

	
	public static void main(String[] args) {

		String Str = "wow";
		StringBuffer sb= new StringBuffer(Str);
	      sb.reverse();
		String str =sb.toString();
		if(str.equals(str))
		{
			System.out.println(str+" string is palindrome");
		}
		else
		{
			System.out.println(str+" String is not palindrome");
		}
	}

}
