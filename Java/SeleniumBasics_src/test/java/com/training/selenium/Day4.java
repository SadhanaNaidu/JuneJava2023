package com.training.selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class Day4 extends Day3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Launch();
		Login();
		Home();
		RegistForm();
		//switchtab();
		//selectalert();
		//windowalert();
		//acceptalert();
	}
	
	static void RegistForm()
	{
		WebElement checktext = fdriver.findElement(By.xpath("//h1[contains(text(),'Student Registration')]"));// checking if correct registration page is launchec by checking the 'text' in the page
		String actualtext = checktext.getText();
		String expectedtext = "Student Registration Form";
		
		if(expectedtext.equals(actualtext))
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
		
		WebElement selectcity = fdriver.findElement(By.id("city"));//scroll option element
		selectcity.click(); 
		 
		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		Select city = new Select(selectcity);// Object of 'Select' class is created and webelement object with scroloptin is passed
		city.selectByVisibleText("NEW DELHI");
		//city.selectByIndex(1);
		//city.selectByValue("newdelhi");
		
		WebElement selectcourse = fdriver.findElement(By.id("course"));
		selectcourse.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Select course = new Select(selectcourse);
		course.selectByIndex(2);
		//course.selectByVisibleText("MBA");
		//course.selectByValue("mba");
		}
		else
		{
			System.out.println("Wrong Registration page launched");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fdriver.quit();
		}
	}
	static void switchtab()
	{
		WebElement switchtab = fdriver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action = new Actions(fdriver); // create object of class 'Actions' and pass webelement as parameter to move the mouse over
		action.moveToElement(switchtab).build().perform(); //perfrom mouse move on the object
	}
	static void selectalert()
	{
		WebElement alert = fdriver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alert.click();
		
	}
	static void windowalert()
	{
		WebElement alertwindow = fdriver.findElement(By.xpath("//button[contains(text(),'Window Alert')]")); //for clicking on "Window alert" under alerts
		alertwindow.click();
	}
	static void acceptalert()
	{
		
		String S = fdriver.switchTo().alert().getText(); // getting the text from alert window
		System.out.println(S);
		wait(2000);
		
		fdriver.switchTo().alert().accept(); // accepting the alert window
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
