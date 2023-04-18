package com.String;

public class PatternString {

	public static void main(String[] args) {
		String str = "i like india";

		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(s[j] + " ");
			}
			System.out.println();

		}
	}
}
