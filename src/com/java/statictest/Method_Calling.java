package com.java.statictest;

public class Method_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Static_NonStatic obj = new Method_Static_NonStatic();
		obj.test4();
		
		Method_Calling obj1 = new Method_Calling();
		obj1.display();
		
		

	}
	
	
	public void display()
	{
		System.out.println("hii everyone");
	}

}
