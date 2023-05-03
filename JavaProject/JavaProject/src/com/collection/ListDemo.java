package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Studentt implements Comparable<Studentt> {
	int d_id;
	String s_name;
	int mark;

	public Studentt(int d_id, String s_name, int mark) {
		super();
		this.d_id = d_id;
		this.s_name = s_name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [d_id=" + d_id + ", s_name=" + s_name + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Studentt o) {
		return this.mark - o.mark;
	}

}

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Studentt> std = new ArrayList<Studentt>();

		std.add(new Studentt(101, "raj", 90));
		std.add(new Studentt(102, "rahul", 80));
		std.add(new Studentt(101, "vishal", 70));

		for (Studentt s : std) {
			System.out.println(s);
		}
           System.out.println("*******************************");
 
		  Collections.sort(std);
		
		for (Studentt s: std)
		{
			System.out.println(s);
		}
	}

}

