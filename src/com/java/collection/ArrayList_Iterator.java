package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list1 = new ArrayList<>();
		
		list1.add("helo");
		list1.add('o');
		list1.add(90.8);
		list1.add(9);
		list1.add("@");
		list1.add("_");
		
		//list1.add(true);
		
		Iterator it = list1.iterator();
		
		while(it.hasNext())
		{
			Object a = it.next();
			System.out.println(a);
		}
		
		
		

ArrayList<Character> charlist = new ArrayList<>();

charlist.add('r');
charlist.add('u');
		

Iterator<Character> it1 = charlist.iterator();

while(it1.hasNext())
{
char b =	it1.next();
System.out.println(b);

}



		}

}
