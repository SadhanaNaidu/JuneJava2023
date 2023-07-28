package com.training.selenium;

import org.apache.hc.core5.util.Asserts;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Day5 extends Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Launch();
		Login();
		//switchtab();
		//selectalert();
		//promptalert();
		//enterprompttext();
		//acceptalert();
		 //dismisswindowalert();
		interactions();
		//selectdoubleclick();
		//wait(1000);
		//doubleclick();
		
		selecttooltip();
		selectrighttooltip();
		selectlefttooltip();

	}

	
	static void dismisswindowalert() 
	{ 
		wait(3000);
	  fdriver.switchTo().alert().dismiss();
	}
	 
	static void promptalert() 
	{
		WebElement prompt = fdriver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		prompt.click();
	}

	static void enterprompttext()
	{
		wait(2000);
		fdriver.switchTo().alert().sendKeys("Myself");

		/*
		 * WebElement enteredtext = fdriver.findElement(By.id("Selenium")); //for checking if the correct content is shown on the mainm page
		 * 
		 * String actual = enteredtext.getText(); String Expected =
		 * "Hello Myself! How are you today?"; Assert.assertEquals(actual, Expected);
		 * System.out.println(actual);
		 */
	}
	static void interactions()
	{
		wait(1000);
		//WebElement interact = fdriver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		//Actions inter = new Actions(fdriver);
		//inter.moveToElement(interact).build().perform();
		fdriver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click(); //this statement is used of mouse hover 'Actions' statement
	}
	static void selectdoubleclick()
	{
		
		//WebElement dubclick = fdriver.findElement(By.xpath("//a[@href='./double-click.html']"));
		fdriver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
		 //////not able to click on double click
	}
	static void doubleclick()
	{
		WebElement doublclick = fdriver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		doublclick.click();
		Actions doubleclickact = new Actions(fdriver);
		doubleclickact.doubleClick(doublclick).build().perform();
	}
	static void selecttooltip()
	{
		WebElement tooltip = fdriver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]"));
		tooltip.click();
	}
	static void selectrighttooltip()
	{
		WebElement righttooltip = fdriver.findElement(By.xpath("//div[@class='tooltipr']"));
		Actions right = new Actions(fdriver);
		right.moveToElement(righttooltip).build().perform();
		String actual = righttooltip.getText();
		String expected = "Right";
		//Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}
	static void selectlefttooltip()
	{
		wait(1000);
		WebElement lefttooltip = fdriver.findElement(By.xpath("//div[@class='tooltipl']"));
		Actions left = new Actions(fdriver);
		left.moveToElement(lefttooltip).build().perform();
		String actual = lefttooltip.getText();
		String expected = "Left";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}
	
	

}
