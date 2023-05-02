package com.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Student1 {


	int id;
	String s_name;
	float marks[];
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public float[] getMarks() {
		return marks;
	}


	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	
	
	
	


	@Override
	public String toString() {
		return "Student1 [id=" + id + ", s_name=" + s_name + ", marks=" + Arrays.toString(marks) + "]";
	}


	public static void main(String[] args) {
		Student1 s[]=new Student1[1];
		Scanner sc=new Scanner(System.in);
		
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter size");
			int size=sc.nextInt();
			float arr[]=new float[size];
			System.out.println("Enetr marks;");
			s[i]=new Student1();
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=sc.nextFloat();
			}
			
			s[i].setId(id);
			s[i].setS_name(name);
			s[i].setMarks(arr);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getId());
			System.out.println(s[i].getS_name());
			float sum=0.0f;
			
			
			
			float []f=s[i].getMarks();
			System.out.println(f.length);
			for(int j=0;j<f.length;j++)
			{
				sum=sum+f[j];
				
			}
			System.out.println(sum);
			System.out.println("per is"+sum/f.length);
			
			
		}
		

	}

}
