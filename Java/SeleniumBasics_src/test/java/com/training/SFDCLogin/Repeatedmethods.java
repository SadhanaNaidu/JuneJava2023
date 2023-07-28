package com.training.SFDCLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait; //How to know which package to import inorder to use the class and methods
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repeatedmethods {
	static WebDriver driver;
	
	protected static void wait(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected static void implicitwait(int n)
	{
		//fdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//instead of hardcoding time we can parameterize the value
		driver.manage().timeouts().implicitlyWait(n,TimeUnit.SECONDS);
	}
	
	protected static void explicitwait(WebElement element, int n)//calling the explicit wait with webelement and time as parameter
	{
		
		WebDriverWait wait = new WebDriverWait(driver,n);
		wait.until(ExpectedConditions.visibilityOf(element));// waits until the webelement is found in the page and max time is n
	}
		
	protected static void fluentwait(WebElement element, int time)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(time,TimeUnit.SECONDS);
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}


