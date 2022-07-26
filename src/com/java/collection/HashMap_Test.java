package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("aa", 01);
		map.put("dd", 04);
		map.put("cc", 03);
	 // adding value to the map
		
		map.put(null, 5);
		map.put("ee", null);
		map.put("bb", 02);
		map.put(null, 15);

		map.put(null, 25);
		map.put("aa", 11);
		
		
		map.put("ff", null);
		map.put("yy", 02);
		
		System.out.println(map);
		
		System.out.println(map.get("cc")); //retrieve
		
		System.out.println(map.get("aa"));
		
		
		HashMap map1 = new HashMap<>();
	
		map1.put('a', "aa");
		map1.put(12, 120);
		
		System.out.println(map1.get('a'));
		
		
		System.out.println(map.keySet()); //to retrieve key 
		
		System.out.println(map.values());// to retrieve value
		
		
	Set<String> keys = 	map.keySet();
	
	Iterator<String> it = keys.iterator();
	
	
	while(it.hasNext())
	{
		String key = it.next();
		System.out.println(key +"-->"+map.get(key));
	}
	
	
	
		
	}

}
