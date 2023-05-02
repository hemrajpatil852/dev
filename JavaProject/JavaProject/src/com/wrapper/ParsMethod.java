package com.wrapper;

public class ParsMethod {

	public static void main(String[] args) {
		float f = Float.parseFloat("45.46");
		System.out.println(f);

		// value of

		Integer i = Integer.valueOf(10);

		Integer i2 = Integer.valueOf("6541");

		Integer i3 = Integer.valueOf("632650", 2);
		System.out.println(i3);

		// String s="5321";
		String s = String.valueOf(123460);
		System.out.println(s);
		String s2 = String.valueOf('u');

	}

}
