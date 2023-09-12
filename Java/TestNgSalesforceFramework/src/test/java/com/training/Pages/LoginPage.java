package com.training.Pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.Base.BasePage;

public class LoginPage extends BasePage{
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement LoginButton;
	
	@FindBy(id="error")
	WebElement Error;
	
	@FindBy(id="rememberUn")
	WebElement Rememberme;
	
	@FindBy(id="userNavLabel")
	WebElement Username;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath="//span[@id='idcard-identity']")
	WebElement Validate;
	
	@FindBy(id="forgot_password_link")
	WebElement Forgotpass;

	@FindBy(id="un")
	WebElement Uname;
	
	@FindBy(id="continue")
	WebElement Contbutton;
	
	@FindBy(id="header")
	WebElement Pagetext; 
	
	

	public void EnterintoUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void EnterintoPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClearPassword() 
	{ 
		Password.clear();
	}
	public void ClickonRememberMe()
	{
		Rememberme.click();
	}
	
	public void ClickonLoginButton() 
	{ 
	  LoginButton.click(); 
	}
	public void gettext(WebElement element, String expected)
	{
		//element= driver.findElement(By.id("error"));
		wait(2000);
		String actual = element.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		//if(actual.equals(expected))
		System.out.println(actual);
	}
	public void ClickonUserName()
	{
		Username.click();
	}
	public void ClickonLogout()
	{
		Logout.click();
	}
	
	public void wait(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ForgotPassword() 
	{
		Forgotpass.click();
	}
	public void EnterUname(String Username) //passing username value only from properties file
	{
		Uname.sendKeys(Username);
	}

	public void ClickContinue()
	{
		Contbutton.click();
	}
	
	public void GetTitle()
	{
		wait(2000);
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	 
}
