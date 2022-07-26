package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Character> set = new HashSet<>();
		
		set.add('y');
		set.add('w');
		set.add('y');
		set.add('h');
		set.add('i');
		set.add('w');
		
		
		System.out.println(set.size());
		
		Iterator<Character> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		} 
		
		
		HashSet set1 = new HashSet<>();
		set1.add(null);
		set1.add(10);
		
		System.out.println(set1);
	
	}

}
