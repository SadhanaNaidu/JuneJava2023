package com.training.RandomScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.training.Contacts.*;

public class TestCase33 extends TestCase32{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Hometab();
		VerifyUserName();
	}
	
	static void Hometab()
	{
		WebElement hometab = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		hometab.click();
		wait(3000);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
	}
	
	static void VerifyUserName()
	{
		WebElement username = driver.findElement(By.xpath("//h1/a[contains(text(),'Sadhan')]"));
		username.click();
		
		String title1 = driver.getTitle();
		wait(200);
		WebElement profiletab = driver.findElement(By.className("brandPrimaryFgr"));
		profiletab.click();
		
		String title2 = driver.getTitle();
		Assert.assertEquals(title1, title2);
		System.out.println("Profile window is displayed");
		
	}

}
