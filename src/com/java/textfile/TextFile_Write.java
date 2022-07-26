package com.java.textfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile_Write {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\textfileWri.txt");
		
		System.out.println(f.exists()); // to check whether the file is available in the path or not
		
		System.out.println(!f.exists());
		
		
		
		if(!f.exists())
		{
			f.createNewFile(); // create new file
		}
		
		
		FileWriter fw = new FileWriter(f,true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Vcentry1");
		bw.newLine();
		bw.write("Vcentry2");
		bw.newLine();
		bw.write("Vcentry3");
		bw.newLine();
		bw.write("Vcentry4");
		bw.newLine();
		
		bw.close();
		fw.close();
		
	}

}
