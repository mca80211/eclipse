package com.intake.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class intakeLocators {
		WebDriver driver;
		

		public intakeLocators(WebDriver driver) {
			this.driver = driver;
		} 
		int i,j;
		
		//login
		public By username = By.xpath("//input[@type='text']");
		public By password = By.xpath("//input[@type='password']");
		public By login = By.xpath("//button[@type='submit']");
		
		//configuration
		public By configuration = By.xpath("//*[@id='menu']/li[3]/a");
		//public By configuration=By.xpath("//*[@id='menu']/li[3]/a");
		//source configuration
		public By sourceconf = By.xpath("//*[@id='demo']/li[2]/a");
		public By browsebutton =By.xpath("//*[@id='page-content-wrapper']/div/div/div/div/div/div[2]/div/form/div[1]/div/button");
		public By uploadfile = By.xpath("//button[text()='Upload']");
		public By pipeline = By.xpath("//*[@id='demo']/li[1]/a");
		public By search=By.xpath("//*[@id='search-field']");
		
		//s3 bucket
		public By selects3bucket=By.xpath(".//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[1]/div/form/div[1]/div[2]/select");
		public By save=By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[1]/div/form/div[2]/div/button");
		
		
		//email listeners
		public By name=By.xpath("//input[@placeholder='Name']");
		public By email=By.xpath("//input[@type='email']");
		public By passw=By.xpath("//input[@type='password']");
		public By subject=By.xpath("//input[@placeholder='Subject']");
		public By host=By.xpath("//input[@placeholder='Host']");
		public By number=By.xpath("//input[@type='number']");
		public By submit=By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div/div/form/div[7]/div[2]/button");
		public By reset=By.xpath("//button[text()='Reset']");
		
		
		//processing Dash Board
		public By processingdashboard = By.xpath("//*[@id='menu']/li[1]/a/span");
		public By prossfileview = By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div[1]/div/div/table/tbody/tr[1]/td[1]/span[1]");
		public By previewbutton = By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div[1]/div/div[1]/div[12]/div/button");
		//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div[1]/div/div[3]/table/tbody/tr[+"+i+"]"
		public By scrolldown=By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div[1]/div/div[3]/table/tbody/tr");
		public By backbutton = By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[2]/div/div/button");
		public By processdashboard = By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div[1]/ol/li[1]/a");
		public By selectdays =By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div[1]/div[1]/select");
		
		public By selecteddays =By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div[1]/div[1]/select/option");
		public By data=By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div[1]/div/div[3]/table/tbody/tr["+i+"]/td[2]/div[2]/div[2]/div[2]");
		
		
		
		
		//document review
		public By docreview = By.xpath("//*[@id='menu']/li[2]/a/span");
		public By docfilereview = By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[1]/span[1]");
		public By confidencescore= By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div/span[3]");
		public By selectdoc=By.xpath("//*[@id='page-content-wrapper']/div/div[1]/div/select");
		public By scrolldown1=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div");
		public By edit=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div["+i+"]/div[2]/div[2]/button[1]");
		public By clicksave=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div["+i+"]/div[2]/div[3]/button[1]");
		public By field=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div["+j+"]/div[1]/div[5]");
		
		public By completereview = By.xpath("//button[contains(text(),'Complete Review')]");
		public By confirm = By.xpath("//div[starts-with(@id,'ngdialog')]/div[2]/div[2]/div/div/button[1]");
		
		//*[@id='ngdialog1']/div[2]/div/div/div/button[2]");
		
		public By insurerstate=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div[9]/div[1]");
		public By insuredstate=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div[9]");
		public By buildingprovider=By.xpath(".//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div[1]/div[17]/div[2]/div[2]/button[1]");
		
		
		//Entites
		public By entites=By.xpath("//*[@id='demo']/li[3]/a");
		public By addentity=By.xpath("//*[@id='headingOne']/h4/a");
		public By entityname=By.xpath("//div[@id='headingOne']/following::input[1]");
		//public By synonmyms=By.xpath("//div[@id='headingOne']/following::input[2]");
		public By attributename1=By.xpath("//div[@id='headingOne']/following::input[3]");
		//public By selecttype1=By.xpath("//*[@id='accordion']/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/select");
		//public By synonmyms1=By.xpath("//div[@id='headingOne']/following::input[4]");
		//public By selecttype2=By.xpath("//*[@id='accordion']/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/select");
	    public By attributename2=By.xpath("//div[@id='headingOne']/following::input[5]");
		//public By synonmyms2=By.xpath("//div[@id='headingOne']/following::input[6]");
		public By addattribute1=By.xpath("//*[@id='accordion']/div/div[2]/div[1]/div[3]/div/div/a/span");
		public By addattribute2=By.xpath("//*[@id='accordion']/div/div[2]/div[1]/div[4]/div/div/a/span");
		public By save1=By.xpath("//*[@id='accordion']/div/div[2]/div[2]/div/div/button");
		
		//*[@id='accordion']/div/div[2]/div[1]/div[4]/div[1]/div/div[1]/input
		public By edit1=By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]/i[1]");
		
		
		
		
		
		public By office=By.xpath("//*[@id='page-content-wrapper']/div/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/a");
		public By edit11=By.xpath("//*[@id='entityviewmodal0']/div/div/div[1]/button[2]");
		
		
		
		
		
		public By addattribute3=By.xpath("//*[@id='entityeditmodal0']/div/div/div[2]/div/div/div[4]/div/div/a/span");
		public By attributename3=By.xpath("//*[@id='entityeditmodal0']/div/div/div[2]/div/div/div[4]/div[1]/div/div[1]/input");
		public By save2=By.xpath("//*[@id='entityeditmodal0']/div/div/div[3]/button");
	    
		
		//Resource Library
		public By resourcelibrary=By.xpath("//*[@id='demo']/li[4]/a");
		public By selectrlfile=By.xpath("//*[@id='type']");
		public By rlname=By.xpath("//input[@placeholder='name']");
		public By rlbrowse=By.xpath("//button[text()='Browse']");
		public By rlupload=By.xpath("//button[text()='Upload']");
		public By rldownload=By.xpath("//*[@id='page-content-wrapper']/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/a[1]/i");
		public By rldelete=By.xpath("//td[3]/a[2]/i");
		
		
		//Digital Document
		public By digitaldocument=By.xpath("//*[@id='demo']/li[5]/a");
		public By selectddfile=By.xpath("//*[@id='type']");
		public By ddname=By.xpath("//input[@type='text']");
		public By ddbrowse=By.xpath("//button[text()='Browse']");
		public By ddupload=By.xpath("//button[text()='Upload']");
		public By dddelete=By.xpath("//td[3]/a[1]/i");
		
		
		
		
		
		
		//logout
		public By logout = By.xpath("//*[@id='navbar']/ul/li/a");

	
		
		
	
	}
	