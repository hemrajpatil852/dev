package com.ExceptionHanding;

public class InvalidData1 extends RuntimeException {
	InvalidData1() {
		System.out.println("digit not allowed");
	}

	InvalidData1(String msg) {
		super(msg);
	}
}
