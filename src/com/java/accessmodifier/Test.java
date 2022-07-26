package com.java.accessmodifier;

import com.java.statictest.Method_Static_NonStatic;

public class Test extends Method_Static_NonStatic{

	public static void main(String[] args) {
	
test1();


Method_Static_NonStatic obj = new Method_Static_NonStatic();
obj.test3();


Test obj1 = new Test();
obj1.display();

	}
	
	
	
	
	public void display()
	{
		System.out.println("heloo");
	}

}
