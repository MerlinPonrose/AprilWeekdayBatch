package com.java.collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet set = new LinkedHashSet<>();
		
		set.add(true);
		set.add("hii");
		set.add(1000);
		set.add(1000);
		set.add(9.6);
		set.add(true);
		set.add(1000);
		set.add(null);
		
		
		for(Object i: set)
		{
			System.out.println(i);
		}

	}

}
