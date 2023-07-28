package com.training.SFDCLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
	}
	static void launchSF()
	{
		//to launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//to set the webpage to launch
		driver.get("https://login.salesforce.com/");
	}
	static void loginSF()
	{
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		WebElement error = driver.findElement(By.id("error"));//for checking the error message in th login page
		String actual = error.getText();
		String expected = "Please enter your password.";
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}

}