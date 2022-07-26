package com.java.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\Excel_Test.xlsx");
		
		
		FileInputStream fis = new FileInputStream(f);
		

		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		
		//Number of rows --> rowcount based on index
		
	int rowcount = 	sheet.getLastRowNum();
	System.out.println(rowcount);

	//Number of column --> not based on index
int colcount = 	sheet.getRow(0).getLastCellNum();
System.out.println(colcount);


String data = sheet.getRow(1).getCell(0).getStringCellValue();

int data1 = (int) sheet.getRow(1).getCell(1).getNumericCellValue();

System.out.println(data);

System.out.println(data1);


	
	}

}
