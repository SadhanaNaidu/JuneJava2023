package com.training.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase24 extends TestCase23{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		Leads();
		NewLead();
	}
	
	static void NewLead()
	{
		WebElement newlead = driver.findElement(By.xpath("//input[@value=' New ']"));
		newlead.click();
		
		WebElement lastname = driver.findElement(By.id("name_lastlea2"));
		lastname.sendKeys("ABCD ABCD");
		
		WebElement company = driver.findElement(By.id("lea3"));
		company.sendKeys("ABCD ABCD");
		
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		
		String title = driver.getTitle();
		WebElement textonpage = driver.findElement(By.xpath("//h2[@class='topName']"));
		String text = textonpage.getText();
		System.out.println(title+"\n"+text);
		
	}

}
