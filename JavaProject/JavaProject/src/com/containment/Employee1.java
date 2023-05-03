package com.containment;

import java.util.ArrayList;
import java.util.Iterator;


class Loaction {
	int l_id;
	String l_name;

	public Loaction(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "loaction [l_id=" + l_id + ", l_name=" + l_name + "]";
	}

}

class Employeee {
	int e_id;
	String e_name;
	Loaction l;

	public Employeee(int e_id, String e_name, Loaction l) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.l = l;
	}

	@Override
	public String toString() {
		return "Employeee [e_id=" + e_id + ", e_name=" + e_name + ", l=" + l + "]";
	}

	public static void findLocation(ArrayList<Employeee> e) {

		Iterator<Employeee> itr = e.iterator();

		while (itr.hasNext()) {
			Employeee n = itr.next();

				Iterator<Employeee> it = e.iterator();

				while(it.hasNext()) {
					
					Employeee n1 = it.next();
					if (n.l.l_name.equals(n1.l.l_name))
					{	
				if (itr.hasNext()) {
					
					itr.next();
					System.out.println(n1);
				}

			}
		}

	}

}

public class Employee1 {

	public static void main(String[] args) {

		ArrayList<Employeee> e = new ArrayList<Employeee>();

		e.add(new Employeee(1, "raj", new Loaction(101101, "pune")));
		e.add(new Employeee(2, "kunal", new Loaction(230563, "nashik")));
		e.add(new Employeee(3, "rahul", new Loaction(654678, "pune")));

		for (Employeee emp : e) {
			System.out.println(emp);
		}

		System.out.println(".........................");

		Employeee.findLocation(e);

	}

	
}
}
