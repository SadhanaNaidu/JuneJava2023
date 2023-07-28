package com.training.CreateOpportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase18 extends TextCase17{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Oppurtunities();
		stuckoppurtunities();
	}
	static void stuckoppurtunities()
	{
		WebElement stuckoppurlink = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		stuckoppurlink.click();
		
		String title = driver.getTitle();
		WebElement pagetext = driver.findElement(By.xpath("//h1[contains(text(),'Stuck Opportunities')]"));
		String text = pagetext.getText();
		System.out.println(title+"\n"+text);
	}
}

