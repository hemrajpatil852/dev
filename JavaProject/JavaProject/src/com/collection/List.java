package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {

		ArrayList<String> a11 = new ArrayList();

		a11.add("Red");
		a11.add("Green");
		a11.add("Blue");
		a11.add("Balack");
		System.out.println(a11);

		System.out.println(a11.size());

		for (int i = 0; i < a11.size(); i++) {
			System.out.println(a11.get(i));
		}

		/*
		 * for(String s: a11) { System.out.println(s); }
		 */

		System.out.println("*********************");

		Iterator<String> itr = a11.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// itr.next();

		}
		System.out.println("*********************");

		ListIterator<String> ltr = a11.listIterator(a11.size());

		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

}
