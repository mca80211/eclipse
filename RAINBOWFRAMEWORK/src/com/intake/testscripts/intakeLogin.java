package com.intake.testscripts;

	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import com.baseClasses.BaseClass;
    import com.intake.components.intakeflow;
import com.intake.components.intakeflow1;
import com.intake.objectrepo.intakeLocators;


	public class intakeLogin extends BaseClass {


		public intakeflow intk = new intakeflow(pdfResultReport);
		public intakeflow1 intk1=new intakeflow1(pdfResultReport);
		public void initializeRepository() throws Exception {		
			reportDetails.put("Test Script Name", this.getClass().getSimpleName());
			reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
			reportDetails.put("Test Script Revision No", "1");
			reportDetails.put("Test Author Name", "Uma Mahesh");
			reportDetails.put("Test Script Type", "User Acceptance Testing");
			reportDetails.put("Requirement Document ID of System", "Doc1234567");
			reportDetails.put("Requirement ID", "US2202");
		}
		
		@Parameters("TestcaseNo")
		@Test(description = "Scenario:1-IntakePlatform Login")
	    public void login(String no) throws Throwable {
		  System.out.println("Entered in the test method..................");
		  try{
			  System.out.println("System directory" + System.getProperty("user.dir"));
		  pdfResultReport.readTestDataFile(System.getProperty("user.dir") + "\\Resources\\intake.xlsx", no);
		  }catch(Exception e){  		  
		  }
		  initializeRepository();
		  
		  intk.openURL();
		  waitForObj(3000);
		  
		  intk.login();
	      waitForObj(3000);
	      
	      System.out.println("::::::::::::::: Login Executed :::::::::");
	      //intk1.Entities();
	     
	      /*waitForObj(10000);
	      intk.SourceConfig();
	      waitForObj(3000);
	      
	      intk.Checkstatus();
	      waitForObj(3000);
	      
	      intk.ProcessingDashboard();
	      waitForObj(3000);
	     
	      intk.DocumentReview();
	      waitForObj(3000);
	      
	      waitForObj(6000);
		 //intk1.Entities();
	      waitForObj(3000);
	      
	      //intk1.ResourceLibrary();
	      waitForObj(3000);*/
	      waitForObj(3000);
	      intk1.Digitaldocument();
	      waitForObj(3000);
	      
	      //intk.logout();
	      //waitForObj(3000); 
		}
	}	
		
		
		
		
	
		