package com.java.interfacetest;

public class ICICI implements RBI_Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RBI_Bank.test();
		
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit using mobile banking");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

}
