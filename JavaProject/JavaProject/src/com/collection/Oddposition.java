package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Oddposition {

	public static void main(String[] args) {
ArrayList<Integer> al= new ArrayList();
		
		al.add(2);
		al.add(11);
		al.add(12);
		al.add(31);
		al.add(1);
		
		for ( int i=0; i<al.size(); i++)
		{
			if (al.get	(i)%2!=0)
			{
				System.out.println(al.get(i));
			}
			
		}
		
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext())
		{
			Integer num= itr.next();
			if(num %2 ==0)
			{
				System.out.println(num);
			}
		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			it.next();
		}
				
		
	}

}
