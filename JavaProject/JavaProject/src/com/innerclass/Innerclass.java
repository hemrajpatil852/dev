package com.innerclass;


class Outer{
	int x=20;
	

class InnerClas {
	public void show()
	{
		System.out.println("X="+x);
	}
}
}
public class Innerclass {

	public static void main(String[] args) {

		Outer o= new Outer();
		Outer.InnerClas in=o. new InnerClas();
		in.show();
		
	}

}
