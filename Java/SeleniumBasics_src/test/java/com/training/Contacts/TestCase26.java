package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestCase26 extends TestCase25{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		Contacts();
		CreateNewView();
	}

	static void CreateNewView()
	{
		WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createnewview.click();
		wait(500);
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("New View3");
		
		WebElement uniqueviewname = driver.findElement(By.id("devname"));
		uniqueviewname.click();//clicking because SF generates the uniwue name
		
		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		save.click();
		
		WebElement validateview = driver.findElement(By.xpath("//select/option[@selected='selected'] "));
		String actual = validateview.getText();
		String expected = "New View3";
		Assert.assertEquals(actual, expected);
		System.out.println(actual+"\n"+expected);
		
	}
}
