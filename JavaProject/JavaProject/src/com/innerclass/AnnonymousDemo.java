package com.innerclass;

interface Printable{
	void print();
	
}
public class AnnonymousDemo {

	public static void main(String[] args) {
		Printable p= new Printable()
				{
			public void print()
			{
				System.out.println("this is print");
			}
				};
				p.print();
				
	}

}
