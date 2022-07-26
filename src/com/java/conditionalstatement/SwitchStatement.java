package com.java.conditionalstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fruits= "grape";
		
		switch(fruits)
		{
		case "Banana":
			System.out.println("banana");
			break;
			
		case "Apple":
			System.out.println("apple");
			break;
			
		case "mango":
			System.out.println("mango");
			break;
			
			default:
				System.out.println("invalid fruit");
			
		}
		
		
		String arithmetic_Operation = "sub";
		
		switch(arithmetic_Operation)
		{
		case "add":
			int a=10;
			int b=8;
			System.out.println(a+b);
			break;
		case "sub":
			int a1=10;
			int b1=8;
			System.out.println(a1-b1);
			break;
	
		case "mul":
			int a11=10;
			int b11=8;
			System.out.println(a11*b11);
			break;
			
		case "div":
			int a111=10;
			int b111=8;
			System.out.println(a111/b111);
			break;
		default:
			System.out.println("invalid operation");
		
		}

	}

}
