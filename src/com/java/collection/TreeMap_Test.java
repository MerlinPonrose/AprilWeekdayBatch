package com.java.collection;

import java.util.TreeMap;

public class TreeMap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap map = new TreeMap<>();
		
		map.put(10, 100);
		map.put(50, 500);
		map.put(40, 400);
		map.put(85, 850);
		map.put(20, 200);
	//	map.put(null, 900);
		
		map.put(90, null);
		
		System.out.println(map.get(20));
		
		System.out.println(map);
		

	}

}
