package com.ExceptionHanding;

public class InvalidData {
	public static void checkName(String s) {
		boolean isdigitpresent = false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				break;

			}
		}
		if (isdigitpresent == true) {
			throw new InvalidData1("Name invalid");

		} else {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		try {
			checkName("Raj patil 1");

		} catch (InvalidData1 i) {
			i.printStackTrace();
		}
		System.out.println("Done");
	}
}