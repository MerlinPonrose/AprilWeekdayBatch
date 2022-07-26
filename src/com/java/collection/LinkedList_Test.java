package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		LinkedList list = new LinkedList<>();
		
		list.add("Vcentry1");

		list.add("Vcentry2");
		list.add("Vcentry3");
		list.add("Vcentry4");
		list.add("Vcentry1");

		list.add("Vcentry2");
		list.add("Vcentry3");
		list.add("Vcentry4");
		
		System.out.println(list.get(1));
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	
		
	}

}
