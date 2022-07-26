package com.java.returntype;

public class ReturnType_void {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(add());	
		
	System.out.println(sub());
	
	int d = add()*sub();
	
	System.out.println(d);
	
	
	add1(100, 5);
	company("xxx",100);

	}
	
	
	public static void add1(int a,int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	
	public static void company(String a,int num)
	{
		System.out.println(a);
		System.out.println(num);
	}
	
	
	public static void sub1()
	{
		int a = 10;
		int b = 5;
		int c = a-b;
		System.out.println(c);
	}
	
	
	public static int add()
	{
		
		int a = 10;
		int b = 5;
		int c= a+b;
		return c;
	}
	
	
public static int sub()
{

	int a = 10;
	int b = 5;
	int c = a-b;
	return c;
}
}
