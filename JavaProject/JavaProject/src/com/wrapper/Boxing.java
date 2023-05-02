package com.wrapper;

public class Boxing {

	public static void main(String[] args) {

		// ptimitive to object-- boxing
		int i = 10;

		Integer num1 = new Integer(i);// boxing
		System.out.println(num1);

		Integer num2 = i; // autoboxing

		System.out.println("********************");
		// object to primitive
		int x = num1.intValue(); // unboxning

		int x2 = num1;// auto unboxining

		String s = "1212";

		int z = Integer.parseInt(s);
		System.out.println(z * 2);
	}

}
