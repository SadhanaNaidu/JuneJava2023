package com.training.CreateOpportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase19 extends TestCase18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Oppurtunities();
		QuarterlySummery();
	}
	static void QuarterlySummery()
	{
		WebElement interval = driver.findElement(By.id("quarter_q"));
		Select Interval = new Select(interval);
		Interval.selectByVisibleText("Current and Next FQ");
		
		WebElement include = driver.findElement(By.id("open"));
		Select Include = new Select(include);
		Include.selectByVisibleText("All Opportunities");
		
		WebElement runreport = driver.findElement(By.xpath("//input[@title='Run Report']"));
		runreport.click();
		
		String title = driver.getTitle();
		WebElement pagetext = driver.findElement(By.xpath("//h1[contains(text(),'Opportunity Report')]"));
		String text = pagetext.getText();
		System.out.println(title+"\n"+text);
	}
}
