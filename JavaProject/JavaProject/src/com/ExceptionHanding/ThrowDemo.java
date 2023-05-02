package com.ExceptionHanding;

public class ThrowDemo {
	
	public static void check(int age) {
		if (age<18)
		{
		throw new ArithmeticException("invalid");
	}
	else 
	{
		System.out.println("valid for driving");
	}
		System.out.println("hello");
}

	public static void main(String[] args) {
 try {
	 ThrowDemo.check(10);
 }
 catch (ArithmeticException e)
 {
	 System.out.println(e);
 }
 System.out.println("Done");
	}

}
