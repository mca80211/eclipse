package com.fb.objrepositors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLocators {
	
	WebDriver	driver;

	public FbLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	//Facebook User Timeline Scenarios
	public By username=By.xpath("//*[@id='email']"); 
	public By password=By.xpath("//*[@id='pass']");
	public By login=By.xpath("//*[@id='u_0_3']");
	
	

}
