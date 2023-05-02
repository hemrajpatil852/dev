package com.collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Primelelemenat {

	public void Display(ArrayList<Integer> li) {

		for (int i = 0; i < li.size(); i++) {
			Integer count = 0;

			for (int j = 2; j < li.get(i); j++) {
				if (li.get(i) % j == 0) {
					count++;

				}

			}
			if (count == 0) {
				System.out.println(li.get(i));
			}

		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(11);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		li.add(17);
		li.add(18);
		li.add(19);
		li.add(20);

		Primelelemenat pl = new Primelelemenat();
		pl.Display(li);

		// System.out.println(li);

	}
}
