package com.training.SFDCLogin;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
		uname.sendKeys("Myself@HomeComp.org");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Really82");
		
		WebElement rememberme = driver.findElement(By.id("rememberUn"));
		rememberme.click();
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		wait(500);
		
		WebElement username = driver.findElement(By.id("userNavLabel"));
		username.click();
		wait(500);
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		wait(1000);
		WebElement validatename = driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		String actual = validatename.getText();
		//String actualnew = validatename.getAttribute("value");
		String expected = "myself@homecomp.org";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		System.out.println("User Name displayed is: "+actual);
		
	}
	static void wait(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
