package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		al.add("Java");
		al.add("C++");
		al.add("DotNet");
		al.add("Php");
		Object a[] = al.toArray();

		System.out.println(Arrays.toString(a));

		String s[] = al.toArray(new String[al.size()]);

		for (String st : s) {
			System.out.println(st);
		}

		String[] str = new String[al.size()];

		for (int i = 0; i < al.size(); i++) {
			str[i] = al.get(i);
		}

//		for(String value:str)
//		{
//			System.out.println(value);
//		}
	}

}
