package com.Lab;

import java.util.*;

public class Hash {

	public static void main(String[] args) {

		HashMap<Integer, String> hp = new HashMap();

		hp.put(5, "Raj");
		hp.put(3, "Rahul");
		hp.put(6, "Kunal");
		hp.put(1, "Kalpesh");
		hp.put(2, "Mayur");

		System.out.println(hp);

		TreeMap<Integer, String> t = new TreeMap(hp);

		for (Map.Entry<Integer, String> m : t.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
