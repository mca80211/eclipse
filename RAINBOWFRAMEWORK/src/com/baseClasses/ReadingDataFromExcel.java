package com.baseClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
	public static Map<String, String> testReport = new HashMap();
	public static Map<String, String> testData = new HashMap();
	
	public static void readTestReport(String filePath,String paramString) throws Exception{
		try{
			FileInputStream testRunReport = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(testRunReport);
			XSSFSheet worksheet = workbook.getSheet(paramString);
			int totalrows = worksheet.getLastRowNum()-worksheet.getFirstRowNum();
			int j=0;
			List<String> arrayOfString = new ArrayList<>();;
			for(int i=12;i<=totalrows;i++){
				Row Headertrow = worksheet.getRow(11);
				Row currentrowww = worksheet.getRow(i);
				int columns=currentrowww.getLastCellNum();
				System.out.println(" columns :"+columns);
				for (int k = 0; k < columns; k++) {					
			
				if(currentrowww !=null){
					Cell cellkey = Headertrow.getCell(k);
					System.out.println("cellkey "+cellkey);					
					Cell cellValue = currentrowww.getCell(k);
					System.out.println("cellValue "+cellValue);
					System.out.println("-----------------------------");
					if(cellkey.toString() != ""){
						if(!arrayOfString.contains(cellkey.toString())){
							arrayOfString.add(cellkey.toString());
							testData.put(cellkey.toString(), cellValue.toString());
						}/*else{
							System.out.println("Duplicate Key In Test Data File : "+cellkey.toString());
							throw new AutomationException("Duplicate Key In Test Data File : "+cellkey.toString());
					}*/
				}else{
					System.out.println("Row is empty in Test Data file : "+(i+1));
					}
				}
			}
			}
		}catch (IOException localIOException){
	    	System.out.println("Unable to read test data file : " + paramString);
	    }
	    catch (Exception localAutomationException){
	      throw localAutomationException;
	    }
	  
	}
	public static void readTestDataFile(String filePath,String paramString) throws Exception{
		try{
			FileInputStream testRunReport = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(testRunReport);
			XSSFSheet worksheet = workbook.getSheet(paramString);
			int totalrows = worksheet.getLastRowNum()-worksheet.getFirstRowNum();
			int j=0;
			List<String> arrayOfString = new ArrayList<>();;
			for(int i=0;i<=totalrows;i++){
				Row currentrow = worksheet.getRow(i);
				System.out.println(currentrow.getLastCellNum());
				for (int k = 0; k < currentrow.getLastCellNum(); k++) {
					//System.out.println(currentrow.getCell(k).getStringCellValue());
					arrayOfString.add(currentrow.getCell(k).getStringCellValue());
				}
			}
			
			for (int i = 0; i < arrayOfString.size(); i++) {
			
					System.out.print(arrayOfString.get(i));
				
				
			}
		}catch (IOException localIOException){
	    	System.out.println("Unable to read test data file : " + paramString);
	    }
	    catch (Exception localAutomationException){
	      throw localAutomationException;
	    }
	  }
  @Test
  public void f() throws Exception {
	  readTestReport("D:\\Nagesh\\Sample\\Framework_New\\Resources\\TestData.xlsx","data3");
  }
}













