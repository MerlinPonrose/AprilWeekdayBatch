package com.java.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertyFile_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\config.properties");
		
		FileInputStream fis = new FileInputStream(f);
	
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("URL"));
		
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		
		System.out.println(prop.keySet());
		
		System.out.println(prop.values());
		
		
Set keys =		prop.keySet();

Iterator it = keys.iterator();

while(it.hasNext())
{
Object key = 	it.next();

System.out.println(key+"="+prop.getProperty((String) key));
}
		
		
	}

}
