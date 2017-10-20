package com.baseClasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {

    
	@Test
    public void readExcel() throws Exception{

    //Create a object of File class to open xlsx file
    	String filePath="D:\\NewFWUpadtedJuly12th\\New Framework_12July_Updated\\Resources\\TestData.xlsx";
    File file =    new File(filePath);
    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);
    XSSFWorkbook w = new XSSFWorkbook(inputStream);    
    int sheets = w.getNumberOfSheets();
    System.out.println(sheets);
    
   
    String str=w.getSheetName(1);
    System.out.println(str);
    //Read sheet inside the workbook by its name
   // int sheets = w.getNumberOfSheets();
  //  System.out.println("sheets "+sheets);
 //   int names=w.getNumberOfNames();
 //   System.out.println("names "+names);
    //Find number of rows in excel file
  //  int rowCount = s.getLastRowNum()-s.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it
/*   
    for (int i = 1; i < rowCount+1; i++) {

        Row row = s.getRow(0);
        Row r=s.getRow(i);
       if(row.getCell(1).getStringCellValue().equalsIgnoreCase("Execute"))
        {
        	System.out.println(r.getCell(1).getStringCellValue());
        }else{
        	System.out.println("Not matching");
        }

        //Create a loop to print cell values in a row
     //   

        for (int j = 0; j < row.getLastCellNum(); j++) {
        	if(row.getCell(j).getStringCellValue().equalsIgnoreCase("Execute")){
            //Print excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
        	}

        }
       // }
        //System.out.println();

    }*/

	
    

    }
}
