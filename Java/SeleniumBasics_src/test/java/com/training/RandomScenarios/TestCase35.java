package com.training.RandomScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase35 extends TestCase34{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Altertabs();
	}
	
	static void Altertabs()
	{
		WebElement alltabs = driver.findElement(By.className("allTabsArrow"));
		alltabs.click();
		wait(1000);
		WebElement customtabs = driver.findElement(By.className("btnImportant"));
		customtabs.click();
		wait(1000);
		WebElement selecttab2remove = driver.findElement(By.xpath("//select/option[@value='Chatter']"));
		selecttab2remove.click();
		
		WebElement remove = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
		remove.click();
		
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		
		WebElement username = driver.findElement(By.id("userNavLabel"));
		username.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		wait(1000);
		loginSF();
		System.out.println("Available tabs after removing:");
		List<WebElement> checkremovedtab = driver.findElements(By.xpath("//ul[@id='tabBar']/li/a"));
		for(WebElement element: checkremovedtab)
		{
			System.out.println(element.getText());
		}
	}

}
