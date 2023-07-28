package com.training.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Day6 extends Day5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Launch();
		Login();
		//interactions();
		switchtab();
		windows();
	}
	
	static void windows()
	{
		wait(1000);
		WebElement windows = fdriver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		windows.click();
		WebElement newtab = fdriver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
		newtab.click();
		String parent = fdriver.getTitle();
		String parentid = fdriver.getWindowHandle();// returns the id of the parent window
		System.out.println(parent);
		for(String where: fdriver.getWindowHandles())//iterates through all open windows and 
		{
			fdriver.switchTo().window(where);//ofcus remians on last open window(child)
		}
		wait(2000);
		String childid = fdriver.getTitle();
		System.out.println(childid);
		WebElement newtext = fdriver.findElement(By.id("APjFqb"));
		newtext.sendKeys("Hello");
				
		fdriver.switchTo().window(parentid);//usedto switch back to parent window
		
	}
	static void dragdrop()
	{
		WebElement draganddrop = fdriver.findElement(By.xpath("//a[contains(text(),'Drag & Drop')]"));
		draganddrop.click();
		
		// 
	}
}
