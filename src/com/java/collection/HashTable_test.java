package com.java.collection;

import java.util.Hashtable;

public class HashTable_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable tab = new Hashtable<>();
		
		tab.put(10, 100);
		tab.put(60, 600);
		tab.put(40, 400);
//		tab.put(null, 400);
	//	tab.put(30, null);
		
		
		System.out.println(tab);
		
		System.out.println(tab.keySet());
		System.out.println(tab.values());

	}

}
