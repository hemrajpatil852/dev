package com.collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Divisible {
	public void Display(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 3 == 0) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void remove (ArrayList<Integer> list)
	{
		java.util.Iterator<Integer> t = list.iterator();
		
		while(t.hasNext())
		{
			int i=(int)t.next();
			if(i%3==0)
			{
			 t.remove();
			}	
		}
			System.out.println(list);
			
	}

	public static void main(String[] args) {

		Divisible d = new Divisible();
		ArrayList<Integer> list = new ArrayList();

		list.add(5);
		list.add(7);
		list.add(3);
		list.add(9);

		d.Display(list);
       d.remove(list);
	}

}
