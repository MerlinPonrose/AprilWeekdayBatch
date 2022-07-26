package com.java.statictest;

public class Method_Static_NonStatic {

	public static void main(String[] args) {
		test1();
		Method_Static_NonStatic obj = new Method_Static_NonStatic();
		obj.test3();
	}
	
	
	public static void test1()
	{
		System.out.println("test");
	}
	
	public static void test2()
	{
		test1();
	
		System.out.println("test2");
	}

	
	public void test3()
	{
		test1();
		System.out.println("helo");
	}
	
	
	public void test4()
	{
		test3();
		System.out.println("hii");
	}
}
