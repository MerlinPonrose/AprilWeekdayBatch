package com.java.string;

public class String_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Java Program987";
		
		
		System.out.println(name.indexOf('a'));

		System.out.println(name.indexOf('o'));
		
		System.out.println(name.lastIndexOf('a'));
		
		System.out.println(name.indexOf('a', 2));
		
		System.out.println("*******");
		
		
		System.out.println(name.indexOf("Program"));
		
		System.out.println(name.indexOf("gram"));
		
		System.out.println(name.indexOf("va P"));
		
		System.out.println(name.indexOf("987"));
		
	}

}
