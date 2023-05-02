package com.String;

import java.util.Scanner;

public class FirstLetterCaptial {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String s = in.nextLine();
		
		String c = " ";
		
		Scanner sc = new Scanner(s);
		
		while (sc.hasNext()) 
		{
			String word = sc.next();
	        c += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(c.trim());
	}

}
