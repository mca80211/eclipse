package com.java.programs;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	@Test
	public void readDataFromExcel() {
		
		try {
			//Create an object of FileInputStream class to read excel file
			FileInputStream excelfile=new FileInputStream(new File("D:\\Work\\resources\\sample.xlsx"));
			
			//Create Workbook type reference variable
			//Workbook excelworkbook=null;
			
			//create object of XSSFWorkbook class to read xlsx type extension
			Workbook excelworkbook=new XSSFWorkbook(excelfile);
			
			//Read sheet inside the workbook by its name
			Iterator<Sheet> shiterator=excelworkbook.iterator();
			
			while(shiterator.hasNext())
				{
			
					Sheet excelsheet= shiterator.next();
			
					System.out.println("Th  Sheet Name is :::: "+ excelsheet.getSheetName());
					Iterator<Row> iterator = excelsheet.iterator();
			
					while (iterator.hasNext()) {
						Row nextRow = iterator.next();
						Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
						while (cellIterator.hasNext()) {
							Cell cell = cellIterator.next();
	                 
	                        System.out.print(cell.toString());
	                        System.out.print(" - ");
							}
						System.out.println();
						}
				}
			
		    excelworkbook.close();
			}
				catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
		}
		
	}

}
