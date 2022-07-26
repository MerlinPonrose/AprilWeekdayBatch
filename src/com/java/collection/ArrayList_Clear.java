package com.java.collection;

import java.util.ArrayList;

public class ArrayList_Clear {

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
		
		
		System.out.println("Before clear ="+list1.size());
		
		list1.clear(); // clear all the elements and make the list empty
		
		System.out.println("After clear ="+list1.size());
		
		
		
	}

}
