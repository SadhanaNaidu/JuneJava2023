package com.training.TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;
import com.training.Pages.LoginPage;




public class LoginTest extends BaseTest{
	
	//LoginPage loginpage = new LoginPage(); //creating object of loginpage here so we can call the methods(actions) defined in loginpage
	LoginPage loginpage;
	BasePage basepage;
	static WebDriver driver;
	String url;
	String username;
	String password;
	String actual;
	String expected1_Error = "Please enter your password.";
	WebElement Error;
	WebElement Validate;
	String expected3_Validate = "myself@homecomp.org";
	String expected5_Error = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	String Uname;
	String wrongusername;
	String wrongpassword;
	WebElement Pagetext;
	String expected4_Pagetext = "Check Your Email";
	
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		//driver.get("https://login.salesforce.com/ ");
		//url = geturl("Qaurl");//instead of hardcording url, we can fetch it from application.properties file through CommonUtilities.java
		//username = getusername("username");//to get more values more methods should be created so making one common method to read file is getvalue("key")
		//password = getpassword("password");
		url = getvalue("qaurl");
		username = getvalue("username");
		password = getvalue("password");
		Uname = getvalue("username");
		wrongusername = getvalue("wrongusername");
		wrongpassword = getvalue("wrongpassword");
		driver.get(url);
		loginpage = new LoginPage(driver);//parameterized constructor 
		driver.manage().window().maximize();
		
		
		
	}

	@Test(priority = 1)
	//@Parameters({"Username"})
	public void CheckLoginError()
	{
		loginpage.EnterintoUserName(username);
		loginpage.ClearPassword();
		loginpage.ClickonLoginButton();
		loginpage.wait(1000);
		//loginpage.gettext(Error,expected1_Error);
	}

@Test(priority = 2)
	//@Parameters({"Username", "Password"})
	public void LogintintoApplication()
	{
		loginpage.EnterintoUserName(username); //actions defined in loginpage
		loginpage.EnterintoPassword(password);
		loginpage.ClickonLoginButton();
		loginpage.GetTitle();
	}
	
	@Test(priority = 3)
	public void Testrememberme()
	{
		loginpage.EnterintoUserName(username); //actions defined in loginpage
		loginpage.EnterintoPassword(password);
		loginpage.ClickonRememberMe();
		loginpage.ClickonLoginButton();
		loginpage.ClickonUserName();
		loginpage.ClickonLogout();
		//loginpage.gettext(Validate, expected3_Validate);
	}
	
	@Test(priority = 4)
	public void Forgotpass()
	{
		loginpage.ForgotPassword();
		loginpage.EnterUname(Uname);
		loginpage.ClickContinue();
		//loginpage.gettext(Pagetext, expected4_Pagetext);
		
	}
	
	@Test(priority = 5)
	public void ValidateLoginError()
	{
		loginpage.EnterintoUserName(wrongusername); 
		loginpage.EnterintoPassword(wrongpassword);
		loginpage.ClickonLoginButton();
		//loginpage.gettext(Error, expected5_Error);	
	}
	
	
	  @AfterSuite() 
	  public void aftermethod() 
	  { 
	  	//takescreenshot(driver);
		  System.gc();
		driver.quit(); 
		driver=null; 
	  }
	 
	
	
}
