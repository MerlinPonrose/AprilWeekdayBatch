package com.java.methodoverriding;

public class ClassB extends ClassA{

	public static void main(String[] args) {
	
		
		ClassB b = new ClassB();
		b.display();
		

	}
	
	public int display()
	{
		super.display();
	
		System.out.println("child");
		
		int num = 10;
		return num;
	}

}
