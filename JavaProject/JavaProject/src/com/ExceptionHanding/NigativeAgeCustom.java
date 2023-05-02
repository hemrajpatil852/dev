package com.ExceptionHanding;

public class NigativeAgeCustom {

	public void checkAge(int age) throws NegativeAgeException
	{
		if (age<0)
		{
			throw new NegativeAgeException();
		}
		else
		{
			System.out.println("valid");
		}
	}
	
	public static void main(String[] args) {
		NigativeAgeCustom n=new NigativeAgeCustom();
		try
		{
			n.checkAge(-12);
			
		}
		catch(NegativeAgeException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("hii");
	}

}
