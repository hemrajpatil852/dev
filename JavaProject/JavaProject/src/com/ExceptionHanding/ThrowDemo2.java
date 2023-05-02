package com.ExceptionHanding;

public class ThrowDemo2 {

	public static void m1()
	{
		throw new NullPointerException("nullvalue");
		
	}
	public static void n1()
	{
	m1();
	}
	public static void p1()
	{
		try {
		     n1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
        p1();
        System.out.println("done");
	}

}
