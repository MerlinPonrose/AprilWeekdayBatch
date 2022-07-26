package com.java.collection;

import java.util.ArrayList;

public class ArrayList_AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList list1 = new ArrayList<>();
		
	list1.add("helo");
	list1.add('o');
	list1.add(90.8);
	list1.add(9);
	list1.add("@");
	list1.add("_");

	list1.add(true);
	
	
	
	
	ArrayList a = new ArrayList<>();
	a.add("Hii");
	a.add(1000);
	
	System.out.println(a.addAll(list1));
	
	for(Object i:a)
	{
		System.out.println(i);
	}
	
	}

}
