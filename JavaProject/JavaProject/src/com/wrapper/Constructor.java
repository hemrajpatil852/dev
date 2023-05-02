package com.wrapper;

public class Constructor {

	public static void main(String[] args) {

		Integer i = new Integer(34);

		Integer i2 = new Integer("56");
		System.out.println(i2);

		char ch = 'p';
		Character c = new Character(ch);
		System.out.println(c);

		Boolean b = new Boolean(true);

		Boolean b1 = new Boolean("false");
		System.out.println(b + " " + b1);

		Boolean b2 = new Boolean("true");
		System.out.println(b2);

	}

}
