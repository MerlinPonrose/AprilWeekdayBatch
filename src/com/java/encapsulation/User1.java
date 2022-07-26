package com.java.encapsulation;

import javax.swing.GroupLayout.SequentialGroup;

public class User1 extends StudentInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentInfo info = new StudentInfo();
		
	System.out.println(info.getCollName());
	
	info.setAge(13);
	
	System.out.println(info.getAge());

	
	}

}
