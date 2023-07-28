package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day3 extends Day2{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Launch();
		Login();
		Home();
		RegistForm();
	}
	
	static void RegistForm()
	{
		WebElement name = fdriver.findElement(By.id("name"));
		name.sendKeys("Sadhana");
		WebElement fathername = fdriver.findElement(By.id("lname"));
		fathername.sendKeys("Naidu");
		WebElement postal = fdriver.findElement(By.id("postaladdress"));
		postal.sendKeys("Postal address");
		WebElement personal = fdriver.findElement(By.id("personaladdress"));
		personal.sendKeys("Personal address");
		//selecting gender as female
		WebElement femalegender = fdriver.findElement(By.xpath("//input[@value='female']"));
		femalegender.click();
		
		
	}

}
