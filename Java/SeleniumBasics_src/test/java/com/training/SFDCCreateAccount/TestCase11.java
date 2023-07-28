package com.training.SFDCCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase11 extends TestCase10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		accounts();
		createnewaccountview();
	}
	
	static void createnewaccountview()
	{
		wait(500);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
		
		WebElement createview = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		createview.click();
		
		WebElement createviewtext = driver.findElement(By.xpath("//h2[contains(text(),'Create New')]"));
		String pagetext = createviewtext.getText();
		System.out.println(pagetext);
		
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("New View");
		
		WebElement uniqueviewname = driver.findElement(By.id("devname"));
		uniqueviewname.click();
		uniqueviewname.clear();
		uniqueviewname.sendKeys("UniqueNewView");
		
		WebElement saveview = driver.findElement(By.xpath("//input[@name='save']"));
		saveview.click();
		
		WebElement listview = driver.findElement(By.id("fcf"));
		listview.click();
		String newview = listview.getAttribute("value");
		System.out.println(newview);
	}

}
