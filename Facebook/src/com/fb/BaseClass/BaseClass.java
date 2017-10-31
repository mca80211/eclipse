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
	
	@Test
	public void click() throws Exception{
		
		 Assert.assertEquals(1, 1);
		 Xl.generateReport("TestResults.xlsx");
	}

}
