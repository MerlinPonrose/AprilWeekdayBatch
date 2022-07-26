package com.java.string;

public class String_Replace {

	
	static String c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "Java program";
		
		String b = "FGYJ1245abui!@hj^%$23h";
		
		
		String d = "";
		
		System.out.println(a.replace('a', 't'));
		
		
		System.out.println(b.replaceAll("[0-9]", "")); // removes number and print only character and special character

		
		
		System.out.println(b.replaceAll("[0-9]", "0"));
		
		System.out.println(b.replaceAll("[0-9-a-z-A-Z]", ""));
		
		System.out.println(b.replaceAll("[a-z-A-Z]", ""));
		
		System.out.println(b.replaceAll("[^0-9]", "")); //print only number
		
		
		System.out.println(b.replaceAll("[^A-Z]", ""));
		
		
	System.out.println(a.isEmpty()); 
		 
		System.out.println(d.isEmpty()); // if length is 0 , then it will return true
		
		
	}

}
