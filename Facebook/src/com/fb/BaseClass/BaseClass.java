package com.fb.BaseClass;

import org.automationtesting.excelreport.Xl;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	
	@BeforeSuite
	public void launchBrowser(){
		
	}
	@AfterSuite
	public void ExcelResults() throws Exception{
		Xl.generateReport("TestResults.xlsx");
	}
	@Test
	public void click(){
		
		 Assert.assertEquals(1, 1);
	}

}
