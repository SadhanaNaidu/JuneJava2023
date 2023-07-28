package com.training.Contacts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase32 extends TestCase31{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Contacts();
		CheckSaveNew();
	}
	static void CheckSaveNew()
	{
		WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
		New.click();
		
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		lastname.sendKeys("Indian");
		
		Accountnamelookup();//not working 
		
		/*WebElement accountname = driver.findElement(By.id("name_lastcon2"));
		accountname.click();
		accountname.clear();
		lastname.sendKeys("Global Media");*/
		
		WebElement saveandnew = driver.findElement(By.xpath("//input[@name='save_new']"));
		saveandnew.click();
	}
	
	static void Accountnamelookup()
	{
		WebElement accountlookup = driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']"));
		accountlookup.click();
		String old = driver.getWindowHandle();
		for(String handle:driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		System.out.println(driver.getTitle());
		WebElement clickaccountname = driver.findElement(By.xpath("//table[@class='list']/tbody/tr[3]/th[1]"));
		clickaccountname.click();
		driver.switchTo().window(old);
		
	}
}
