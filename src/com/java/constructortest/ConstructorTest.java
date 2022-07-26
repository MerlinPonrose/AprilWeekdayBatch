package com.java.constructortest;

public class ConstructorTest {

	
	public static int i;
	public static int j;
	
	public ConstructorTest()
	{
		System.out.println("in constructor");
		
	//	i=10;
	}
	
	
	public ConstructorTest(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
//	ConstructorTest obj = new ConstructorTest();
	
	ConstructorTest obj1 = new ConstructorTest(100, 200);
	
	System.out.println(i);
	System.out.println(j);
	

	}

}
