package com.training.CreateOpportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase16 extends TestCase15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Oppurtunities();
		createnewopp();
	}
	static void createnewopp()
	{
		WebElement createnew = driver.findElement(By.xpath("//input[@name='new']"));
		createnew.click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement text = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		String pagetext =  text.getText();
		System.out.println(pagetext);
				
	}

}
