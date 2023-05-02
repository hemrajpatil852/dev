package com.collection;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {

		ArrayList<String>al=new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nashik");
		
		System.out.println(al);
		
		al.add(0,"Nandurbar");
		System.out.println(al);
		
		al.set(0,"goa");  
		System.out.println(al);
		
		al.remove(2);  
		System.out.println(al);
		
		
		ArrayList<String>all=new ArrayList();
		
		all.add("pune");
		
		System.out.println(all);
		
		all.addAll(al);
		System.out.println(all);
	}

}
