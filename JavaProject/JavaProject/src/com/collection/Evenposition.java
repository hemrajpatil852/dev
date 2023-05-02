package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Evenposition {

	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList();
		
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		for ( int i=0; i<al.size(); i++)
		{
			if (al.get	(i)%2==0)
			{
				System.out.println(al.get(i));
			}
			
		}
//		for(Integer n:al)
//		{
//			if(n%2==0)
//			{
//				System.out.println(n);
//			}
//		}
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
