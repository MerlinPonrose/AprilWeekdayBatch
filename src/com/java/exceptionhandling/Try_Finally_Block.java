package com.java.exceptionhandling;

import java.util.ArrayList;

public class Try_Finally_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			ArrayList a = new ArrayList<>();
			
			a.add("heloo");
			
			
			System.out.println(a.get(1));
			
			
			
		//	System.out.println(2/0);
		}
		
		
		catch(Exception e)
		{
			System.out.println("inside catch");
		}
		
		finally
		{

			System.out.println("important code");
		}
	
	}

}
