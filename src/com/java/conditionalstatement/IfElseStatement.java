package com.java.conditionalstatement;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int num =10;
		
		if(num!=10)
		{
			System.out.println("Num greater than 10");
		}
		
		else
		{
			System.out.println("num not equal to 10");
		}
		
		
		System.out.println("nxt line");
		
		
		String a = "Helo";
		
		if(a.equals("helo"))
		{
			System.out.println("Both the values are equal");
		}
		
		
		else
		{
			System.out.println("Both the values are not equal");
		}
		
		
		String b = "Order1234 ";
		
		
		if(b.startsWith("Order"))
		{
			System.out.println("Value starts with order");
		}
		else
		{
			System.out.println("value is not started with order");
		}
		
		
		if(b.isEmpty())
		{
			System.out.println("value is empty");
		}
		
		else
		{
			System.out.println("value is not empty");
		}

	}

}
