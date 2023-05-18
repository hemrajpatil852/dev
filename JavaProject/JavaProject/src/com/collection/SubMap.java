package com.collection;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(10, "red");
		hs.put(20, "yellow");
		hs.put(30, "pink");
		hs.put(40, "black");
		hs.put(50, "blue");
		hs.put(60, "orange");
		hs.put(70, "white");
		
		TreeMap<Integer,String> ts=new TreeMap<>(hs);
		
		SortedMap<Integer,String> ss=ts.subMap(20, 50);
		System.out.println(ss);
		NavigableMap<Integer,String> nm=ts.subMap(20, true, 50, true);
		System.out.println(nm);
		

	}

}

