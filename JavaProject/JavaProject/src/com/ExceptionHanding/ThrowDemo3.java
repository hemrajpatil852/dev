package com.ExceptionHanding;

public class ThrowDemo3 {

	public static void main(String[] args) {
		int c = 0;
		try {
			c++;

			try {
				c++;

				try {
					c++;
					throw new Exception();

				} catch (Exception e) {
					c++;
					throw e;

				}
			} catch (Exception e) {
				c++;
				throw e;

			}
		} catch (Exception e) {
			System.out.println(c);
		}
	}
}
