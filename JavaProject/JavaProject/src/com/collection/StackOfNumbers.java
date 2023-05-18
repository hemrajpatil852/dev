package com.collection;

public class StackOfNumbers {
	public static void main(String[] args) {
		MyStack ms=new MyStack(5);
		
		
		
		ms.push(23);
		ms.push(10);
		
		ms.showStack();
		ms.push(55);
		ms.push(34);
		ms.showStack();
		
		ms.peek();
		
		ms.pop();
		ms.showStack();
		
	}
}
