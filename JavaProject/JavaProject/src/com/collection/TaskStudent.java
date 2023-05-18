package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskStudent {
	int id;
	String name;
	ArrayList<String> hobbies;

	public TaskStudent(int id, String name, ArrayList<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "TaskStudent [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

	public static void main(String[] args) {

		ArrayList<TaskStudent> li = new ArrayList<TaskStudent>();

		li.add(new TaskStudent(101, "Raj", new ArrayList<>(Arrays.asList("Traveling, Reading"))));
		li.add(new TaskStudent(102, "Rahul", new ArrayList<>(Arrays.asList("Traveling, Reading"))));

		for (TaskStudent t : li) {
			System.out.println(t);

		}

	}

}
