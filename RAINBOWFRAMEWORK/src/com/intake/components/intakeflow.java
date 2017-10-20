
package com.intake.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseClasses.BaseClass;
import com.baseClasses.PDFResultReport;
import com.intake.objectrepo.intakeLocators;

public class intakeflow extends BaseClass {

	WebDriver driver;
	public intakeLocators intake = new intakeLocators(driver);
	public PDFResultReport pdfResultReport = new PDFResultReport();

	public intakeflow(PDFResultReport pdfresultReport) {
		this.pdfResultReport = pdfresultReport;
	}

	public void openURL() throws Exception {
		try {

			waitForObj(3000);
			launchapp(pdfResultReport.testDataValue.get("AppURL"));
			log.info("Execution Started......................");
			log.info("Opened the URL::::::::::::" + pdfResultReport.testDataValue.get("AppURL"));
			pdfResultReport.addStepDetails("Open the URL", "Application should open the url",
					"Successfully opened the URL" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to open the URL" + e.getMessage());
			pdfResultReport.addStepDetails("openURL method ", "Application should open the url",
					"Unable to open the URL" + e.getMessage(), "Fail", "Y");
		}
	}

	public void login() throws Exception {

		try {

			waitForObj(3000);
			set(intake.username, pdfResultReport.testDataValue.get("username"));
			log.info("entered username");
			
			set(intake.password, pdfResultReport.testDataValue.get("password"));
			log.info("entered password");

			click(intake.login);
			log.info("clicked on login..........");
			pdfResultReport.addStepDetails("login to application", "User should login to application",
					"Successfully logged into application" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("logged into application" + e.getMessage());
			pdfResultReport.addStepDetails("login to application ", "User should login to application",
					"User is Unable to login" + e.getMessage(), "Fail", "Y");
		}
	}

	public void SourceConfig() throws Exception {
		try {
			waitForObj(9000);
			// click configuration
			click(intake.configuration);
			log.info("clicked on the configuration button....");
			waitForObj(6000);
			// click source configuration
			click(intake.sourceconf);
			log.info("clicked on Source configuration..........");
			waitForObj(4000);
			// click browse button
			click(intake.browsebutton);
			log.info("clicked on Source browsebutton..........");
			waitForObj(3000);
			
			// upload a file
			RobotKeys rw = new RobotKeys();
			rw.type(System.getProperty("user.dir") + "\\Resources\\1500.png");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			waitForObj(3000);

			// click upload button
			click(intake.uploadfile);
			log.info("Clicked on Upload for uploading a file..... ");
			waitForObj(30000);

			pdfResultReport.addStepDetails("click on source configuration for uploading a file",
					"User should be click on source configuration",
					"Successfully uploaded a file in source configuration" + " ", "Pass", "Y");

		} catch (Exception e) {
			log.fatal("click on source configuration" + e.getMessage());
			pdfResultReport.addStepDetails("click on source configuration for uploading a file",
					"User should be click on source configuration",
					"User is Unable to uploaded a file in source configuration" + e.getMessage(), "Fail", "Y");
		}
	}

	public void Checkstatus() throws Exception {

		try {
			waitForObj(10000);
			// click pipeline
			click(intake.pipeline);
			log.info("click on pipeline configuration....");
			waitForObj(50000);
			
			//refresh the page
			for(int i=0;i<15;i++)
			{
				//refresh
				//driver.executeScript("history.go(0)");
				waitForObj(6000);
				Robot refresh=new Robot();
				refresh.keyPress(KeyEvent.VK_F5);
				refresh.delay(40);
				refresh.setAutoDelay(100);
				refresh.keyRelease(KeyEvent.VK_F5);
				refresh.setAutoDelay(100);
				refresh.delay(60);
				waitForObj(6000);
			}
			
			// click processing dash board
			click(intake.processingdashboard);
			log.info("Clicked on Processing DashBoard status......");
			waitForObj(40000);
			
			// click configuration
			click(intake.configuration);
			log.info("clicked on the configuration button....");
			waitForObj(6000);

			// click pipeline
			click(intake.pipeline);
			log.info("click on pipeline configuration....");
			waitForObj(70000);
			
			//refresh the page
			for(int i=0;i<15;i++)
			{
				waitForObj(6000);
				Robot refresh=new Robot();
				refresh.keyPress(KeyEvent.VK_F5);
				refresh.delay(40);
				refresh.keyRelease(KeyEvent.VK_F5);
				refresh.delay(60);
				
			}
			
			waitForObj(6000);
			// click processing dash board
			click(intake.processingdashboard);
			log.info("Clicked on Processing DashBoard status......");
			waitForObj(20000);

			pdfResultReport.addStepDetails("check the file status", "User should be check the file status",
					"Successfully check the file status" + " ", "Pass", "Y");

		} catch (Exception e) {
			log.fatal("click on source configuration" + e.getMessage());
			pdfResultReport.addStepDetails("check the file status", "User should be check the file status",
					"User is Unable to check the file status" + e.getMessage(), "Fail", "Y");
		}
	}

	public void ProcessingDashboard() throws Exception {

		try {
			/*waitForObj(6000);
			// click processing dash board
			click(intake.processingdashboard);
			log.info("click on the processingdashboard...");*/
			waitForObj(10000);
		//select days
			Robot scroll=new Robot();
			
			select(intake.selectdays,"Today");
			log.info("select Today ");
			waitForObj(3000);
			
			/*Select dropdown = new Select((WebElement) intake.selectdays);
			dropdown.selectByVisibleText("Today");*/

			select(intake.selectdays, "Past 7 Days");
			log.info("select past 7 days ");
			waitForObj(3000);

			select(intake.selectdays, "Past 15 Days");
			log.info("select past 15 days ");
			waitForObj(3000);

			select(intake.selectdays, "Past 30 Days");
			log.info("select past 30 days ");
			waitForObj(4000);

			
			/*Select dropdown1 = new Select((WebElement) intake.selectdays);
			dropdown.selectByIndex(2);*/
			
			//click file
			click(intake.prossfileview);
			log.info("Clicked on File, Which recently is uploaded.....");
			waitForObj(7000);

			
			//
			//WebElement s=click(intake.data,pdfResultReport.testDataValue.getText());
			
			/*By data = null;
			String ss=text(data);
			System.out.println("*******************************"+ss);*/
			
			
			
			
			
			
			//scroll down
			
			for (int i=1;i<=300;i++) 
			{
				scroll.keyPress(KeyEvent.VK_DOWN);
				scroll.setAutoDelay(40);
				scroll.keyRelease(KeyEvent.VK_DOWN);
				scroll.setAutoDelay(30);
			}
			waitForObj(1000);
			for(int i=1;i<=300;i++)
			{
				scroll.keyPress(KeyEvent.VK_UP);
				scroll.setAutoDelay(40);
				scroll.keyRelease(KeyEvent.VK_UP);
				scroll.setAutoDelay(30);
			}
			waitForObj(2000);
			//click preview button
			click(intake.previewbutton);
			log.info("Clicked on the preview button it takes us in to form page.....");
			
			
			
			
			waitForObj(9000);
			//click back button
			click(intake.backbutton);
			log.info("clicked on back button it takes us in to process status page.....");

			pdfResultReport.addStepDetails("Clicked on the Processing Dashboard for reviewing the file",
					"User should be click on filename", "Successfully clicked on process status" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("click on ProcessingDashboard " + e.getMessage());
			pdfResultReport.addStepDetails("Clicked on the Processing Dashboard for reviewing the file",
					"User should be click on filename", "User is Unable to Clicked on processDashboard" + e.getMessage(),
					"Fail", "Y");
		}
	}

	public void DocumentReview() throws Exception {

		try {

			waitForObj(8000);
			//click document review button
			click(intake.docreview);
			log.info("Clicked on doc review....");

			waitForObj(5000);
			//click first file
			click(intake.docfilereview);
			log.info("clicked on the file in doc review....");

			waitForObj(20000);
			//click confidence score
			click(intake.confidencescore);
			log.info("select confidence score...");
			waitForObj(2000);
			
			// confidence score
			Robot action = new Robot();
			
			action.keyPress(KeyEvent.VK_HOME);
			action.keyRelease(KeyEvent.VK_HOME);
			action.delay(20);
			
			for(int i=0;i<=5;i++)
			{
				action.keyPress(KeyEvent.VK_PAGE_UP);
				action.keyRelease(KeyEvent.VK_PAGE_UP);
				action.setAutoDelay(200);
			}
			 action.keyPress(KeyEvent.VK_TAB);
			 action.keyRelease(KeyEvent.VK_TAB);
			 action.delay(20);
			
			 //scrolling page bottom 
			 /*for(int i=0;i<30;i++)
			 {
				 action.keyPress(KeyEvent.VK_PAGE_DOWN);
				 action.delay(150);
				 action.keyRelease(KeyEvent.VK_PAGE_DOWN);
				 action.delay(150);
			 }*/
			 // Edit all fields  *****************************************
			for (int i=1;i<=5;i++) 
			{
				action.keyPress(KeyEvent.VK_TAB);
				action.keyRelease(KeyEvent.VK_TAB);
				action.delay(20);
				
				action.keyPress(KeyEvent.VK_TAB);
				action.keyRelease(KeyEvent.VK_TAB);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
				action.delay(20);
				
				action.keyPress(KeyEvent.VK_ENTER);
				action.keyRelease(KeyEvent.VK_ENTER);
				action.delay(50);

				action.keyPress(KeyEvent.VK_TAB);
				action.keyRelease(KeyEvent.VK_TAB);
				action.delay(150);
				
				action.keyPress(KeyEvent.VK_ENTER);																																																																																																																											
				action.keyRelease(KeyEvent.VK_ENTER);
				action.delay(40);
			}
			
			for (int i = 1; i <= 200; i++) {
				action.keyPress(KeyEvent.VK_DOWN);
				action.setAutoDelay(100);
				action.keyRelease(KeyEvent.VK_DOWN);
				action.setAutoDelay(100);
			}
			// click all fields
			
			 /*for(int j=1;j<=115;j++) 
			 { 	
				action.keyPress(KeyEvent.VK_TAB);
				action.keyRelease(KeyEvent.VK_TAB);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
				action.delay(20);
					
				action.keyPress(KeyEvent.VK_ENTER);
				action.keyRelease(KeyEvent.VK_ENTER);
				action.delay(20);
					
				click(intake.field); 
				action.delay(150);
				
				action.keyPress(KeyEvent.VK_TAB);
				action.keyRelease(KeyEvent.VK_TAB);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
				//action.delay(20);
					
				action.keyPress(KeyEvent.VK_ENTER);
				action.keyRelease(KeyEvent.VK_ENTER);
				//action.delay(20);
			 }*/
			 
			 /*click(intake.buildingprovider); 
			 log.info("scroll down ");*/
			 
			//click complete review button
			click(intake.completereview);
			log.info("clicked on the complete review....");

			waitForObj(1000);
			//click conform complete review button
			click(intake.confirm);
			log.info("clicked on the confirm action...");

			pdfResultReport.addStepDetails("Clicked on the Doc Review for reviewing the file",
					"User should be click on filename", "Successfully clicked on process status" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("click on DocumentReview" + e.getMessage());
			pdfResultReport.addStepDetails("Clicked on the Process status for reviewing the file",
					"User should be click on filename", "User is Unable to Clicked on process status" + e.getMessage(),
					"Fail", "Y");
		}
	}

	public void logout() throws Exception {

		try {

			waitForObj(5000);
			//click logout button
			click(intake.logout);
			log.info("clicked on the logout button...");

			pdfResultReport.addStepDetails("logout the application", "User should logout the application",
					"Successfully logout the application" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("log out application" + e.getMessage());
			pdfResultReport.addStepDetails("logout the application ", "User should be logout the application",
					"User is Unable to logout" + e.getMessage(), "Fail", "Y");
		}
	}
}