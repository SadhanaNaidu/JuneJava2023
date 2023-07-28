package com.training.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait; //How to know which package to import inorder to use the class and methods


public class Day7waits extends Day6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Launch();
		Login();
		widgettab();
		autocomplete("I","India");//can change parameters here to check the output instead of hardcoding the values in code
	
		
	}
	
	

	static void widgettab()
	{
		WebElement widget = fdriver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		//explicitwait(widget,10);// maximum wait time is 10 sec, but execution will start if found before time also
		Actions selectwidget = new Actions(fdriver);
		selectwidget.moveToElement(widget).build().perform();
			
	}
	static void autocomplete(String input, String output)
	{
		WebElement autocom = fdriver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
		autocom.click();
		WebElement selectcountry = fdriver.findElement(By.id("myInput"));
		//selectcountry.sendKeys("I");
		selectcountry.sendKeys(input);
		
		List<WebElement> countrylist = fdriver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));//path for the list starting from I
		for(WebElement country:countrylist)
		{
			System.out.println(country.getText());
			//if(country.getText().equalsIgnoreCase("India"))
			if(country.getText().equalsIgnoreCase(output))
			{
				country.click();
				break;
			}
		}
		
	}

	static void implicitwait(int n)
	{
		//fdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//instead of hardcoding time we can parameterize the value
		fdriver.manage().timeouts().implicitlyWait(n,TimeUnit.SECONDS);
	}
	
	static void explicitwait(WebElement element, int n)//calling the explicit wait with webelement and time as parameter
	{
		
		WebDriverWait wait = new WebDriverWait(fdriver,n);
		wait.until(ExpectedConditions.visibilityOf(element));// waits until the webelement is found in the page and max time is n
	}
		
	static void fluentwait(WebElement element, int time)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(fdriver);
		wait.withTimeout(time,TimeUnit.SECONDS);
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
	
		
	}
	
	
}
//Implicit wait : is used in driver level, is implimented to wait for all the webelements to load, but still excutiion starts ifparticular webelement is found 

	//driver.manage().timeouts().implicitlywait(10,TimeUnit,Seconds);

//Explicit wait : is used on Element level, can call whenever an web element takes time to load, however if found starts execution immdltly instead of waiting until the max set time

//Fluent wait: is used as explicit but poll (interval) time is added,
	// checks for evry 100 milliseconds if element is found or not if found then execute if not wait again check after 100 millisec, repeat until max time set if not found

