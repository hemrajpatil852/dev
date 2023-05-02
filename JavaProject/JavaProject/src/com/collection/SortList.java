package com.collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SortList {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(123);
		al.add(55);
		al.add(49);
		al.add(24);
		al.add(12);
		
		System.out.println(al);

		for (int i = 0; i < al.size(); i++)
		{
			for (int j = 0; j < al.size(); j++) 
			{
				if (al.get(j) > al.get(i)) 
				{
					int a = al.get(i);
					int b = al.get(j);
					
					al.set(j, a);
					al.set(i, b);
		}
		}
	}
		      System.out.println(al);
	}
}