package com.java.constructortest;

public class TestBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestBlock obj = new TestBlock();
				
test();
	}

	
	public TestBlock()
	{
		System.out.println("constructor");
	}
	
	
	
	public static void test()
	{
		System.out.println("inside method");
	}
	
//static block	
	static
	{
		System.out.println("In static block");
	}
	
//normal block	
	{
		System.out.println("normal block");
	}
	
	
}
