package com.ExceptionHanding;

public class TryAndFinally {

	public static void main(String[] args) {

		
		try {
			int a =10/0;
			System.out.println(a);
			
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}
