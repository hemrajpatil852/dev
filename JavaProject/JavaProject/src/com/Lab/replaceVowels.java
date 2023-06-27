package com.Lab;

public class replaceVowels {

	public static String replaceVowels(String input) {
		char[] chars = input.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char c = Character.toLowerCase(chars[i]);

			if (isVowel(c)) {
				chars[i] = '*'; 
			}
		}

		return new String(chars);
	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		String input = "Hello, World";
		System.out.println(input);

		String result = replaceVowels(input);
		System.out.println(result);
	}
}