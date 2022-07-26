package com.java.conditionalstatement;

public class IfEleseIf_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num =7;
	

		
		if(num>10 && num<20 )
		{
			System.out.println("Num is between 10 to 20");
		}
		
		else if(num>20 && num<30)
		{
			System.out.println("num is between 20 and 30 ");
		}
		
		else if(num>30 && num<40)
		{
			System.out.println("num between 30 and 40");
		}
	
		
		else
		{
			System.out.println("invalid number");
		}
		
		
	/*	if(num>10 || num<6)
		{
			System.out.println(num);
		}
		
		else
		{
			System.out.println("invalid number");
		}*/
		

	}

}
