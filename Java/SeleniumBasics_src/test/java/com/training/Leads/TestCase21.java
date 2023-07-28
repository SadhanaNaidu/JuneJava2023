package com.training.Leads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase21 extends TestCase20{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
		Leads();
		leadsdropdown();
	}
	static void leadsdropdown()
	{
		WebElement dropdown = driver.findElement(By.id("fcf"));
		dropdown.click();
		
		List<WebElement> dropdownleads = driver.findElements(By.xpath("//select[@id='fcf']/option"));
		for(WebElement element: dropdownleads)
		{
			String text = element.getText();
			System.out.println(text);
		}

	}

}
