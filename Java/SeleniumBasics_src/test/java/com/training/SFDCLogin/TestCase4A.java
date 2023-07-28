package com.training.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4A extends Repeatedmethods{

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		Forgotpass();
	}
	static void launchSF()
	{
		//to launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//to set the webpage to launch
		driver.get("https://login.salesforce.com/");
	}
		
	static void Forgotpass()
	{
		
		WebElement forgotpass = driver.findElement(By.id("forgot_password_link"));
		forgotpass.click();
		
		WebElement uname = driver.findElement(By.id("un"));
		uname.sendKeys("Myself@HomeComp.org");
		
		WebElement contbutton = driver.findElement(By.id("continue"));
		contbutton.click();

		String title = driver.getTitle();
		WebElement pagetext  = driver.findElement(By.id("header")); 
		String text = pagetext.getText();
		System.out.println("Page Title: "+title);
		System.out.println("Page Text: "+text);
	}

}
