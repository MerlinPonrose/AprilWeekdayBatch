package com.java.interfacetest;

public class HDFC implements RBI_Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RBI_Bank.test(); // calling static method from interface --> interfaceName.methodName()
		
		HDFC hdfc = new HDFC();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.loan();
	}


	@Override
	public void deposit() {
		
		System.out.println("Using net banking");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw using netbanking");
		
	}

	@Override
	public void loan() {
	System.out.println("Loan using netbanking");
		
	}


	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}


}
