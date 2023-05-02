package com.collection;

import java.util.ArrayList;

public class Fruits {
	public static void Display(ArrayList<String> st1) {
		ArrayList<String> st0 = new ArrayList<String>();

		for (int i = 0; i < st0.size(); i++) {
			int count = 0;

			for (int j = 0; j < st1.size(); j++) {
				if (st0.get(i) == st1.get(j)) {
					count++;
					break;

				}
			}
			if (count == 0) {
				System.out.println(st1.get(i) + " " + st1.get(i));
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<String> st0 = new ArrayList<String>();

		st0.add("Mango");
		st0.add("apple");
		st0.add("kiwi");
		st0.add("pineapple");

		ArrayList<String> st1 = new ArrayList<String>();
		st1.add("Mango");
		st1.add("apple");
		st1.add("kiwi");
		st1.add("pineapple");

		Fruits.Display(st1);

	}

}
