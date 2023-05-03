package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Course1 {
	int c_id;
	String c_name;
	int c_fees;

	public Course1(int c_id, String c_name, int c_fees) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_fees = c_fees;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_fees=" + c_fees + "]";
	}

}

class Stude {
	int s_id;
	String s_name;
	ArrayList<Course1> c;

	public Stude(int s_id, String s_name, ArrayList<Course1> c) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", c=" + c + "]";
	}

}

public class Studentttt {

	private static ArrayList<Course1> c_fees;

	public static void main(String[] args) {
		ArrayList<Stude> stud = new ArrayList<Stude>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++)

		{
			System.out.println("Enter a Student id");
			int s_id = sc.nextInt();

			System.out.println("Enter a Student name");
			String s_name = sc.next();

			ArrayList<Course1> c = new ArrayList<Course1>();
			int n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				System.out.println("Enter a course id");
				int c_id = sc.nextInt();

				System.out.println("Enter a course name");
				String c_name = sc.next();

				System.out.println("Enter a Course fees");
				int c_fee = sc.nextInt();

				c.add((new Course1(c_id, c_name, c_fee)));
			}
			stud.add((new Stude(s_id, s_name, c_fees)));
		}
		for (Stude s : stud) {
			System.out.println(s);
		}

	}

}
