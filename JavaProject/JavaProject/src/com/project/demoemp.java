package com.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class employee {
	private int empid;
	private String ename;
	private int salary;

	public employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class demoemp {
	public static void main(String agrs[]) {
		ArrayList<employee> al = new ArrayList<employee>();

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		int ch;
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPlAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println(" Enter your choice No");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Employee id: ");
				int empid = sc.nextInt();
				System.out.print("Enter Employee Name: ");
				String ename = sc1.nextLine();
				System.out.print("Enter Employee Salary: ");
				int salary = sc.nextInt();

				al.add(new employee(empid, ename, salary));

				break;
			case 2:
				System.out.println("************************");

				Iterator<employee> it = al.iterator();

				while (it.hasNext()) {
					employee e = it.next();
					System.out.println(e);
				}
				System.out.println("**********************");
				break;

			case 3:
				boolean found = false;
				System.out.println("Enter Employee Search: ");
				int Empid = sc.nextInt();
				System.out.println("*********************");
				it = al.iterator();
				while (it.hasNext()) {
					employee e = it.next();
					if (e.getEmpid() == Empid) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("***********************");
				break;

			case 4:
				found = false;
				System.out.println("Enter Employee Delete id: ");
				Empid = sc.nextInt();
				System.out.println("*********************");
				it = al.iterator();
				while (it.hasNext()) {
					employee e = it.next();
					if (e.getEmpid() == Empid) {
						it.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Delete Sucessfullay ");
					;
				}
				System.out.println("***********************");
				break;

			case 5:
				found = false;
				System.out.println("Enter Employee Update id:");
				Empid = sc.nextInt();
				ListIterator<employee> lii = al.listIterator();
				while (lii.hasNext()) {
					employee e = lii.next();
					if (e.getEmpid() == Empid) {
						System.out.print("Enter the course id :");
						int cid = sc1.nextInt();
						
						System.out.print("Enter the course Name :");
						String cname = sc1.nextLine();

						System.out.print("Enter the course fees :");
						int cfees = sc.nextInt();
						lii.set(new employee(cid,cname,cfees));
						found = true;
					
				}
				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Update Sucessfullay");
					
				}
				break;
			}
			}

		} while (ch != 0);

	}
}


