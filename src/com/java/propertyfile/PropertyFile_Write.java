package com.java.propertyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Write {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\WriteProperty.properties");
		
		Properties prop = new Properties();
		
		prop.setProperty("Institutename", "Vcentry");
		prop.setProperty("Address", "Guindy");
		prop.setProperty("Phonenumber", "123456");
		prop.setProperty("Email", "abc@gmail.com");
		
		
		prop.store(new FileOutputStream(f), "Institue Information");

	}

}
