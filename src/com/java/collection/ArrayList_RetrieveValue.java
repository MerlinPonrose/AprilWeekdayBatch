package com.java.collection;

import java.util.ArrayList;

public class ArrayList_RetrieveValue {

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

		
	System.out.println(list1.get(2)); //retrieve value from list
	
	
/*	for(Object i:list1)
	{
		System.out.println(i);
	}*/
	
int len=	list1.size(); // to find the count of values in list

System.out.println(len);
	

	for(int i=0;i<=len-1;i++)
	{
		System.out.println(list1.get(i));
	}

	
	}

}
