package com.java.collection;

import java.util.ArrayList;

public class ArrayList_Copy {

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
		
		
		
		ArrayList a = list1; //copy
		
	

		list1.remove(0);
		list1.add("hiii");
		a.add("tt");
		
		System.out.println(list1);
		
		System.out.println(a);
		
	}

}
