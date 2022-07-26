package com.java.collection;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> list = new ArrayList<>(); // creation of array list
		
	list.add(4); //adding values
	list.add(10);
	list.add(100);
	list.add(90);
	
	list.remove(0); // remove values from list
	
	System.out.println(list);
	
	
	ArrayList list1 = new ArrayList<>();
	
list1.add("helo");
list1.add('o');
list1.add(90.8);
list1.add(9);
list1.add("@");
list1.add("_");

list1.add(true);

System.out.println(list1);


ArrayList<Character> charlist = new ArrayList<>();

charlist.add('r');
charlist.add('u');

System.out.println(charlist);





	}

}
