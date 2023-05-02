package com.String;

import java.util.Scanner;

public class SecondOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	      System.out.print("Enter String: ");
	      String str = sc.nextLine();
	      System.out.print("Enter a character: ");
	      char ch = sc.next().charAt(0);
	      
	      int index = str.indexOf(ch, str.indexOf(ch) + 1);
	      
 System.out.println("second occurrence of character  is: " + ch + " "+ index);
               sc.close();

	}

}
