package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void CheckAngram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			String st1 = str1.toLowerCase();
			String st2 = str2.toLowerCase();
			System.out.println(st1 + " " + st2);

			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));

			String s1 = new String(ch1);
			String s2 = new String(ch2);

			if (s1.equals(s2)) {
				System.out.println("Angaram");
			} else {
				System.out.println("not Anagaram");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1 = sc.next();
		System.out.println("Enter the 2nd String");
		String s2 = sc.next();

		StringAnagram.CheckAngram(s1, s2);

	}

}
