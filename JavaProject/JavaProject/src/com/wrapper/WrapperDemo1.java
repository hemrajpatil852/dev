package com.wrapper;

public class WrapperDemo1 {
	/*
	 * static void m1(short i) { System.out.println("int"); }
	 * 
	 * static void m1(long l) { System.out.println("long"); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * int i = 30; m1(i);
	 * 
	 * }
	 * 
	 * }
	 */
	static void m1(double i) {
		System.out.println("int");
	}

	static void m1(long l) {
		System.out.println("number");
	}

	public static void main(String[] args) {

		int i = 30;
		m1(i);

	}

}