package com.java.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object a[][] = new Object[4][4];
		
		a[0][0] ="Name";
		a[0][1] ="Age";
		a[0][2]="Address";
		a[0][3] ="Phonenumber";
		
		a[1][0]="xxx";
		a[1][1]=13;
		a[1][2]= "Perungudi";
		
		
		a[2][0]="yyy";
		a[2][1]=17;
		a[2][2]= "Sholinganalur";
		
		a[3][0]="zzz";
		a[3][1]=35;
		a[3][2]= "T.Nagar";

		
	
		
		System.out.println(a[2][0]);
		
		System.out.println(a[3][2]);
		
		//row count
		
		System.out.println("row count="+a.length);
		
		int rowcount = a.length;
		
		//col count
		System.out.println("col count of 0th row="+a[0].length);
		
		int colcount = a[0].length;
	
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
