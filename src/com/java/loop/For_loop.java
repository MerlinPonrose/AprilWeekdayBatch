package com.java.loop;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Vcentry");
		}
		
		
		
		for(int i=0;i<=10;i=i+1)
		{
			System.out.println(i);
		}
		
		System.out.println("***********");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("***********");
		
		for(int i=1;i<=50;i=i+5)
		{
			System.out.println(i);
		}
		
		
		int num = 10;
		
		int fact = 1;
		
		for(int i=num;i>=1;i--)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}

}
