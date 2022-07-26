package com.java.collection;

import java.util.ArrayList;

public class ArrayList_Contains {

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
	
	System.out.println(list1.contains("hiii"));
	
	System.out.println(list1.contains(9));
	
	
	if(list1.contains(19)) {
		System.out.println("value is available");
	}
	else
	{
		System.out.println("value is not available");
	}
	
	}

}
