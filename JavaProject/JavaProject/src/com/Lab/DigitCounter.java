package com.Lab;

public class DigitCounter {
	public static int countDigits(String input) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String input = "Hello12345World789";
		
		System.out.println(input);

		int digitCount = countDigits(input);
		System.out.println("Number of digits: " + digitCount);
	}

}
