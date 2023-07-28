package com.training.RandomScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestCase34 extends TestCase33{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Hometab();
		EditLastName();
	}
	
	static void EditLastName()
	{
		WebElement username = driver.findElement(By.xpath("//h1/a[contains(text(),'Sadhan')]"));
		username.click();
		
		WebElement edit = driver.findElement(By.xpath("//img[@alt='Edit Profile']"));
		edit.click();
		
		WebElement editprofileframe = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));//edit profile popu[ is frame
		driver.switchTo().frame(editprofileframe);
		
		WebElement editabout = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		editabout.click();
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("ABCD");
		
		WebElement saveall = driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
		
		String title = driver.getTitle();
		String pagetext = driver.findElement(By.id("tailBreadcrumbNode")).getText().strip();
		String profilename = driver.findElement(By.id("userNavLabel")).getText().strip();
		Assert.assertEquals(pagetext, profilename);
		System.out.println("Last Name updated");

	}

}
