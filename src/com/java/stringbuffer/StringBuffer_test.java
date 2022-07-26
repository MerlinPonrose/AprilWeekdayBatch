package com.java.stringbuffer;

public class StringBuffer_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer obj = new StringBuffer("Helloo");
		
		obj.append("Hiii");
		
		obj.append("test");
		
		System.out.println(obj);
		
		
		String b = new String("Heloo");

		System.out.println(b.concat("Hiii"));
	//	b.concat("Hiii");
		
		System.out.println(b);
		
		
		StringBuilder build = new StringBuilder("Helo");
		build.append("Hiii");
		
		System.out.println(build);
		

	}

}
