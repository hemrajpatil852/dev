package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInputstreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("d:/file_han/emp.dat");
		
		FileInputStream fos = new FileInputStream(f);
		ObjectInputStream oos = new ObjectInputStream(fos);

		@SuppressWarnings("unchecked")
		ArrayList<Employee> al = (ArrayList<Employee>) oos.readObject();
		Iterator<Employee> it = al.iterator();

		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.pincode);
		}

	}

}