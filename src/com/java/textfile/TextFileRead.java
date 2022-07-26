package com.java.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\Test.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String data = "";
	
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		
		
	}

}
