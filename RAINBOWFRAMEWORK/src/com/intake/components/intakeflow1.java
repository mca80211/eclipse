package com.intake.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;

public class intakeflow1 extends intakeflow {

	public intakeflow1(PDFResultReport pdfresultReport) {
		super(pdfresultReport);
	}
	
	public void Entities() throws Exception {
		try {
			waitForObj(20000);
			// click configuration
			click(intake.configuration);
			log.info("clicked on the configuration button....");
			waitForObj(6000);

			// click Entities
			click(intake.entites);
			log.info("click on the Entities ");
			waitForObj(4000);

			// click Add Entities
			/*click(intake.addentity);
			log.info("click addEntity");
			waitForObj(1000);

			// Enter entity name
			set(intake.entityname,pdfResultReport.testDataValue.get("Entity Name"));
			log.info("entered my office");
			waitForObj(1000);

			// Enter attributename1
			set(intake.attributename1,pdfResultReport.testDataValue.get("Attribute Name1"));
			log.info("entered Environment");
			waitForObj(2000);

			// click add attribute
			click(intake.addattribute1);
			log.info("click addAtribute");
			waitForObj(2000);

			// Enter attribute2
			set(intake.attributename2,pdfResultReport.testDataValue.get("Attribute Name2"));
			log.info("entered Employees");
			waitForObj(2000); */

			/*// click add attribute
			click(intake.addattribute2);
			log.info("click addAtribute");
			waitForObj(2000);
						
			// click add attribute
			set(intake.attributename3,"Tables");
			log.info("click Tables");
			waitForObj(2000);*/

			// click save button
			/*click(intake.save1);
			log.info("clicked save button");
			waitForObj(5000); */
			
			//click My office
			
			click(intake.office);
			log.info("click My office");
			waitForObj(2000);
			
			// click edit button
			click(intake.edit11);
			log.info("click edit button");
			waitForObj(1000);
			
			//click Add Attribute
			click(intake.addattribute3);
			log.info("click addAttribute button");
			waitForObj(1000);
			
			//switch window 
			/*getPopupMessage();
			handleConfirmation(TestFullName);
			Thread.sleep(9000);*/
			
			
			
			
			/*System.out.println("title is:" +ThreadLocalWebdriver.getDriver().getTitle());
			waitForObj(5000);

			// click add attribute button
			click(intake.addattribute2);
			log.info("click on add attribute button");
			waitForObj(1000);

			// enter the attribute value
			set(intake.attributename3, "Tables");
			log.info("entered Tables");
			waitForObj(1000);*/

			// click save button
			click(intake.save2);
			log.info("clicked save button");
			waitForObj(1000);

			pdfResultReport.addStepDetails("Clicked on Entities", "User should be click on Entities",
					"Successfully clicked on Entities" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("click on entities" + e.getMessage());
			pdfResultReport.addStepDetails("click on Entites  ", "User should be click Entities",
					"User is Unable to click the Entities" + e.getMessage(), "Fail", "Y");
		}
	}

	public void ResourceLibrary() throws Exception {
		try {
			waitForObj(2000);
			/*// click configuration
			click(intake.configuration);
			log.info("clicked on the configuration button....");
			waitForObj(6000);*/

			// click Resource Library
			click(intake.resourcelibrary);
			log.info("clicked on Resource Library");
			waitForObj(1000);
			
			
			RobotKeys rw = new RobotKeys();
			Robot r = new Robot();
			// select file type corpus**********************
			select(intake.selectrlfile, "Corpus");
			log.info("select corpus file");
			waitForObj(2000);

			// enter name
			set(intake.rlname, "COR");
			log.info("Enter name ");
			waitForObj(1000);

			// click browse button
			click(intake.rlbrowse);
			log.info("clicked browse button");
			waitForObj(3000);

			// upload a file
			rw.type("//home//xpms//Desktop//workspace//Framwork//RAINBOWFRAMEWORK//Resources//Sample.COR");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(70);
			
			waitForObj(2000);
			// click upload button
			click(intake.uploadfile);
			log.info("Clicked on Upload for uploading a file..... ");
			waitForObj(4000);

			/*// click download
			click(intake.rldownload);
			log.info("click download ");
			waitForObj(2000);

			// click enter from the keyboard
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(30);

			// click delete
			click(intake.rldelete);
			log.info("click delete");
			waitForObj(500);

			// click enter from key board
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(50);
			
			r.keyPress(KeyEvent.VK_F5);
			r.keyRelease(KeyEvent.VK_F5);
			r.delay(40);
			waitForObj(2000);*/

			// select file type Dictionary********************
			select(intake.selectrlfile, "Dictionary");
			log.info("select Json file");
			waitForObj(2000);

			// enter name
			set(intake.rlname, "JSON");
			log.info("Enter name ");
			waitForObj(1000);

			// click browse button
			click(intake.rlbrowse);
			log.info("clicked browse button");
			waitForObj(3000);

			// upload a file
			rw.type("//home//xpms//Desktop//workspace//Framwork//RAINBOWFRAMEWORK//Resources//Sample.json");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(70);

			// click upload button
			click(intake.uploadfile);
			log.info("Clicked on Upload for uploading a file..... ");
			waitForObj(4000);

			
			
			// select file type Semantic
			select(intake.selectrlfile, "Semantic");
			log.info("select owl file");
			waitForObj(2000);

			// enter name
			set(intake.rlname, "OWL");
			log.info("Enter name ");
			waitForObj(1000);

			// click browse button
			click(intake.rlbrowse);
			log.info("clicked browse button");
			waitForObj(3000);

			// upload a file
			rw.type("//home//xpms//Desktop//workspace//Framwork//RAINBOWFRAMEWORK//Resources//pizza.owl");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(70);

			// click upload button
			click(intake.uploadfile);
			log.info("Clicked on Upload for uploading a file..... ");
			waitForObj(4000);

			// String
			// text=ThreadLocalWebdriver.getDriver().findElement("username").getText();

			pdfResultReport.addStepDetails("Clicked on ResourceLibrary", "User should be click on ResourceLibrary",
					"Successfully clicked on ResourceLibrary" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("click on entities" + e.getMessage());
			pdfResultReport.addStepDetails("click on ResourceLibrary  ", "User should be click ResourceLibrary",
					"User is Unable to click the ResourceLibrary" + e.getMessage(), "Fail", "Y");
		}
	}

	public void Digitaldocument() throws Exception {
		try {
			System.out.println("::::::::::::::: DD Executing :::::::::");
			waitForObj(20000);
			// click configuration
			click(intake.configuration);
			log.info("clicked on the configuration button....");
			waitForObj(5000);
			
			// click Digital Document*****************************
			click(intake.digitaldocument);
			log.info("clicked on the Digital Document button....");
			waitForObj(5000);
			
			//select Digital Document file
			select(intake.selectddfile, ".doc/.docx");
			log.info("select .doc/.docx type");
			waitForObj(2000);
			
			set(intake.ddname,"Document");
			log.info("Enter Document");
			waitForObj(2000);
			
			click(intake.ddbrowse);
			log.info("click on browse button..");
			waitForObj(2000);
			
			
			RobotKeys rw = new RobotKeys();
			Robot r = new Robot();
			// upload a file
			rw.type(System.getProperty("user.dir") +"\\Resources\\sample1.docx");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(100);
			
			click(intake.ddupload);
			log.info("click on upload button..");
			waitForObj(12000);
			
			
			//select Excel file
			/*select(intake.selectddfile, ".excel");
			log.info("select .excel type");
			waitForObj(2000);
			
			set(intake.ddname,"Excel");
			log.info("Enter Excel");
			waitForObj(2000);
			
			click(intake.ddbrowse);
			log.info("click on browse button..");
			waitForObj(2000);
			
			// upload a file
			rw.type(System.getProperty("user.dir") +"\\Resources\\sample2.xls");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(100);
			
			click(intake.ddupload);
			log.info("click on upload button..");
			waitForObj(8000);
			
			//select csv file
			select(intake.selectddfile, ".csv");
			log.info("select .csv type");
			waitForObj(2000);
			
			set(intake.ddname,"CSV");
			log.info("Enter csv");
			waitForObj(2000);
			
			click(intake.ddbrowse);
			log.info("click on browse button..");
			waitForObj(2000);
			
			// upload a file
			rw.type(System.getProperty("user.dir") +"\\Resources\\sample3.csv");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(100);
			
			click(intake.ddupload);
			log.info("click on upload button..");
			waitForObj(12000);
			
			//select pdf file
			select(intake.selectddfile, ".pdf");
			log.info("select .pdf type");
			waitForObj(2000);
			
			set(intake.ddname,"PDF");
			log.info("Enter pdf");
			waitForObj(2000);
			
			click(intake.ddbrowse);
			log.info("click on browse button..");
			waitForObj(2000);
			
			// upload a file
			rw.type(System.getProperty("user.dir") +"\\Resources\\sample4.pdf");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.delay(100);
			
			click(intake.ddupload);
			log.info("click on upload button..");
			waitForObj(2000); */

			
			
			
			
			pdfResultReport.addStepDetails("Clicked on Digital Document", "User should be click on Digital Document",
					"Successfully clicked on Digital Document" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("click on Digital Document" + e.getMessage());
			pdfResultReport.addStepDetails("click on Digital Document  ", "User should be click Digital Document",
					"User is Unable to click the Digital Document" + e.getMessage(), "Fail", "Y");
		}
		System.out.println("::::::::::::::: DD Executed :::::::::");
	}

}
