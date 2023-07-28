package com.training.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestCase4B {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		wrongloginSF();
	}
	static void launchSF()
	{
		//to launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//to set the webpage to launch
		driver.get("https://login.salesforce.com/");
	}

	static void wrongloginSF()
	{
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		WebElement error = driver.findElement(By.id("error"));
		String actual = error.getText();
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}
	}


