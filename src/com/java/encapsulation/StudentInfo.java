package com.java.encapsulation;

public class StudentInfo {
	
	
	private   String collname = "xxx";
	
	private int age;
	//getter setter

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public 	String getCollName()
	{
		return collname;
	}
	
	public void setAge(int newAge)
	{
		if(newAge>=18)
		{
			age= newAge;
		}
		else
		{
			System.out.println("invalid age");
		}
	}
	
	
	public int getAge()
	{
		return age;
	}

}
