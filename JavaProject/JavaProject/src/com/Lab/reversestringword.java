package com.Lab;

public class reversestringword {
	public static String reverseWords(String input) {
		String[] words = input.split("\\s+");

		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i != 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		String input = "Hello World";
		System.out.println(input);

		String reversedString = reverseWords(input);
		System.out.println(reversedString);
	}

}
