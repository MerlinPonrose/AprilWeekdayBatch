package com.java.collection;

import java.util.ArrayList;

public class ArrayList_IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list = new ArrayList<>(); // creation of array list
		
//	list.add(30);
		
		System.out.println(list.isEmpty()); //it will return true if list is empty,	it will return false if list has values
	
		
		if(list.isEmpty())
		{
			list.add(60);
			list.add(70);
			System.out.println(list);
		}
		else
		{
			System.out.println("list is not empty");
		}

	}

}
