package com.String;

import java.util.Scanner;

public class ReversWord {

	public static void EachWordrevers(String str) {
		String s[] = str.split(" ");
		String revers = "";

		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			String revsword = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revsword = revsword + word.charAt(j);

			}
			revers = revers + " " + revsword;

		}
		System.out.println(revers);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		ReversWord.EachWordrevers(s);

	}

}
