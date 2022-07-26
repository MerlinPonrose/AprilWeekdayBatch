package com.java.accessmodifier;

public class AccessModifierTest extends Accessmodifier{

	public static void main(String[] args) {
		
		Accessmodifier obj = new Accessmodifier();
		obj.publicMethod();
		
		
		Accessmodifier obj1 = new Accessmodifier();
		
		Accessmodifier obj3 = new Accessmodifier();
		
	//	obj.defaultMethod();
		protectedMethod();
		
//		obj.protectedMethod();
	//	defaultMethod();
		
	}

}
