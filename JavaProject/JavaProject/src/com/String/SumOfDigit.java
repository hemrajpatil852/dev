package com.String;

import java.util.Scanner;

public class SumOfDigit {
	public void FindDigitSumm(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				sum = sum + Character.getNumericValue(c);
			}

		}
		System.out.println("sum=" + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		SumOfDigit str = new SumOfDigit();
		str.FindDigitSumm(s);

	}
}