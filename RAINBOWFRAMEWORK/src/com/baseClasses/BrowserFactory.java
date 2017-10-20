package com.baseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPTable;
import com.baseClasses.PDFResultReport;

public class BrowserFactory {
	
	//public  static String currentBrow=null;
	
	public  static Font bfBold11;
	public static PdfPTable table = null;

	 public WebDriver openBrowser(String browserName) {
	        WebDriver driver = null;
	        if (browserName.toLowerCase().contains("firefox")) {
	        	//currentBrow="Firefox";
	            driver = new FirefoxDriver();
	            return driver;
	        }
	        else if (browserName.toLowerCase().contains("internet")) {
	        	//currentBrow="Internet";
	        	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
	            driver = new InternetExplorerDriver();

	            return driver;
	        }
	        else if (browserName.toLowerCase().contains("chrome")) {
	        	//currentBrow="Chrome";
	        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
	            driver = new ChromeDriver();	
		        driver.manage().window().maximize();
		       // driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	            return driver;
	        }

	        return driver;
	    }
	}
