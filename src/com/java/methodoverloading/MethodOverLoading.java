package com.java.methodoverloading;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading overload = new MethodOverLoading();
				
		
	}
	
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public  void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public  void add(double a, double b)

	{
		System.out.println(a+b);
	}
	
	public  void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public double add(int a, double b, double c)
	{
		double d= a+b+c;
		
		return d;
	}
}
