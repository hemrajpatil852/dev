package com.innerclass;

class MyOuterClass
{
	int x=30;
	
	public void Display ()
	{
		class MyLocalInnerClass
		{
			public void put()
			{
				System.out.println("Hi this local");
			}
		}
		MyLocalInnerClass c= new MyLocalInnerClass();
		c.put();
		
	}
}

public class LocalInnerClass {

	 public static void main (String [] args)
	 {
		 MyOuterClass m= new MyOuterClass();
		 m.Display();
		 
	 }
}
