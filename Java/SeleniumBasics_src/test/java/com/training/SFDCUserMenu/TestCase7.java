package com.training.SFDCUserMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class TestCase7 extends TestCase6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		usermenu();
		mysettings();
		//personalsettings();
		//displaylayout();
		//email();
		calendaremainders();
	}
	
	static void mysettings()
	{
		wait(1000);
		WebElement mysettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		mysettings.click();
		String actual = driver.getTitle();
		String expected = "Hello, Sadhana Naidu! ~ Salesforce - Developer Edition";
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}
	static void personalsettings()
	{
		wait(1000);
		WebElement personal = driver.findElement(By.linkText("Personal"));
		personal.click();
		wait(500);
		WebElement loginhistory = driver.findElement(By.linkText("Login History"));
		loginhistory.click();
		wait(500);
		WebElement downloadhistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months')]"));
		downloadhistory.click();
	}
	static void displaylayout()
	{
		wait(1000);
		WebElement displayout = driver.findElement(By.id("DisplayAndLayout_font"));
		displayout.click();
		WebElement customtab = driver.findElement(By.id("CustomizeTabs_font"));
		customtab.click();
		WebElement customapp = driver.findElement(By.id("p4"));
		//custapp.click();
		Select sfchatter = new Select(customapp);
		sfchatter.selectByIndex(8);
		//sfchatter.selectByVisibleText("Salesforce Chatter");//selecting salesforce chatter
		wait(500);
		WebElement availtab = driver.findElement(By.id("duel_select_0"));//webelement below available scrol option
		Select availtaboption = new Select(availtab);
		availtaboption.selectByValue("report");//selecting reports
		WebElement tabadd = driver.findElement(By.linkText("Add"));
		tabadd.click();
	}
	static void email()
	{
		wait(500);
		WebElement Email = driver.findElement(By.id("EmailSetup_font"));
		Email.click();
		WebElement emailsettings = driver.findElement(By.id("EmailSettings_font"));
		emailsettings.click();
		wait(500);
		WebElement Emailname = driver.findElement(By.id("sender_name"));
		Emailname.sendKeys("Naidu");
		WebElement Emailaddress = driver.findElement(By.id("sender_email"));
		Emailaddress.clear();
		Emailaddress.sendKeys("mailsadhanain@yahoo.com");
		WebElement bccbuttonyes = driver.findElement(By.id("auto_bcc1"));
		bccbuttonyes.click();
		WebElement Emailsave = driver.findElement(By.xpath("//input[@class='btn primary']"));
		Emailsave.click();
	}
	static void calendaremainders()
	{
		wait(500);
		WebElement calrem = driver.findElement(By.id("CalendarAndReminders_font"));
		calrem.click();
		WebElement calremactivity = driver.findElement(By.id("Reminders_font"));
		calremactivity.click();
		WebElement testremainder = driver.findElement(By.id("testbtn"));
		testremainder.click();
		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			System.out.println(handle);
		}
		wait(2000);
		String sampleevent = driver.getTitle();
		System.out.println(sampleevent);
	}

}
