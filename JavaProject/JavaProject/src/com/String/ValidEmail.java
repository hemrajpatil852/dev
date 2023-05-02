package com.String;

import java.util.Scanner;

public class ValidEmail {
	public static void email(String str)
	{
		boolean flag =false;
		for (int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			if ((ch>= 'a' && ch<='z'&& ch>= 'A' && ch<='Z')&&(ch>='0'&& ch<=9)
			&&(ch=='!'|| ch=='@'||ch=='#' || ch== '&')||ch=='.')
			{
				flag=true;
				
			}
		}
		if(flag)
		{
			System.out.println("valid email id");
		}
			else
			System.out.println("Not valid email id");
		}
	
	public static void main(String[] args)
	{
          Scanner sc= new Scanner (System.in);
          System.out.println("Enter Email id");
          String str=sc.nextLine();
          ValidEmail v= new ValidEmail();
          v.email(str);
          
	}

}
