package com.training.TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterSuite;
import com.training.Base.BaseTest;

import com.training.Pages.OppurtunitiesPage;



public class OppurtunitiesTest extends BaseTest{

		static WebDriver driver;
		String url;
		OppurtunitiesPage OP;
		String username, password;

		
		
		@BeforeMethod
		public void Beforemethod()
		{
			driver = getDriver();
			url = getvalue("qaurl");
			driver.get(url);
			OP = new OppurtunitiesPage(driver);
			driver.manage().window().maximize();
			username=getvalue("username");
			password=getvalue("password");
		}


		@Test
		public void CheckOppdropdown()
		{
			OP.EnterintoUserName(username);
			OP.EnterintoPassword(password);
			OP.ClickonLoginButton();
			OP.ClickonOppurtunities();
			OP.ClickonViewDropdown();
		}
		
		@Test
		public void NewOppurtunity()
		{
			OP.EnterintoUserName(username);
			OP.EnterintoPassword(password);
			OP.ClickonLoginButton();
			OP.ClickonOppurtunities();
			OP.ClickOnNew();
			OP.EnterMandateDetails();
			OP.SaveandValidate();
		}
		
		@Test
		public void TestPipeLineReport()
		{
			OP.EnterintoUserName(username);
			OP.EnterintoPassword(password);
			OP.ClickonLoginButton();
			OP.ClickonOppurtunities();
			OP.ClickOnOppurtunityPipeLineandValidate();
		}
		
		@Test
		public void TestStuckReport()
		{
			OP.EnterintoUserName(username);
			OP.EnterintoPassword(password);
			OP.ClickonLoginButton();
			OP.ClickonOppurtunities();
			OP.ClickOnStuckOppurtunitiesandValidate();
		}
		
		@Test
		public void QuarterlySummaryReport()
		{
			OP.EnterintoUserName(username);
			OP.EnterintoPassword(password);
			OP.ClickonLoginButton();
			OP.ClickonOppurtunities();
			OP.CheckQuarterlySummary();
		}
		@AfterSuite() 
		  public void aftermethod() 
		  { 
			  System.gc();
			 // driver.quit(); 
			 // driver=null; 
		  }



}

