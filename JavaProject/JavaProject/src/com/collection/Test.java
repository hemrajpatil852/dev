package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(80);
		list.add("Pune");
		list.add('a');
		list.add(70.97);

		System.out.println(list);

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(70);
		a1.add(40);
		a1.add(50);
		a1.add(42);
		a1.add(null);
		System.out.println(a1);

	}
}
