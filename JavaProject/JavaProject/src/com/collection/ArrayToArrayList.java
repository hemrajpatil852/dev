package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {

		Integer[] a = { 4, 7, 9, 2, 5, 8 ,10};
		// way 1
		ArrayList<Integer> al = new ArrayList(Arrays.asList(a));

		System.out.println(al);
		// way 2
		ArrayList<Integer> all = new ArrayList();

		Collections.addAll(all, a);

		System.out.println(all);
		// way 3
		ArrayList<Integer> alll = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			alll.add(a[i]);
		}
		System.out.println(alll);
	}

}
