package com.java.array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num[] = new int[10];
		

		num[0] = 10;
		num[1] = 20;
		num[2] =30;
		num[3]=40;
		num[4]=50;
		
		
	int len =	num.length;
	
	System.out.println("count="+len);
		
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}

		
		
	}

}
