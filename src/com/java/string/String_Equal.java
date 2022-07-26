package com.java.string;

public class String_Equal {
	
	
	static String c;
	static String d;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Vcentry"; //String literals
		
		String name1 = "vcenTry";
		
		String name2 = new String("Vcentry"); //String objects
		
		
		int a = 10;
		int b =9;
		
		
	//	System.out.println(a==b);
		/*
		System.out.println(name==name1); --> invalid
		
		System.out.println(name==name2); */ 

		
		
	boolean a1 =	name.equals(name2);
	
	System.out.println(a1);
		
	System.out.println(name.equals(name2));
	
	System.out.println(name.equals(name1));
	
	
	System.out.println("**********");
	
	System.out.println(name.equalsIgnoreCase(name1));
	
	
	System.out.println(c.equals(d));
		
	}

}
