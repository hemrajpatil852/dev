package com.String;

import java.util.Scanner;

public class Stringcounting {

	public static void main(String[] args) {

		
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String");
		s=sc.nextLine();
		
		int vowel=0;
		int consonant=0;
		int digit=0;
		int space=0;
		int symbol=0;
		
		s=s.toLowerCase();
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
		if (ch=='a'|| ch=='e'|| ch=='o'||ch=='u')
				vowel++;
		else if(ch>='a'&&ch<='z')
			consonant++;
		else if (ch>='0'&&ch<='9')
			digit++;
		else if (ch== ' ')
			space++;
		else if (ch=='@')
			symbol++;
		
		}
		System.out.println("Vowel: "+vowel);
		System.out.println("Digit: "+digit);
		System.out.println("Space: "+(space+1));

		}
			
	}
