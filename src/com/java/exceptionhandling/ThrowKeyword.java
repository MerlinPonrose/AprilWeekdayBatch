package com.java.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		int  num =10;
		
		/*if(num!=100)
		{
			throw new Exception();
		}
		*/
		int age =17;
		
	if(age<18)
	{
		throw new Exception("Age is invalid");
	}

	}

}
