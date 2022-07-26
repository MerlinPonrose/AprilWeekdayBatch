package com.java.conditionalstatement;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =10;
		
		if(num>10)
		{
			System.out.println("Num greater than 10");
		}
		
		
		System.out.println("nxt line");
		
		
		String a = "Helo";
		
		if(a.equals("Helo"))
		{
			System.out.println("Both the values are equal");
		}
		
		
		String b = "Order1234 ";
		
		
		if(b.startsWith("Order"))
		{
			System.out.println("Value starts with order");
		}
		
		
		if(b.isEmpty())
		{
			System.out.println("value is empty");
		}
	}

}
