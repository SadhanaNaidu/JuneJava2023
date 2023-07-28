package com.training.Contacts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.training.Leads.*;

public class TestCase25 extends TestCase24{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
		Contacts();
		ContactsNew();

	}
	static void Contacts()
	{
		
		WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contacts.click();
		
		wait(3000);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	static void ContactsNew()
	{
		WebElement contactsnew = driver.findElement(By.xpath("//input[@title='New']"));
		contactsnew.click();
		
		wait(1000);
		WebElement LastName = driver.findElement(By.id("name_lastcon2"));
		LastName.sendKeys("Indian");
		
		WebElement accountname = driver.findElement(By.id("con4"));
		accountname.sendKeys("Naidu");
		wait(1000);
		WebElement savebutton = driver.findElement(By.xpath("//input[@title='Save']"));
		savebutton.click();
		String title = driver.getTitle();
		WebElement text = driver.findElement(By.xpath("//h2[@class='topName']"));
		String actual = text.getText();
		WebElement validate = driver.findElement(By.xpath("//div[@id='con2_ileinner']"));
		System.out.println(title+"\n"+"\n"+actual);
	}

}
