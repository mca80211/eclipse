package com.baseClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.internal.IInvoker;

public class Listener implements IInvokedMethodListener{
	
	public  static List<String> browsername = new ArrayList();
	
	BrowserFactory browserfactory = new BrowserFactory();
	  @Override
	    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		 
	        if (method.isTestMethod()) {
	            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
	            browsername.add(browserName);
	            WebDriver driver = browserfactory.openBrowser(browserName);
	            ThreadLocalWebdriver.setWebDriver(driver);
	        }
	    }
	 
	    @Override
	    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	        if (method.isTestMethod()) {
	            WebDriver driver = ThreadLocalWebdriver.getDriver();
	            if (driver != null) {
	                //driver.quit();
	            }
	        }
	    }


}
