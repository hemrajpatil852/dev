package com.collection;

public class MyStack {

	int size;
	int top;
	int arr[];
	
	MyStack(int size)
	{
		top=-1;
		this.size=size;
		arr=new int[size];
		
		
	}
	
	void push(int data)
	{
		if(top<arr.length-1)
		{
			//top++;
			arr[++top]=data;
			System.out.println("Element is added."+arr[top]+"at top"+top );
			
		}
		else
			System.out.println("Stack overflow");
			
	}
	
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
			arr[top]=0;
			top--;
		System.out.println("Element removed at "+top);
		
	}
	
	void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
			System.out.println(arr[top]);
		
	}
	
	void showStack()
	{
		if(top>-1)
		{
		for(int i=top;i>-1;i--)
		{
			System.out.println(arr[i]);
		}
		}
		else
			System.out.println("stack is empty");
	}
	
	
	

}
