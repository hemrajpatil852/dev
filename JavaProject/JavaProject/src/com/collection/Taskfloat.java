package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Taskfloat {

	public static void main(String[] args) {

		
		ArrayList<Float> fl= new ArrayList();

		 fl.add(80.11f);
		 fl.add(45.02f);
		 fl.add(42.05f);
		 fl.add(70.97f);
		 
		 //System.out.println(fl);
		 for (int i=0; i<fl.size();i++)
		 {
			System.out.println(fl.get(i));
		 }
		 
		//	ArrayList<Float> fl= new ArrayList();
			ListIterator<Float>ltr= fl.listIterator(fl.size());
				
//			     while(ltr.hasNext())
//			     {
//			    	 System.out.println(ltr.next());
//			     }
	    System.out.println(":::::::::::::::::::::::::::");
			     while(ltr.hasPrevious())
			     {
			    	 System.out.println(ltr.previous());
			     }
				
			}
	}
	
