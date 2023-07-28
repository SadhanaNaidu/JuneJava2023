package com.training.CreateOpportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextCase17 extends TestCase16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Oppurtunities();
		pipelinelink();
	}
	static void pipelinelink()
	{
		WebElement pipeline = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		pipeline.click();
		
		String title = driver.getTitle();
		WebElement pagetext = driver.findElement(By.xpath("//h1[contains(text(),'Opportunity Pipeline')]"));
		String text = pagetext.getText();
		System.out.println(title+"\n"+text);
	}
}
