package com.innerclass;

abstract class Template
{
	abstract void mydesign();
	
}
public class Annonymous {

	public static void main(String[] args) {
		Template t= new Template()
				{
			public void mydesign()
			{
				System.out.println("This home designs");
			}
				};
				t.mydesign();
	}

}
