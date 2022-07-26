package com.java.loop;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "Vcentry technologies";
		
		String reverse = "";
int len = a.length();

for(int i=len-1;i>=0;i--)
	
{
	reverse = reverse+	a.charAt(i);
}

System.out.println(reverse);

	}

}
