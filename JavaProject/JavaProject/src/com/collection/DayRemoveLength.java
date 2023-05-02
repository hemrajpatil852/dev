package com.collection;

import java.util.ArrayList;

public class DayRemoveLength {

	public static void Display(ArrayList<String> str) {
		ArrayList<String> str1 = new ArrayList<String>();

		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).length() <= 7) {
				str1.add(str.get(i));
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("Monday");
		str.add("tuesday");
		str.add("wednesday");
		str.add("thursday");
		str.add("friday");
		str.add("saturday");
		str.add("sunday");

		DayRemoveLength dr = new DayRemoveLength();
		dr.Display(str);

	}

}
