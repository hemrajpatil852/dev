package com.ExceptionHanding;

public class NegativeAgeException extends Exception{

	NegativeAgeException()
	{
		System.out.println("Negative Number");
	}
	
	NegativeAgeException(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {

	}

}
