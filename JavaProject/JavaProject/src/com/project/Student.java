package com.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


class Studentt {
	int sid;
	String sname;

	public Studentt(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}

class Course {
	int cid;
	String cname;
	int cfees;
	Studentt s;

	public Course(int cid, String cname, int cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees=cfees;
		this.s = s;
	}
	

	public Course(int sid, String sname) {
		// TODO Auto-generated constructor stub
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getCfees() {
		return cfees;
	}


	public void setCfees(int cfees) {
		this.cfees = cfees;
	}


	public Studentt getS() {
		return s;
	}


	public void setS(Studentt s) {
		this.s = s;
	}


	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + " cfees"+cfees +", s=" + s + "]";
	}

}

public class Student {

	private static int cid;
	private static Object sid;

	public Student(Object sid, String sname) {
	}

	public static void main(String[] args) {

		ArrayList<Course> c = new ArrayList<Course>();
		
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
				System.out.print("Enter Student id: ");
				int cid = sc.nextInt();
				System.out.print("Enter Student Name: ");
				String sname = sc1.nextLine();
				
				System.out.print("Enter course id: ");
				 cid = sc.nextInt();
				
				System.out.print("Enter course name: ");
				String cname = sc1.nextLine();
				
				System.out.print("Enter course fees: ");
				int cfees = sc.nextInt();
				

				c.add(new Course(cid, cname,s (new Student (sid,sname))));
				break;
			case 2:
				System.out.println("************************");

				Iterator<Course> it = c.iterator();

				while (it.hasNext()) {
					Course co = it.next();
					System.out.println(co);
				}
				System.out.println("**********************");
				break;

			case 3:
				boolean found = false;
				System.out.println("Enter Student Search: ");
				int sid = sc.nextInt();
				System.out.println("*********************");
				it = c.iterator();
				while (it.hasNext()) {
					Course co = it.next();
					if (co.getCid() == sid ) {
						System.out.println(co);
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
				System.out.println("Enter Student Delete id: ");
				sid = sc.nextInt();
				System.out.println("*********************");
				it = c.iterator();
				while (it.hasNext()) {
					Course co = it.next();
					if (co.getCid() == sid) {
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
				System.out.println("Enter Student Update id:");
				sid = sc.nextInt();
				ListIterator<Course> lii = c.listIterator();
				while (lii.hasNext()) {
					Course co = lii.next();
						System.out.print("Enter the student Name :");
						sname = sc1.nextLine();

						System.out.print("Enter course name :");
					    String cname1 = sc.nextLine();
					    
					    
						lii.set(new Course(sid , cname1));
						found = true;
					
				}
				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Update Sucessfullay");
					
				}
				break;
			}
			

		} while (ch != 0);

		}

	private static int s(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}