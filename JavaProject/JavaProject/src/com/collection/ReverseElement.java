package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
	}

}
