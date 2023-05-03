package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.containment.Employee1;

	class Employee
	{
		
		int id;
		String name;
		int salary;
		
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
	}
	
	public class CustomDmo {


	public static void main(String[] args) {

		ArrayList<Employee> li= new ArrayList<Employee>();
		/*
		 * li.add(new Employee(1, "ram",50000 )); li.add(new Employee(1, "rahul",70000
		 * )); li.add(new Employee(1, "kunal",100000 ));
		 */
		//System.out.println(li);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=3; i++)
		{
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			System.out.println("Enter the ename");
			String ename=sc.next();

			System.out.println("Enter the Salaray");
			int sal=sc.nextInt();

			li.add(new Employee(sal, ename, sal));
			
		}
	         System.out.println(li);
		
		for (Employee e :li)
		{
			System.out.println(e);
		}
		
		Iterator<Employee> it= li.iterator();
		
		while (it.hasNext())
		{
		Employee e =it.next();
		
		//if (e.salary>6000)
		{
			System.out.println(e);
		}
		}
	}

}
