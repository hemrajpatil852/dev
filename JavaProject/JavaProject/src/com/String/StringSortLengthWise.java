package com.String;

import java.util.Arrays;

public class StringSortLengthWise {

	public static void ShortByLength(String s) {
		String st[] = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; i++) {
				if (st[i].length() > st[j].length())
				{
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				} else if (st[i].length() == st[j].length()) {
					if (st[i].compareTo(st[j]) < 0) {
						String temp1 = st[i];
						st[i] = st[j];
						st[j] = temp1;

					}
				}
			}

		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {

		String str = "India is my country";

		StringSortLengthWise.ShortByLength(str);
	}

}
