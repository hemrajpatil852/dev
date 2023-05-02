package com.innerclass;



class MyStaticOuter
{
	static int x=10;
	static class MyInnerStatic {
		public static void showData()
		{
			System.out.println(x);
		}
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		MyStaticOuter.MyInnerStatic.showData();
		
	}

}
