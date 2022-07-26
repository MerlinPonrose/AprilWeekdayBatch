package com.java.exceptionhandling;

import java.util.ArrayList;

public class TryCatch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			ArrayList a = new ArrayList<>();
			
			a.add("heloo");
			
			
			System.out.println(a.get(1));
			
			System.out.println(2/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(3/6);
		}
		
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("index is incorrect");
		}
		
		catch(Exception e)
		{
			System.out.println("exception occured");
		}

	}

}
