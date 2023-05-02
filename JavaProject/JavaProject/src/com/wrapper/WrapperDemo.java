package com.wrapper;

public class WrapperDemo {
	static void m1(int i) {
		System.out.println("int");
	}

	static void m1(long l) {
		System.out.println("long");
	}

	public static void main(String[] args) {

		int i = 30;
		m1(i);

	}

}
