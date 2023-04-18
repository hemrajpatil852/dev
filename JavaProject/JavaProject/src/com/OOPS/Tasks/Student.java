package com.OOPS.Tasks;

import java.util.Scanner;

public class Student {

	int id;
	String name;

	public void Stud(int id, String name) {
		this.id = id;
		this.name = name;
	}

	int getid() {
		return this.id;
	}

	void display() {

		System.out.println(id);
		
	}

	public static void main(String[] args) {

		Student scc = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student id");
		int id = sc.nextInt();

		System.out.println("Enter student name");
		String name = sc.next();

		scc.getid();
		scc.display();

	}

}
