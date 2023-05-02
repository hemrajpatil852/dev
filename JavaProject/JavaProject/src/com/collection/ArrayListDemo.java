package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void Display(ArrayList<String> str) {

		ArrayList<String> str2 = new ArrayList<String>();

		for (int i = 0; i < str.size(); i++) {

			for (int j = i+1; j <str.size(); j++) {

				if (str.get(i) == str.get(j)) {
					
					str2.remove(j);
				}
			}

			str2.add(str.get(i));

		}
		System.out.println(str2);
	}

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("Mon");
		str.add("Tue");
		str.add("Wed");
		str.add("Thu");
		str.add("Fri");
		str.add("Sat");
		str.add("Sun");

		ArrayListDemo.Display(str);
	}

}
