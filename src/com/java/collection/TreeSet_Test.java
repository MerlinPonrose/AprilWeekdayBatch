package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(190);
		set.add(55);
		set.add(20);
	//	set.add(true);
		
		set.add(190);
	//	set.add(null);
	/*	
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		TreeSet set1 = new TreeSet<>();
		
		set1.add("hii");
		set1.add("aa");
		set1.add("zz");
		set1.add("bb");
		
		System.out.println(set1);
		
		
	}
	

}
