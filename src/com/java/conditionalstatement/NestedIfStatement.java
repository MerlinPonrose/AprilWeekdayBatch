package com.java.conditionalstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int wt = 45;
		int age = 18;
		
		
		
		if(age>=18)
		{
			System.out.println("eligible");
			if(wt>=50)
			{
				System.out.println("eligible to donate");
			}
			else
			{
				System.out.println("in correct weight");
			}
			
		}
		
		
		else
		{
			System.out.println("not eligible to donate");
		}

	}

}
