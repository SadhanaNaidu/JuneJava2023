package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase30 extends TestCase29{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Contacts();
		CreateViewNameValidation();

	}
	static void CreateViewNameValidation()
	{
		WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createnewview.click();
		
		WebElement uniqueviewname = driver.findElement(By.id("devname"));
		uniqueviewname.sendKeys("EFCG");
		
		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		save.click();
		
		WebElement errormessage = driver.findElement(By.className("errorMsg"));
		String actual = errormessage.getText();
		
		System.out.println(actual);
	}
}
