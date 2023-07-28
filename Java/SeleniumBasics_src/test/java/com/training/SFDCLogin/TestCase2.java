package com.training.SFDCLogin;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestCase2 extends Repeatedmethods{
	protected static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
	}
	protected static void launchSF() //protected coz using methods in diff package SFDCUserMenu
	{
		//to launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//to set the webpage to launch
		driver.get("https://login.salesforce.com/");
	}
	protected static void loginSF()
	{
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Myself@HomeComp.org");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Really82");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		String actual = driver.getTitle();
		String expected = "Home Page ~ Salesforce - Developer Edition";
		//Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}
	protected static void LogoutSF()
	{
		WebElement username = driver.findElement(By.id("userNavLabel"));
		username.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
	}
	

}
