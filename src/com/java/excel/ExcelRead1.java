package com.java.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2 Weekday Java\\src\\reosurce\\Excel_Test.xlsx");
		
		
		FileInputStream fis = new FileInputStream(f);
		

		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		
		//Number of rows --> rowcount based on index
		
	int rowcount = 	sheet.getLastRowNum();
	System.out.println("rowcount="+rowcount);

	//Number of column --> not based on index
int colcount = 	sheet.getRow(0).getLastCellNum();
System.out.println("col count"+colcount);


for(int i=0;i<=rowcount;i++)
{
	for(int j=0;j<=colcount-1;j++)
	{
	//	sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);	
	if(sheet.getRow(i).getCell(j)!=null)
	{
		
		if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
		{
		
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
			
			
		}
		
		else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC && (sheet.getRow(i).getCell(j))!=null)
		{
			int data = (int) sheet.getRow(i).getCell(j).getNumericCellValue();
			System.out.print(data+"  ");
		}
	}
	}
	
	
		
	}
	System.out.println("");
	}

}
