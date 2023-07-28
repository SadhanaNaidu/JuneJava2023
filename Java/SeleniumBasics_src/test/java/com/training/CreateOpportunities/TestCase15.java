package com.training.CreateOpportunities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.SFDCCreateAccount.*;

public class TestCase15 extends TestCase14{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Oppurtunities();
		checkOppurtunities();
	}
	
	static void Oppurtunities()
	{
		WebElement oppurtunities = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		oppurtunities.click();
		
		wait(1500);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
	}
		
	static void checkOppurtunities()
	{
		List<WebElement> oppurtunitiesdropdown = driver.findElements(By.id("fcf"));
		for(WebElement dropdown:oppurtunitiesdropdown)
		{
			String text = dropdown.getText();
			System.out.println(text);
		}
	}
	
	

}
