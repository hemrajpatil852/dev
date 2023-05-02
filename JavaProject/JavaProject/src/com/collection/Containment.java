package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
	int cid;
	String canme;

	public Course(int cid, String canme) {
		super();
		this.cid = cid;
		this.canme = canme;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", canme=" + canme + "]";
	}

}

class Student {
	int id;
	String name;
	Course c;

	public Student(int id, String name, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", c=" + c + "]";
	}

}

public class Containment {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter sid");
			int sid = sc.nextInt();

			System.out.println("Enter sname");
			String sname = sc.next();

			System.out.println("Enter the course id");
			int cid = sc.nextInt();

			System.out.println("Enter the curse Name");
			String cname = sc.next();

			slist.add(new Student(sid, sname, new Course(cid, cname)));
		}
		for (Student s : slist) {
			System.out.println(s);
		}

	}

}
