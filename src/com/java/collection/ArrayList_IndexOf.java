package com.java.collection;

import java.util.ArrayList;

public class ArrayList_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> list = new ArrayList<>(); // creation of array list
		
	list.add(4); //adding values
	list.add(10);
	list.add(100);
	list.add(90);
	
	
	System.out.println(list.indexOf(100));
	
	
	
	ArrayList list1 = new ArrayList<>();
	
list1.add("helo");
list1.add('o');
list1.add(90.8);
list1.add(9);
list1.add("@");
list1.add("_");

list1.add(true);


System.out.println(list1.indexOf("@"));

	}

}
