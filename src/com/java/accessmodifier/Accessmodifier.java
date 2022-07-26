package com.java.accessmodifier;

import com.java.datatype.VariableType;

public class Accessmodifier extends VariableType{

	public static void main(String[] args) {
		
		publicMethod();
		privateMethod();
		defaultMethod();
		protectedMethod();
		
		System.out.println(name);
		
	
		
	
	}
	
	
	
	public static void publicMethod()
	{
		System.out.println("Public method");
	}
	
	
	private static void privateMethod()
	{
		System.out.println("Private method");
	}
	
	static void defaultMethod()
	{
		System.out.println("Default method");
	}
	
	protected static void protectedMethod()
	{
		System.out.println("Protected method");
	}
	

}
