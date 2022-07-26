package com.java.inheritance;



//HDFC -> Child class, RBI_Bank --> parent class
public class HDFC extends RBI_Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		HDFC hdfc = new HDFC();
		hdfc.deposit();
	}
	
	
	public  void fixedDeposit()
	{
		System.out.println("fixeed deposid");
	}

}
