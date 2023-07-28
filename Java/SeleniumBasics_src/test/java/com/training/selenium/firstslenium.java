package com.training.selenium;

import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstslenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//WebDriver driver = new ChromeDriver();

		
		  WebDriverManager.chromedriver().setup();// sets the environment to launch  chromebrowser
		  WebDriver driver = new ChromeDriver(); // to launch the chrome browser, an instance 'driver' of ChromeDriver() class that extends interface  'WebDriver' is created
		  
		 
		 		
		driver.get("https://login.salesforce.com"); // get() method under ChromeDriver() is used to set the URL path
		
		WebElement Username = driver.findElement(By.id("username")); //inspect and get id for element username and assign it to 'Username'
		Username.sendKeys("myloginusername");// findElement return type is WebElement, so variable of webElement is created to return the value
		
		WebElement Password = driver.findElement(By.id("password")); //inspect and get id for element "password"
		Password.sendKeys("myloginpassword");
		
		WebElement login = driver.findElement(By.id("Login")); //inspect and get id for element login button
		login.click();
		
		driver.quit();
		
		
	}

}
