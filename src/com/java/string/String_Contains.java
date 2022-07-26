package com.java.string;

public class String_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hi helo how are you ?";
		
String b = "helo";

String c = "Order1234";


System.out.println(a.contains(b));

System.out.println(a.contains("are"));

System.out.println("******");

System.out.println(c.startsWith("order"));

System.out.println(c.startsWith("1234"));

System.out.println(c.contains("1234"));


System.out.println("*******");

System.out.println(c.endsWith("34"));

System.out.println(c.endsWith("12"));

	}

}
